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

	// Լɪ���㷨��n��С��(0��n-1)����0����m-1,��m-1�����˳���ѭ�����У������ʣ���
	public int Lastremainednum(int n, int m) {
		int res = 0;
		if (n < 2 || m < 0)
			return -1;
		int count = n; // ��¼���޳�Ԫ�صĸ���
		int[] array = new int[n]; // �����n������ÿ���޳��ͽ�array[i]=-1;
		int i = -1; // ���������ڵ���n�Ļ��͹�0��ģ�⻷�ṹ
		int step = 0; // ��ǲ�������m����ɾ��һ��Ԫ��
		while (count > 0) {
			i++;
			if (i >= n) // ��i=0,�ͷ�ֹarray[i]Խ��
				i = 0;
			if (array[i] == -1) { // �����Ѿ�
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
		// �ȹ���һ��linkedlist,�����n����
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		int tempindex = (m - 1) % n; // ��һ��Ӧ��ɾ����Ԫ�ص�����
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
