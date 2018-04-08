package com.mxk.二叉树.二叉树遍历;
import java.util.*;

public class Beh {
	
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
		
		beh_trace_di(n1);
		System.out.println();
		beh_trace(n1);
		
	}
	public static void beh_trace_di(TreeNode root) {
		if(root!=null) {
			if(root.left!=null) {
				beh_trace_di(root.left);
			}
			if(root.right!=null) {
				beh_trace_di(root.right);
			}
			System.out.print(root.val+"  ");
		}
	}
	
	//非递归
	public static void beh_trace(TreeNode root) {
		if(root==null)
			return;
		TreeNode pre=null;   //标记前一个指针pre
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			root=stack.peek();
			if(root.left==null&&root.right==null) {  //叶子节点
				pre=stack.pop();
				System.out.print(root.val+" ");
			}else if(pre!=null&&(root.left==pre||root.right==pre)) {//非叶子节点，但其左右孩子节点
				pre=stack.pop();
				System.out.print(root.val+" ");
			}else {
				if(root.right!=null){
					stack.push(root.right);
				}
				if(root.left!=null){
					stack.push(root.left);
				}
			}
		}
	}
}
