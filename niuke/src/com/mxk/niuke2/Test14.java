package com.mxk.niuke2;

import java.util.Arrays;

import com.mxk.test.Test;

public class Test14  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test14 t=new Test14();
		int [] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		int [] copy=arr.clone();
		copy[0]=4;
//		copy[1]=1;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		
	}
//	public boolean match(char[] str, char[] pattern)
//  {
//        
//  }
	
	

}
