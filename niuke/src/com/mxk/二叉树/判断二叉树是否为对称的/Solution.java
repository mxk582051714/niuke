package com.mxk.二叉树.判断二叉树是否为对称的;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution {
	boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)
        	return true;
        return issub(pRoot.left,pRoot.right);
    }
	boolean issub(TreeNode left,TreeNode right) {
		if(left==null&&right==null)
			return true;
		if(left==null||right==null)
			return false;
		if(left.val==right.val) {
			return issub(left.left,right.right)&&issub(left.right,right.left);
		}
		return false;
	}
	
	
}
