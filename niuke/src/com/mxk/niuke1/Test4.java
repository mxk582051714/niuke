/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */

package com.mxk.niuke1;

import java.util.*;

public class Test4 {
	public static void main(String []args) {
		Test4 test=new Test4();
		int [] numarr= {3,32,321};
		String s=test.PrintMinNumber(numarr);
		System.out.println("s"+s);
	}
	public String PrintMinNumber(int [] numbers) {
		StringBuffer res=new StringBuffer();
		if(numbers==null||numbers.length==0)
			return res.toString();
		//首先取出每个数的最高位，然后根据最高位进行一个排序
		String [] numstr = new String[numbers.length];
		for(int i=0;i<numbers.length;i++){
			numstr[i]=numbers[i]+"";
		}
		//本身即是升序排列
		Arrays.sort(numstr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1=o1+o2;
				String s2=o2+o1;
				
				
				return s1.compareTo(s2);  //若返回+1，则认为o1>o2
			}
		});
		for(String s:numstr) {
			res.append(s);
		}
		return res.toString();
    }

}
