package com.mxk.test;
import java.util.regex.*;
public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String content = "I am noob " + "from runoob.com.";
//
//		String pattern = ".*runoob.*";
//
//		boolean isMatch = Pattern.matches(pattern, content);
//		System.out.println("�ַ������Ƿ������ 'runoob' ���ַ���? " + isMatch);
	
		 // ��ָ��ģʽ���ַ�������
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
	 
	      // ���� Pattern ����
	      //��������������ʽ���벢�����Pattern��
	      Pattern r = Pattern.compile(pattern);
	 
	      // ���ڴ��� matcher ����
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }
	
	
	
	
	
	}

}
