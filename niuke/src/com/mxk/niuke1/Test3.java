/**
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
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
	 * res; for(int i=1;i<=n;i++) { String str=i+""; //����ת�����ַ��� for(int
	 * j=0;j<str.length();j++) { char ch=str.charAt(j); //System.out.print(ch+"  ");
	 * if(ch=='1') res++; } //System.out.println(); } return res; }
	 */
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;// 1�ĸ���
		int i = 1;// ��ǰλ
		int current = 0, after = 0, before = 0;
		while ((n / i) != 0) {
			current = (n / i) % 10; 		// ��ǰλ����2593,3
			before = n / (i * 10); 			// ��λ����  259
			after = n - (n / i) * i; 		// ��λ���� 0
			// ���Ϊ0,����1�Ĵ����ɸ�λ����,���ڸ�λ���� * ��ǰλ��
			if (current <5)
				count += before * i;
			// ���Ϊ1,����1�Ĵ����ɸ�λ�͵�λ����,��λ*��ǰλ+��λ+1
			else if (current == 5)
				count += before * i + after + 1;
			// �������1,����1�Ĵ����ɸ�λ����,//����λ����+1��* ��ǰλ��
			else {
				count += (before + 1) * i;
			}
			// ǰ��һλ
			i = i * 10;
		}
		return count;
	}

}
