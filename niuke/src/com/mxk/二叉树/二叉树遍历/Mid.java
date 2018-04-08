package com.mxk.¶þ²æÊ÷.¶þ²æÊ÷±éÀú;
import java.util.*;

public class Mid {
	
	public static void main(String[] args) {
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
		n4.left=n5;
		n5.left=n6;
		n5.right=n7;
		
		mid_trace_di(n1);
		
	}
	public static void mid_trace_di(TreeNode root) {
		if(root!=null) {
			if(root.left!=null) {
				mid_trace_di(root.left);
			}
			System.out.print(root.val+"  ");
			if(root.right!=null) {
				mid_trace_di(root.right);
			}
		}
	}
	
	//·ÇµÝ¹é
	
	public static void mid_trace(TreeNode root) {
		if(root==null)
			return;
		TreeNode p=root;
		Stack<TreeNode> stack=new Stack<>();
		while(p!=null||!stack.isEmpty()) {
			while(p!=null) {
				stack.push(p);
				p=p.left;
			}
			p=stack.pop();
			System.out.print(p.val+" ");
			p=p.right;
		}
	}
}
