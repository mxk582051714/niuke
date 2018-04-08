package com.mxk.二叉树.序列化二叉树;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution {

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
		String s=Serialize(n1);
		
		TreeNode root=	Deserialize(s);
		pre_trace_di(root);
		
		//System.out.println(s);
	}
	static String Serialize(TreeNode root) {
		StringBuffer sb=new StringBuffer();
		if(root==null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val+",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}
	static int index=-1;
	static TreeNode Deserialize(String str) {
		if(str==null||str.equals(""))
			return null;
		index++;
		String [] arr=str.split(",");
		TreeNode root=null;
		if(!arr[index].equals("#")) {
			root=new TreeNode(Integer.parseInt(arr[index]));
			root.left=Deserialize(str);
			root.right=Deserialize(str);
		}
		return root;
	}
		
	
	public static void pre_trace_di(TreeNode root) {
		if(root!=null) {
			System.out.print(root.val+"  ");
			if(root.left!=null) {
				pre_trace_di(root.left);
			}
			if(root.right!=null) {
				pre_trace_di(root.right);
			}
		}
	}
	

	
}


