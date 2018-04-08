/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
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
	//小根堆中存右半边数，所有数要大于左边
	//大跟堆中存左半边数
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});

	public void Insert(Integer num) {
		
		if(count%2==0) {
			//容器中有偶数个元素，那么该元素就放到大顶堆中，放之前需要处理
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
