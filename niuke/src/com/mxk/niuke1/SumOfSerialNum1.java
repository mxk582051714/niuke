package com.mxk.niuke1;

import java.util.*;

public class SumOfSerialNum1 {
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, 10, -4, 7, 2, -5 };
		int[] arr1 = { -1, -3, 1, -2, -3 };
		int res = FindGreatestSumOfSubArray(arr);
		System.out.println(res);
	}

	// 一种方法
	public static int Sumof(int[] arr) {
		int res = arr[0];
		int temp = arr[0];

		for (int i = 1; i < arr.length; i++) {
			temp = max(0, temp + arr[i]);
			res = max(res, temp);
		}

		return res;
	}

	public static int max(int a, int b) { // 取出二者之间的最大值
		return a > b ? a : b;
	}

	// 第二种方法
	static int MaxSum1(int[] a) {
		int maxsofar = 0;
		int sum;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = i; j < a.length; j++) // 外层第一次循环找到了，包含第一个元素的最大连续子数组的和
			{
				sum = sum + a[j];
				maxsofar = maxsofar > sum ? maxsofar : sum; // 取maxsofar和sum的大值
			}
			System.out.println("中间结果：" + maxsofar);
		}
		return maxsofar;
	}

	// 第三种方法
	public static int FindGreatestSumOfSubArray(int[] array) { // 动态规划私思想，保留中间值
		int res = array[0]; // 记录当前所有子数组的和的最大值
		int max = array[0]; // 包含array[i]的连续数组最大值
		for (int i = 1; i < array.length; i++) {
			max = Math.max(max + array[i], array[i]);
			res = Math.max(max, res);
		}
		return res;
	}
	// 第四种方法
	

	/*解释很好
	 * 算法时间复杂度O（n） 用total记录累计值，maxSum记录和最大
	 * 基于思想：对于一个数A，若是A的左边累计数非负，那么加上A能使得值不小于A，认为累计值对
	 * 整体和是有贡献的。如果前几项累计值负数，则认为有害于总和，total记录当前值。 此时 若和大于maxSum 则用maxSum记录下来
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

	// 实现一个方法，求出给定数组包含首元素的最大连续子数组的和

}