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
		System.out.println("�����"+reslist);
	}
	//������Ҫ�ҳ˻���С�ģ���ôֻҪ�ҵ��������Ĳ����ľͿ�����
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
