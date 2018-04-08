package com.mxk.二叉树.二叉树镜像;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Test1_2 {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n8 = new TreeNode(8);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n4.left=n5;
		n5.right=n6;
		

	}
	
	 public void Mirror(TreeNode root) {
		 if(root==null) {
			 return;
		 }
		 if(root.left==null&&root.right==null) {  //只交换叶子节点
			 return;
		 }
		 TreeNode temp=root.left;
		 root.left=root.right;
		 root.right=temp;
		 Mirror(root.left);
		 Mirror(root.right);
	 }
	
	

	
}


