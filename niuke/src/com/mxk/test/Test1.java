package com.mxk.test;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.File;
public class Test1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String path="E:\\010mxk����\\001java\\015������ʽ.docx";
		String path1="E:/010mxk����/001java/020test.txt";
		File file=new File(path1);
		//OutputStream out=new FileOutputStream(file,true);
		InputStream in=new FileInputStream(file);  //�Ƚ�����ļ��е��ַ�ת��Ϊ�ֽڣ�1���ַ��������ֽڣ��洢��len��
		byte [] b=new byte[1024];
		int len=in.read(b);
		in.close();
		String str=new String(b);
		System.out.println("len:"+len);
		System.out.println(str);
		
		
//		String str="\r\nHello World";
//		byte [] arr=str.getBytes("utf-8");
//		for(byte a:arr) {
//			out.write(a);
//		}
//		out.close();
		System.out.println("���д��");
		
		
	}

}
