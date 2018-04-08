package com.mxk.niuke2;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		Test09 t=new Test09();
		int res=t.Chengfa(a, b);
		System.out.println("res:"+res);
	}

	public int Chengfa(int a, int b) {
		int res = 0;
		while (a!=0) {
			if ((a&1)!=0)
				res += b;
			a >>= 1;
			b <<= 1;
		}
		return res;
	}

}
