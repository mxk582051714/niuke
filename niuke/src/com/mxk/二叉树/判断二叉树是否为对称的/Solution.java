package com.mxk.������.�ж϶������Ƿ�Ϊ�ԳƵ�;

import com.mxk.������.����������.TreeNode;

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
