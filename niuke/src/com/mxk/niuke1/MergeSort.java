package com.mxk.niuke1;
import java.util.*;
public class MergeSort {

	public static void main(String[] args) {
        int a[] = { 9,4,2,7,12,5};
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
	public static void mergeSort(int[] a, int low, int high) {
        //int mid = (low + high) / 2;
        int mid = low + (high - low)/2;
        if (low < high) {     //当low==high时，说明子数组中只有一个元素
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
            System.out.println(Arrays.toString(a));
        }
    }
	//low用于标识左指针（左半子数组的最小值），mid用于标识右指针（右半子数组的最小值），high限制移动
	 public static void merge(int[] a, int low, int mid, int high) {
	        int[] temp = new int[high - low + 1]; //建辅助数组
	        int i = low;		// 左指针
	        int j = mid + 1;	// 右指针
	        int k = 0;
	        // 把较小的数先移到新数组中
	        while (i <= mid && j <= high) {   //限制移动
	            if (a[i] < a[j]) {
	                temp[k++] = a[i++];
	            } else {
	                temp[k++] = a[j++];
	            }
	        }
	        // 把左边剩余的数移入数组
	        while (i <= mid) {
	            temp[k++] = a[i++];
	        }
	        // 把右边边剩余的数移入数组
	        while (j <= high) {
	            temp[k++] = a[j++];
	        }
	        // 把新数组中的数覆盖nums数组
	        for (int k2 = 0; k2 < temp.length; k2++) {
	            a[k2 + low] = temp[k2];
	        }
	    }
}
