/**
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
 * ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� 
 * ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"������
 */
package com.mxk.niuke3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2_1 t=new Test2_1();
		String s="12334a";
		boolean b=t.isNumeric(s.toCharArray());
		System.out.println(b);
	}

	public boolean isNumeric(char[] str) {
		if (str == null)
			return false;
		//�ַ�����ֻ�ܳ�����Щ�ַ�
		String s="0123456789+-.eE";
		Character [] ch=new Character[s.length()];
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		List<Character> list=Arrays.asList(ch);
		for(char c:str) {
			if(!list.contains(c)) {
				System.err.println("error1");
				return false;
			}
		}
		//�����ַ�
		int num1=0;
		int num2=0;
		int num3=0;
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(c=='e'||c=='E')
				num1++;
			if(c=='.')
				num2++;
			if(c=='+'||c=='-')
				num3++;
			if(num1>=2)
				return false;
			if(num2>=2)
				return false;
			if(num3>=3)
				return false;
			
		}
		//�����С��
		int index1=list.indexOf('.');
		List<Character> list1=list.subList(0, index1);
		if(index1!=-1) {
			
		}
		
		
		
		
		
		
		
		return true;
		
	}

}
