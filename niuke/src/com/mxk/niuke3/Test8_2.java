/**
 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
 * ���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4
 * 
 */


package com.mxk.niuke3;

import java.util.*;

public class Test8_2 {

	public static void main(String[] args) {

		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);

		n5.left = n3;
		n5.right = n7;
		n3.left = n2;
		n3.right = n4;
		n7.left = n6;
		n7.right = n8;
		Test8_2 t = new Test8_2();
		TreeNode node = t.KthNode(n5,9);
		System.out.println(node.val);

	}

	
	//�ǵݹ�ʵ��������������⣬���������������������������ң�����ʵ�ִ�С���������������
	//��ô�������������ĳɣ��ң�������󣩣���ô�������İ��Ӵ�С���**�����ȱ���������
	int index=0;
	TreeNode KthNode(TreeNode pRoot,int k) {
		if(pRoot==null||k<=0)
			return null;
		Deque<TreeNode> stack=new LinkedList<TreeNode>();
		while(pRoot!=null||!stack.isEmpty()) {
			while(pRoot!=null) {
				stack.push(pRoot);
				pRoot=pRoot.left;
			}
			pRoot=stack.pop();
			index++;
			if(k==index)
				return pRoot;
//			System.out.print(pRoot.val+"  ");
			pRoot=pRoot.right;
		}
		return null;
	}
	void KthNode_right(TreeNode root) {
		if(root==null)
			return;
		Deque<TreeNode> stack=new LinkedList<TreeNode>();
		while(root!=null||!stack.isEmpty()) {
			while(root!=null) {
				stack.push(root);
				root=root.right;
			}
			root=stack.pop();
			System.out.print(root.val+"  ");
			root=root.left;
		}
		
	}

}
