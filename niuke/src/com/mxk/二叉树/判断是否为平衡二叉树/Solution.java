package com.mxk.二叉树.判断是否为平衡二叉树;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
        	return true;
        int nleft=depth(root.left);
        int nright=depth(root.right);
        if(Math.abs(nleft-nright)<=1)
        	return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
        else
        	return false;
    }
	public int depth(TreeNode root) {
		if(root==null)
			return 0;
		int nleft=depth(root.left);
		int nright=depth(root.right);
		return nleft>nright?(nleft+1):(nright+1);
	}

}
