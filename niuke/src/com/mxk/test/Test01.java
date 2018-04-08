package com.mxk.test;

import java.util.*;
import java.util.LinkedList;

public class Test01 {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// LinkedList<String> list=new LinkedList<>();
		// list.add("aa");
		// list.add("bb");
		// list.add("cc");
		// Iterator<String> iter=list.iterator();
		// iter.remove();
		//// iter.next();
		//// iter.next();
		//// iter.next();
		//
		// boolean b=iter.hasNext();
		//// iter.next();
		//// iter.next();
		// //String s=iter.next();
		// System.out.println("list:"+list);
		Test01 t = new Test01();
		int res = t.Lastremainednum(6, 2);
		int sum=t.Sum_Solution(100);
		
		System.out.println("sum:" + sum);

	}

	// 约瑟夫环算法，n个小孩(0，n-1)，从0数到m-1,第m-1个数退出，循环进行，求最后剩余的
	public int Lastremainednum(int n, int m) {
		int res = 0;
		if (n < 2 || m < 0)
			return -1;
		int count = n; // 记录被剔除元素的个数
		int[] array = new int[n]; // 存放这n个数，每次剔除就将array[i]=-1;
		int i = -1; // 标记如果大于等于n的话就归0，模拟环结构
		int step = 0; // 标记步数，走m步就删除一个元素
		while (count > 0) {
			i++;
			if (i >= n) // 将i=0,就防止array[i]越界
				i = 0;
			if (array[i] == -1) { // 跳过已经
				continue;
			}
			step++;
			if (step == m) {
				array[i] = -1;
				System.out.println("i:" + i);
				step = 0;
				count--;
			}
		}
		return i;
	}

	public int Lastremainednum1(int n, int m) {
		int res = 0;
		// 先构造一个linkedlist,存放这n个数
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		int tempindex = (m - 1) % n; // 第一个应该删除的元素的坐标
		while (list.size() > 1) {
			list.remove(tempindex);
			tempindex = (tempindex + m - 1) % list.size();
		}
		return list.get(0);
	}

	public int Sum_Solution(int n) {
		int sum = n;
		boolean ans = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
		return sum;
	}

}
