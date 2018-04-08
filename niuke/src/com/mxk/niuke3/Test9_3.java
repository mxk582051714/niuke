/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 */

package com.mxk.niuke3;

import java.util.*;

public class Test9_3 {

	public static void main(String[] args) {
		Test9_3 t = new Test9_3();
		t.Insert(5);
		t.Insert(1);
		t.Insert(2);
		t.Insert(4);
		double mid=t.GetMedian();
		System.out.println("mid:"+mid);

		
//		System.out.println(Arrays.toString(arr));

	}

	private int count = 0;
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});

	public void Insert(Integer num) {
		if (count % 2 == 0) {
			// ����������Ϊż��ʱ���¼����Ԫ�أ�Ӧ������С����
			// ��ע�ⲻ��ֱ�ӽ���С���ѣ����Ǿ������ɸѡ��ȡ����������Ԫ�ؽ���С���ѣ�
			// 1.�¼����Ԫ�����뵽����ѣ��ɴ����ɸѡ����������Ԫ��
			maxHeap.offer(num);
			int filteredMaxNum = maxHeap.poll();
			// 2.ɸѡ��ġ�������е����Ԫ�ء�����С����
			minHeap.offer(filteredMaxNum);
		} else {
			// ����������Ϊ����ʱ���¼����Ԫ�أ�Ӧ����������
			// ��ע�ⲻ��ֱ�ӽ������ѣ����Ǿ�С����ɸѡ��ȡС���������Ԫ�ؽ������ѣ�
			// 1.�¼����Ԫ�����뵽С���ѣ���С����ɸѡ��������С��Ԫ��
			minHeap.offer(num);
			int filteredMinNum = minHeap.poll();
			// 2.ɸѡ��ġ�С�����е���СԪ�ء���������
			maxHeap.offer(filteredMinNum);
		}
		count++;
	}

	public Double GetMedian() {
		if (count % 2 == 0) {
			return new Double((minHeap.peek() + maxHeap.peek())) / 2;
		} else {
			return new Double(minHeap.peek());
		}
	}

}
