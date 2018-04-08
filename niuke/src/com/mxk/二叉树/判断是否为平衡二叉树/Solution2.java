package com.mxk.二叉树.判断是否为平衡二叉树;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean isbalanced=true;
	public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
        	return true;
       depth(root);
       return isbalanced;
    }
	public int depth(TreeNode root) {
		if(root==null)
			return 0;
		if(!isbalanced)  //一旦为false,直接退出即可
			return 0;
		int nleft=depth(root.left);
		int nright=depth(root.right);
		if(Math.abs(nleft-nright)>1) {
			isbalanced=false;
		}
		return nleft>nright?(nleft+1):(nright+1);
	}

}
