package com.mxk.二叉树.打印二叉树;

import java.util.*;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right=n5;
		n5.left=n6;
		n5.right=n7;
		print1(n1);
	}
	
	//之字形打印二叉树
	public static void print1(TreeNode root) {
		if(root==null)
			return;
		Stack<TreeNode> stack1=new Stack<>();
		Stack<TreeNode> stack2=new Stack<>();
		stack1.push(root);
		boolean flag=false;
		while(!stack1.isEmpty()) {
			root=stack1.pop();
			System.out.print(root.val+" ");
			if(!flag) {
				if(root.left!=null) {
					stack2.push(root.left);
				}
				if(root.right!=null) {
					stack2.push(root.right);
				}
			}else {
				if(root.right!=null) {
					stack2.push(root.right);
				}
				if(root.left!=null) {
					stack2.push(root.left);
				}
			}
			if(stack1.isEmpty()) {
				System.out.println();
				stack1.addAll(stack2);
				stack2.clear();
				flag=!flag;
			}
		}
	}

}
