/**
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
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
		//����ȡ��ÿ���������λ��Ȼ��������λ����һ������
		String [] numstr = new String[numbers.length];
		for(int i=0;i<numbers.length;i++){
			numstr[i]=numbers[i]+"";
		}
		//��������������
		Arrays.sort(numstr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1=o1+o2;
				String s2=o2+o1;
				
				
				return s1.compareTo(s2);  //������+1������Ϊo1>o2
			}
		});
		for(String s:numstr) {
			res.append(s);
		}
		return res.toString();
    }

}
