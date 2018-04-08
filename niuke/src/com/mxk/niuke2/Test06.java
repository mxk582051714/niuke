package com.mxk.niuke2;

import java.util.Arrays;

import com.mxk.test.Test;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i am a student";
		Test06 t = new Test06();
		String s = t.ReverseSentence(str);
		System.out.println(s);
		
		System.out.println(getMax(-90,-45));

	}

	public String ReverseSentence(String str) {
		if (str == null || str.length() == 0)
			return "";
		String newstr=str.trim();
		if (newstr.equals(""))
			return str;
		String[] strarr = newstr.split(" ");
		System.out.println(Arrays.toString(strarr)+"  "+strarr[0]);
		
		StringBuilder sb = new StringBuilder();
		for(int i=strarr.length-1;i>-1;i--) {
			sb.append(strarr[i]);
			if(i>0)
				sb.append(" ");
		}
		String s = new String(sb);
		return s;

	}
	
	
	public static int sign(int n) {
		n=n>>31;
		n=n&1;
		return n^1;
	}
	public static int getMax(int a,int b) {
		int c=a-b;
		int sca=sign(c);
		int scb=sca^1;   //sca是0，则scb=1，二者总相反
		
		return sca*a+scb*b;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
