package com.mxk.niuke2;
import java.util.*;
public class Test04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test04_1 t=new Test04_1();
		ArrayList<Integer> reslist=new ArrayList<>();
		int [] array= {1,2,4,5,7,16};
		int sum=9;
		reslist=t.FindNumbersWithSum(array, sum);
		System.out.println("结果："+reslist);
	}
	//分析：要找乘积最小的，那么只要找到两个数的差最大的就可以了
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> reslist=new ArrayList<>();
		int i=0;
		int j=array.length-1;
		while(i<j) {
			if(array[i]+array[j]==sum) {
				reslist.add(array[i]);
				reslist.add(array[j]);
				break;
			}else if(array[i]+array[j]>sum) {
				j--;
			}else {
				i++;
			}
		}
		return reslist;
    }
	

}
