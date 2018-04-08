/**
 * 可以很快的求出任意非负整数区间中1出现的次数。
 */

package com.mxk.niuke1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 test = new Test3();
		int res = 0;
		res = test.NumberOf1Between1AndN_Solution(2593);
		System.out.println(res);

	}

	/*
	 * public int NumberOf1Between1AndN_Solution(int n) { int res=0; if(n<=0) return
	 * res; for(int i=1;i<=n;i++) { String str=i+""; //整数转化成字符串 for(int
	 * j=0;j<str.length();j++) { char ch=str.charAt(j); //System.out.print(ch+"  ");
	 * if(ch=='1') res++; } //System.out.println(); } return res; }
	 */
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;// 1的个数
		int i = 1;// 当前位
		int current = 0, after = 0, before = 0;
		while ((n / i) != 0) {
			current = (n / i) % 10; 		// 当前位数字2593,3
			before = n / (i * 10); 			// 高位数字  259
			after = n - (n / i) * i; 		// 低位数字 0
			// 如果为0,出现1的次数由高位决定,等于高位数字 * 当前位数
			if (current <5)
				count += before * i;
			// 如果为1,出现1的次数由高位和低位决定,高位*当前位+低位+1
			else if (current == 5)
				count += before * i + after + 1;
			// 如果大于1,出现1的次数由高位决定,//（高位数字+1）* 当前位数
			else {
				count += (before + 1) * i;
			}
			// 前移一位
			i = i * 10;
		}
		return count;
	}

}
