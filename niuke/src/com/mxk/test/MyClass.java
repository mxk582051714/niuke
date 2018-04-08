package com.mxk.test;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
	public static void main(String[] args) throws UnsupportedEncodingException {

		MyClass myclass = new MyClass();
		searchChineseCharacter("Good morning");
		searchChineseCharacter("hello ���Ϻ�mm ���鿭");

		String str = "�й�abc";
		System.out.println("�ַ���str����Ϊ��" + str.length());// �ַ������������ֽڵĸ���

		byte[] bArr = str.getBytes();

		int num = 1;
		for (byte b : bArr) {
			System.out.println("��" + num + "���ֽ�Ϊ��" + b);
			num++;
		}

		System.out.println("\n");
		num = 1;

		int len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.println("��" + num + "���ַ�Ϊ��" + str.charAt(i));
			num++;
		}

		// char c = '\u4E2D';
		// int aa = (int)c;
		// System.out.println(c);
		// System.out.println(aa);//�Ǻ�

		 String str1 = "hello";
		 String str2 = "孟祥abc";
		
		 System.out.println("utf-8������'hello'��ռ���ֽ���:" + str1.getBytes("utf-8").length);
		 System.out.println("gbk������'hello'��ռ���ֽ���:" + str1.getBytes("gbk").length);
		
		 System.out.println("utf-8������'���abc'��ռ���ֽ���:" + str2.getBytes("utf-8").length);
		 System.out.println("gbk���������'���abc'��ռ���ֽ���:" + str2.getBytes("gbk").length);
		 System.out.println(str2.getBytes().length);

	}

	// �ҳ�һ���ַ����еĺ���
	public static void searchChineseCharacter(String str) {
		// ������ʽ������ƥ�������ַ�
		String regex = "[\u4e00-\u9fa5]";
		// ���str�ĳ��Ⱥ�����ռ�ֽ������ȣ�˵����������
		if (str.length() != str.getBytes().length) {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(str);
			System.out.print("'" + str + "' �еĺ���Ϊ:");

			while (matcher.find()) {
				System.out.print(matcher.group());
			}
		} else {
			System.out.println("'" + str + "' ���޺���");
		}
	}

}
