package com.mxk.������.����������;
import java.util.*;

public class Beh2 {
	
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
	
	//�ǵݹ�
	public static void beh_trace(TreeNode root) {
		if(root==null)
			return;
		TreeNode pre=null;   //��¼��ǰ����ڵ�
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			root=stack.peek();
			if(root.right==null&&root.left==null) {  //Ҷ�ӽڵ�,ֱ�����
				pre=stack.pop();
				System.out.print(root.val+" ");
			}else if(pre!=null&&(root.left==pre||root.right==pre)){  //��Ҷ�ӽڵ㣬���ýڵ��ĳ�ӵ������
				pre=stack.pop();
				System.out.print(root.val+" ");
			}else {
				if(root.right!=null)      //����ջ���ӽڵ㣨���������
					stack.push(root.right);  //**��ջ˳���Ǻ���������
				if(root.left!=null)
					stack.push(root.left);
			}
		}
	}
}
