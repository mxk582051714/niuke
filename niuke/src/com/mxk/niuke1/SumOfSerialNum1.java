package com.mxk.niuke1;

import java.util.*;

public class SumOfSerialNum1 {
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, 10, -4, 7, 2, -5 };
		int[] arr1 = { -1, -3, 1, -2, -3 };
		int res = FindGreatestSumOfSubArray(arr);
		System.out.println(res);
	}

	// һ�ַ���
	public static int Sumof(int[] arr) {
		int res = arr[0];
		int temp = arr[0];

		for (int i = 1; i < arr.length; i++) {
			temp = max(0, temp + arr[i]);
			res = max(res, temp);
		}

		return res;
	}

	public static int max(int a, int b) { // ȡ������֮������ֵ
		return a > b ? a : b;
	}

	// �ڶ��ַ���
	static int MaxSum1(int[] a) {
		int maxsofar = 0;
		int sum;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = i; j < a.length; j++) // ����һ��ѭ���ҵ��ˣ�������һ��Ԫ�ص��������������ĺ�
			{
				sum = sum + a[j];
				maxsofar = maxsofar > sum ? maxsofar : sum; // ȡmaxsofar��sum�Ĵ�ֵ
			}
			System.out.println("�м�����" + maxsofar);
		}
		return maxsofar;
	}

	// �����ַ���
	public static int FindGreatestSumOfSubArray(int[] array) { // ��̬�滮˽˼�룬�����м�ֵ
		int res = array[0]; // ��¼��ǰ����������ĺ͵����ֵ
		int max = array[0]; // ����array[i]�������������ֵ
		for (int i = 1; i < array.length; i++) {
			max = Math.max(max + array[i], array[i]);
			res = Math.max(max, res);
		}
		return res;
	}
	// �����ַ���
	

	/*���ͺܺ�
	 * �㷨ʱ�临�Ӷ�O��n�� ��total��¼�ۼ�ֵ��maxSum��¼�����
	 * ����˼�룺����һ����A������A������ۼ����Ǹ�����ô����A��ʹ��ֵ��С��A����Ϊ�ۼ�ֵ��
	 * ��������й��׵ġ����ǰ�����ۼ�ֵ����������Ϊ�к����ܺͣ�total��¼��ǰֵ�� ��ʱ ���ʹ���maxSum ����maxSum��¼����
	 */
	public class Solution {
		public int FindGreatestSumOfSubArray(int[] array) {
			if (array.length == 0)
				return 0;
			else {
				int total = array[0], maxSum = array[0];
				for (int i = 1; i < array.length; i++) {
					if (total >= 0)
						total += array[i];
					else
						total = array[i];
					if (total > maxSum)
						maxSum = total;
				}
				return maxSum;
			}

		}
	}

	// ʵ��һ������������������������Ԫ�ص��������������ĺ�

}