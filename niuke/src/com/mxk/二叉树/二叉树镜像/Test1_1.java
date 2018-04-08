package com.mxk.¶þ²æÊ÷.¶þ²æÊ÷¾µÏñ;

import java.util.*;

import com.mxk.¶þ²æÊ÷.¶þ²æÊ÷±éÀú.TreeNode;
public class Test1_1 {

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
		ArrayList<String > list=new ArrayList<>();
		ArrayList<String > list2=new ArrayList<>();
		list.add("mxk");
		list.add("aa");
		list2.addAll(list);
		list.clear();
		System.out.println(list2);

	}
	
	 public void Mirror(TreeNode root) {
		 if(root==null) {
			 return;
		 }
		 TreeNode temp=root.left;
		 root.left=root.right;
		 root.right=temp;
		 Mirror(root.left);
		 Mirror(root.right);
		 
	 }
	
	

	
}


