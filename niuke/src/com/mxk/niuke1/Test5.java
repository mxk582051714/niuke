package com.mxk.niuke1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 test = new Test5();
		int res = test.GetUglyNumber_Solution(7);
		System.out.println("res:" + res);
	}

	public int GetUglyNumber_Solution(int index) {
		if (index <= 0)
			return 0;
		if (index < 7)
			return index;
		int[] res = new int[index]; // �洢index������
		res[0] = 1; // ��֪��һ������Ϊ1
		int t2 = 0, // ��¼����2�ĸ���
			t3 = 0, // ��¼����3�ĸ��� 
			t5 = 0, // ��¼����5�ĸ���
			i = 1;
		for (; i < index; i++) {
			if(i==4)
				System.out.println("test");
			res[i] = Math.min(res[t2] * 2, Math.min(res[t3] * 3, res[t5] * 5));
			if (res[i] == res[t2] * 2)
				t2++; // �����С�ĵ���res[t2]*2����ôt2��1
			if (res[i] == res[t3] * 3)
				t3++;
			if (res[i] == res[t5] * 5)
				t5++;
		}
		return res[index - 1];
	}

	// final int d[] = { 2, 3, 5 };
	// public int GetUglyNumber_Solution(int index) {
	// if (index == 0)
	// return 0;
	// int a[] = new int[index];
	// a[0] = 1;
	// int p[] = new int[] { 0, 0, 0 };
	// int num[] = new int[] { 2, 3, 5 };
	// int cur = 1;
	//
	// while (cur < index) {
	// int m = finMin(num[0], num[1], num[2]);
	// if (a[cur - 1] < num[m])
	// a[cur++] = num[m];//���
	// p[m] += 1;
	// num[m] = a[p[m]] * d[m];
	// }
	// return a[index - 1];
	// }
	// //ȡ��Сֵ���±꣬����ȡ����Сֵ
	// private int finMin(int num2, int num3, int num5) {
	// int min = Math.min(num2, Math.min(num3, num5));
	// return min == num2 ? 0 : min == num3 ? 1 : 2;
	// }

}
