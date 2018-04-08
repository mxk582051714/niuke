package com.mxk.niuke1;

import java.util.*;

public class Test6_1 {
	public static void main(String[] args) {
		Test6_1 test = new Test6_1();
		int ch = 'a';
		int ch1 = 'A';

		System.out.println("ch:" + ch + "CH1" + ch1);
		String str = "ababccdd";
		int index = test.FirstNotRepeatingChar(str);
		System.out.println("index=" + index);

	}

	public int FirstNotRepeatingChar(String str) {
		if (str == null || str.trim().length() == 0)
			return -1;
		char [] arr=str.toCharArray();
		int [] time=new int['z'+1];
		for(char ch:arr) {
			time[(int)(ch)]++;
		}
		for(int i=0;i<arr.length;i++) {
			int value=time[(int)arr[i]];
			if(value==1)
				return i;
		}
		
		return -1;
		
		
	}

}
