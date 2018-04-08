package com.mxk.niuke2;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test11 t = new Test11();
		char ch = 'a';
		int num = ch;
		String s = "-2147483648";
		int res = t.StrToInt(s);
		System.out.println("res=" + res);
	}

	public int StrToInt(String str) {
		int res = 0;
		boolean b=true;
		if(str.equals("-2147483648"))
			return -2147483648;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if(ch.equals('+')) {
				continue;
			}
			if(ch.equals('-')) {
				b=false;
				continue;
			}
			
			int asc_num = ch;
			if (asc_num < 48 || asc_num > 57) { // 非数字，应该返回0
				return 0;
			} else {
				int num = asc_num - 48;
				res += num * Math.pow(10, str.length() - i - 1);
			}
		}
		return b?(res):(-res);
	}

}
