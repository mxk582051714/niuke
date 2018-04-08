/**
 * 统计一个数字在排序数组中出现的次数。
 */

package com.mxk.niuke1;

import java.util.*;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t = new Test9();
		int[] nums = { 1,3,3,3,3,4,5};
		int res = t.GetNumberOfK(nums, 2);
		System.out.println(res);

	}

	public int GetNumberOfK(int[] array, int k) {
		int res = 0;
		if(array==null||array.length<1)
			return res;
		
		int kindex=findnum(array,k,0,array.length-1);
//		int kindex=BSearch(array, k);
		if(kindex==-1) {
			return res;
		}
		int i=kindex;
		int j=kindex;
		while(array[i]==k) {
			res++;
			i--;
			if(i<0)
				break;
		}
		while(array[j]==k) {
			res++;
			j++;
			if(j>array.length-1)
				break;
		}
		return res-1;
	}
	//二分查找递归实现
	public int findnum(int[] array, int key, int low, int high) {
		int mid = low+(high-low) / 2;
		if (low > high) {
			System.out.println("不存在");
			return -1;
		}

		if (array[mid] > key) { 			// left侧
			return findnum(array, key, low, mid-1);
		} else if (array[mid] == key) {
			return mid;
		} else {
			return findnum(array, key, mid + 1, high);
		}
	}
	//二分查找循环实现
	private int BSearch(int[] array, int k) {
		int low = 0, high = array.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid] < k) {
				low = mid + 1;
			} else if (array[mid] > k) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// public int maximumProduct(int[] nums) {
	// int res=0;
	// if(nums==null||nums.length<3)
	// return res;
	// Arrays.sort(nums);
	// System.out.println(Arrays.toString(nums));
	//// ArrayList<Integer> neglist=new ArrayList<>(); //存负数
	//// ArrayList<Integer> poslist=new ArrayList<>(); //存正数
	//// for(int i=0;i<nums.length;i++) {
	//// if(nums[i]<0) {
	//// neglist.add(nums[i]);
	//// }else {
	//// poslist.add(nums[i]);
	//// }
	//// }
	// int len=nums.length;
	// int res1=nums[len-1]*nums[len-2]*nums[len-3];
	// int res2=nums[len-1]*nums[0]*nums[1];
	// res=Integer.max(res1, res2);
	//
	// return res;
	// }

}
