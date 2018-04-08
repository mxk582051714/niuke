package com.mxk.数组.数组1;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 a=new Array1();
		int [] arr= {5,0,4,0,7,2};
		function(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void function(int [] arr) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				index++;
				arr[index]=arr[i];
			}
		}
		for(int i=index+1;i<arr.length;i++) {
			arr[i]=0;
		}
	}

}
