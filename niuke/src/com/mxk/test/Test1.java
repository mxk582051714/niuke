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
		String path="E:\\010mxk积累\\001java\\015正则表达式.docx";
		String path1="E:/010mxk积累/001java/020test.txt";
		File file=new File(path1);
		//OutputStream out=new FileOutputStream(file,true);
		InputStream in=new FileInputStream(file);  //先将这个文件中的字符转化为字节，1个字符是两个字节，存储在len中
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
		System.out.println("完成写入");
		
		
	}

}
