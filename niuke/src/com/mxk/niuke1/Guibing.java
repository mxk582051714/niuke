package com.mxk.niuke1;

import java.util.Arrays;

public class Guibing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 9,4,2,7,12,5};
		 System.out.println("原数组："+Arrays.toString(a));
		 mergeSort(a, 0, a.length-1);
		 System.out.println("排序结果："+Arrays.toString(a));
	}

	public static void mergeSort(int[] a, int low, int high) {
		// 归并排序，用来拆分
		int mid = low + (high - low) / 2;
		if (low < high) { // 只有当低位low小于高位high时，才说明该数组可拆分
			// 拆分成的左半部分
			mergeSort(a, low, mid); // 至到拆成单个子数组
			// 拆分成的右半部分
			mergeSort(a, mid + 1, high);
			// 将拆分好的子数组排序并合并
			merge(a, low, mid, high);
			System.out.println(Arrays.toString(a));
		}
	}

	// low用于标识左指针（左半子数组的最小值），mid用于标识右指针（右半子数组的最小值），high限制移动
	public static void merge(int[] a, int low, int mid, int high) {
		// 新建辅助数组
		int[] temp = new int[high - low + 1];
		int i = low; // 左指针
		int j = mid + 1; // 右指针
		int k = 0; // temp数组索引

		while (i <= mid && j <= high) { // 比较两个指针，对应的大小****
			if (a[i] < a[j]) {
				temp[k] = a[i]; // 赋值且指针开始移动
				k++;
				i++;
			} else {
				temp[k] = a[j];
				k++;
				j++;
			}
		}

		// 将左半数组剩余部分赋值
		while (i <= mid) {
			temp[k] = a[i];
			k++;
			i++;
		}

		// 将右半数组剩余部分赋值
		while (j <= high) {
			temp[k] = a[j];
			k++;
			j++;
		}
		
		//用temp数组来覆盖a数组
		for(int m=0;m<temp.length;m++) {
			a[m+low]=temp[m];
		}
		

	}

}
