package com.mxk.niuke2;

import java.util.*;

public class Test08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test08_2 t = new Test08_2();
		t.LastRemaining_Solution(6, 8);
	}

	public int LastRemaining_Solution(int n, int m) {
		if (n == 0)
			return -1;
		LinkedList<Integer> array =new LinkedList<>(); 
		for (int i = 0; i < n; i++) {  //将数字一次存入list中
			array.add(i);
		}
		int tempIndex = (m - 1) % array.size();// 用于记录最初需清除的数字索引
		while (array.size() != 1) {
			// System.out.println(array.get(tempIndex));
			array.remove(tempIndex);
			tempIndex = (tempIndex + (m - 1)) % array.size();// 记录当前索引
		}
		return array.get(0);
	}

}
