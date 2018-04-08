/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是
 */
package com.mxk.niuke3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2_2 t = new Test2_2();
		// String s="12334f";
		// boolean b=t.isNumeric(s.toCharArray());
		// String s="[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?";
		// Pattern p=Pattern.compile(s);
		// String str=p.pattern();

		// Pattern p = Pattern.compile("/0nn");
		// Matcher m = p.matcher("006");
		// boolean b = m.matches();
		// boolean b = Pattern.matches("//d", "8");

		// 要验证的字符串
		// String str = "mxk@bupt.edu.com";
		String str = "10160032200";
		// 邮箱验证规则
		// String regEx =
		// "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
//		String regEx = "^1[3|4|5|8][0-9]\\d{8}$";
//		// 编译正则表达式
//		Pattern pattern = Pattern.compile(regEx);
//		// 忽略大小写的写法
//		// Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
//		Matcher matcher = pattern.matcher(str);
//		// 字符串是否与正则表达式相匹配
//		boolean rs = matcher.matches();
//		System.out.println(rs);
		
		String s="aa";
		boolean rs=	t.isNumeric1(s.toCharArray());
		
		System.out.println(rs);
		
	}

	public boolean isNumeric(char[] str) {
		String s = new String(str);
		try {
			double num = Double.parseDouble(s);
		} catch (Exception e) {
			// TODO: handle exception
			return false;

		}
		return true;
	}

	public boolean isNumeric1(char[] str) {
		String string = String.valueOf(str);
		return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
	}

}
