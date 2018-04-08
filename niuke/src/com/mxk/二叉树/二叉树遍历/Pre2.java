package com.mxk.二叉树.二叉树遍历;
import java.util.*;

public class Pre2 {
	
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
		
		pre_trace(n1);
		
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
	
	//非递归
	//思路就是，从根节点开始，当根节点不为空时，就将其输出，之后将根节点左子树放入栈中，置根据节点的左子树为跟几点
	public static void pre_trace(TreeNode root) {
		if(root==null)
			return;
		Deque<TreeNode> stack=new LinkedList<>();
		while(root!=null||!stack.isEmpty()) {
			while(root!=null) {
				System.out.print(root.val+"  ");
				stack.push(root);
				root=root.left;
			}
			root=stack.pop();
			root=root.right;
		}
	}
}
