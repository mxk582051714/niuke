/**
 * @author HWLUO
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,
 */

package com.mxk.niuke1;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();
		int[] input = { 1, 5, 3, 2, 67, 234 };
		test.maopaoSort(input);
		System.out.println(Arrays.toString(input));
		
		ArrayList<Integer> res = new ArrayList<>();
		res = test.GetLeastNumbers_Solution(input, 2);
		System.out.println(res);
	}

	/*
	 * public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	 * ArrayList<Integer> res=new ArrayList<>(); if(input==null||input.length==0)
	 * return res; if(input.length<k) return res; //�Ƚ�n�������� Arrays.sort(input);
	 * for(int i=0;i<k;i++) res.add(input[i]);
	 * 
	 * return res; }
	 */

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		if (k > input.length) {
			return al;
		}
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] < input[j + 1]) {    //�Ӵ�С�������һ��ѭ����������ĩβȷ����Сֵ
												  //���ѭ��k�Σ�Ҳ����ȷ��������ĩβȷ����С��k����
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
			al.add(input[input.length - i - 1]);
		}
		return al;
	}
	//ʵ��һ��ð��
	public void maopaoSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {  			//�����ѭ��len-1��,��Ϊ�Ƚ�5��������ֻ��Ҫ�Ƚ��Ĵ�
			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]){          //��С�����������һ��ѭ����������ĩβȷ�����ֵ
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
				if(arr[j]<arr[j+1]){          //�Ӵ�С�������һ��ѭ����������ĩβȷ����Сֵ
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

}
