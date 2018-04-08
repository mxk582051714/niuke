package com.mxk.niuke1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test4_1 {
	public static void main(String[] args) {
		Test4_1 test=new Test4_1();
//		int [] numarr= {3,32,321};
//		String res=test.PrintMinNumber(numarr);
//		System.out.println(res);
		
		String s1="341";
		String s2="332";
		int x=s1.compareTo(s2);
		System.out.println("x="+x);
	}
	
	
	
	public String PrintMinNumber(int[] numbers) {
		int n;
		String s = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		n = numbers.length;
		for (int i = 0; i < n; i++) {
			list.add(numbers[i]);

		}
		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer str1, Integer str2) {
				String s1 = str1 + "" + str2;
				String s2 = str2 + "" + str1;
				return s1.compareTo(s2);
			}
		});

		for (int j : list) {
			s += j;
		}
		return s;
	}
}