/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 */

package com.mxk.niuke3;
import java.util.*;
public class Test9_2 {
	
	
	
	public static void main(String[] args) {
		Test9_2 t=new Test9_2();
		t.Insert(5);
		t.Insert(1);
		t.Insert(2);
		t.Insert(4);
		
		PriorityQueue< Integer> minHeap=new PriorityQueue<>();
		PriorityQueue< Integer> maxHeap=new PriorityQueue<>(20, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			};
			
		});
		minHeap.offer(5);
		minHeap.offer(3);
		minHeap.offer(8);
		minHeap.offer(-4);
		minHeap.offer(6);
		
		maxHeap.offer(5);
		maxHeap.offer(3);
		maxHeap.offer(8);
		maxHeap.offer(-4);
		maxHeap.offer(6);
		int maxnum=maxHeap.poll();
		System.out.println(maxnum);
		int maxnum1=maxHeap.poll();
		System.out.println(maxnum1);
		
		int num=minHeap.poll();
		System.out.println(num+"   "+minHeap.size());
		
		
		
		//double mid=t.GetMedian();
//		System.out.println("mid:"+mid);
		
		int [] arr= {5,1,2,4,3,10,7,-1,78,-6};
//		t.insertSort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int [] arr1= {50,10,90,30,70,40,2,6,11};
		t.heapSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	ArrayList<Integer> list=new ArrayList<>();
	public void Insert(Integer num) {
		
	}

//	public Double GetMedian() {
//		
//	}
	
	//��������
	public void insertSort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			//Ĭ�ϵ�һ���Ѿ��ź�
			if(arr[i-1]>arr[i]) {
				int temp=arr[i];
				int j=0;
				for( j=i;j>0&&arr[j-1]>temp;j--) {
					arr[j]=arr[j-1];
				}
				arr[j]=temp;
			}
		}
	}
	
	//�����󶥶�
	public void heapAdjust(int [] arr) {
		for(int i=arr.length/2-1;i>=0;i--) {
			headp(arr,i,arr.length);
		}
	}
	public void headp(int [] arr,int s,int len) {
		int temp=arr[s];  					 //������ĸ��ڵ�
		for(int j=2*s+1;j<len-1;j=2*j+1) {
			if(arr[j]<arr[j+1]) {
				j++;               //j��¼����һ���������ֵ
			}
			if(temp>arr[j])        //�����ڵ�������ֵ����ô�Ͳ��øı���
				break;       
			arr[s]=arr[j];
			s=j;
		}
		arr[s]=temp;
	}
	//ʵ�ֶ�����
	public void heapSort(int [] arr) {
		heapAdjust(arr);   //�����󶥶�
		
		//ʵ������
		for(int i=arr.length-1;i>0;i--) {
			if(arr[0]>arr[i]) {
				int temp=arr[0];
				arr[0]=arr[i];
				arr[i]=temp;  
			}
			        //���һ��Ԫ�غ͵�һ��Ԫ�ص���λ��
			//�ع��󶥶�
			headp(arr,0,i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
