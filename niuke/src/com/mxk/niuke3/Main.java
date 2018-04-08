package com.mxk.niuke3;

import java.util.ArrayList;


public class Main {
	
	
	public static void main(String[] args) {
		String str = "abcd";
		Main main=new Main();
		generate(str.toCharArray(), 0);
//		ArrayList<String> list=	main.Permutation(str);
//		for(String s:list) {
//			System.out.println(s);
//		}
	}
	private static int count=0;
	private static void generate(char[] charArray, int begin) {
		if (begin == charArray.length - 1) {
			count++;
			System.out.print(count + " ");
			System.out.println(charArray);
			return;
		}
		for (int i = begin; i < charArray.length; i++) {
			swap(charArray, begin, i); 			// 交换begin和i位置的元素
			generate(charArray, begin + 1);
			swap(charArray, begin, i);
		}
	}

	private static void swap(char[] strArray, int i, int j) {
		char temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
	}
}
