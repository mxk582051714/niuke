/**
 * @author HWLUO
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
 */

package com.mxk.niuke1;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();
		int[] input = { 1, 5, 3, 2, 67, 234 };
		test.maopaoSort(input);
		System.out.println(Arrays.toString(input));
		
		ArrayList<Integer> res = new ArrayList<>();
		res = test.GetLeastNumbers_Solution(input, 2);
		System.out.println(res);
	}

	/*
	 * public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	 * ArrayList<Integer> res=new ArrayList<>(); if(input==null||input.length==0)
	 * return res; if(input.length<k) return res; //先将n个数排序 Arrays.sort(input);
	 * for(int i=0;i<k;i++) res.add(input[i]);
	 * 
	 * return res; }
	 */

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		if (k > input.length) {
			return al;
		}
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] < input[j + 1]) {    //从大到小排序，外层一次循环，在数组末尾确定最小值
												  //外层循环k次，也就是确定在数组末尾确定最小的k个数
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
			al.add(input[input.length - i - 1]);
		}
		return al;
	}
	//实现一个冒泡
	public void maopaoSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {  			//最外层循环len-1次,因为比较5个数排序，只需要比较四次
			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]){          //从小到大排序，外层一次循环，在数组末尾确定最大值
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
				if(arr[j]<arr[j+1]){          //从大到小排序，外层一次循环，在数组末尾确定最小值
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

}
