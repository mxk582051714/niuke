package com.mxk.niuke2;
import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {1,2,3,5,4};
		Test07 t=new Test07();
		boolean b=t.isContinuous(num);
		System.out.println("b:"+b);
	}
	public boolean isContinuous(int [] numbers) {
		boolean b=false;
		Set<Integer> set=new HashSet<>();
		if(numbers.length<=4)
			return false;
		Arrays.sort(numbers);   		//�ź���
		System.out.println(Arrays.toString(numbers));
		//�����ź����numbers,Ѱ��0�ĸ���
		int count0=0;;
		int len=numbers.length;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) {
				count0++;   //���index0+1��0�ĸ���
			}else {
				set.add(numbers[i]);
			}
		}
		//�ж��Ƿ����ظ�����,���ظ��򲻿���������ֵ
		if(set.size()!=len-count0)
			return b;
		if(count0==4)
			return true;
		if(numbers[len-1]-numbers[count0]<=4) {
			return true;
		}else{
			return false;
		}
		
    }

}
