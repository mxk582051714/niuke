package com.mxk.二叉树.二叉搜索树的后序遍历;
/**
 * ：给定一个数组，判断是否为某个二叉搜索树的前序遍历结果
 * @author HWLUO
 *
 */

public class Solution2 {
	public static void main(String[] args) {
		Solution2 s=new Solution2();
		int [] arr= {10,8,20,9,11,12,14,15,17};
		boolean b=s.VerifySquenceOfBST(arr);
		System.out.println(b);
	}
	
	
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence==null||sequence.length==0)
			 return false;
		 if(sequence.length==1)
			 return true;
		 return verify(sequence,0,sequence.length-1);
	 }
	 public boolean verify(int [] arr,int low,int high) {
		 if(low>=high)
			 return true;
		 int key=arr[low];     //根节点
		 int index=low+1;  		//分界线
		 while(arr[index]<key) {
			 index++;
		 }
		 for(int j=index;j<=high;j++) {
			 if(arr[j]<key)
				 return false;
		 }
		 return verify(arr,low+1,index-1)&&verify(arr,index,high);
	 }
}
