/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 */

package com.mxk.niuke3;

import java.util.*;

public class Test9_4 {

	public static void main(String[] args) {
		Test9_4 t = new Test9_4();
		t.Insert(5);
		t.Insert(1);
		t.Insert(2);
		t.Insert(4);
		double mid=t.GetMedian();
		System.out.println("mid:"+mid);

	}

	private int count = 0;
	//С�����д��Ұ������������Ҫ�������
	//������д�������
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});

	public void Insert(Integer num) {
		
		if(count%2==0) {
			//��������ż����Ԫ�أ���ô��Ԫ�ؾͷŵ��󶥶��У���֮ǰ��Ҫ����
			minHeap.offer(num);
			int num1=minHeap.poll();
			maxHeap.offer(num1);
			
			
		}else {
			maxHeap.offer(num);
			int num1=maxHeap.poll();
			minHeap.offer(num1);
		}
		count++;
	}

	public Double GetMedian() {
		double mid=0;
		if(count%2==0) {
			mid=((double)maxHeap.peek()+(double)minHeap.peek())/2;
		}else {
			mid=maxHeap.peek();
		}
		
		return mid;	
	}

}
