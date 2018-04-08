package com.mxk.二叉树.打印二叉树所有路径;

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
		 ArrayList<ArrayList<TreeNode>> res=backTrace(n1);
		 for(ArrayList<TreeNode> nodelist:res) {
			 for(TreeNode node:nodelist) {
				 System.out.print(node+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		
	}
	
	public static ArrayList<ArrayList<TreeNode>> backTrace(TreeNode root){
		if(root==null)
			return null;
		 ArrayList<ArrayList<TreeNode>> res=new ArrayList<>();
		 TreeNode pre=null;
		 boolean b=true;
		 Stack<TreeNode> stack=new Stack<>();
		 while(root!=null||!stack.isEmpty()) {
			 while(root!=null) {
				 stack.push(root);
				 root=root.left;
			 }
			 root=stack.peek();
			 if(root.right==null&&root.left==null) {  //叶子节点
				 ArrayList<TreeNode> temp=new ArrayList<>();
				 for(TreeNode node:stack) {
					 temp.add(node);
				 }
				res.add(temp);
				pre= stack.pop();
			 }else if(root.right==pre){
				 pre=stack.pop();
				 b=false;
			 }else {
				 b=true;
			 }
			 if(b) {
				 root=root.right; 
			 }else {
				 root=null;
			 }
			
		 }
		return res;
		
	}

}
