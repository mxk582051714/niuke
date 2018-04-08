/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
package com.mxk.niuke2;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test02 t=new Test02();
		int num[]= {1,2,3,2,1,5,6,5};
		Map<Integer,Integer> numtime_map=new HashMap<>();
//		numtime_map.put(1, 2);
//		numtime_map.get(1)++;
		
		
		
		int num1[]=new int[1];
		int num2[]=new int[1];
		System.out.println("aa");
		t.FindNumsAppearOnce(num, num1, num2);
	}

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		Map<Integer,Integer> numtime_map=new HashMap<>();
		for(int i=0;i<array.length;i++) {
			int num=array[i];
			if(numtime_map.containsKey(num)) {
				int time=numtime_map.get(num);
				time++;
				numtime_map.put(num, time);
			}else {
				numtime_map.put(num, 1);
			}
		}
		int num[]=new int[2];
		int k=0;
		for (Map.Entry<Integer, Integer> entry : numtime_map.entrySet()) {  
			if(entry.getValue()==1) {
				num[k++]=entry.getKey();
			}
			if(k==2)
				break;
		} 
		num1[0]=num[0];
		num2[0]=num[1];
		System.out.println(num[0]+" aaa "+num[1]);
	}

}
