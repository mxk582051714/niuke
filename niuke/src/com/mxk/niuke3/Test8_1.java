package com.mxk.niuke3;

import java.util.*;

public class Test8_1 {

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
		Test8_1 t = new Test8_1();
		TreeNode node = t.KthNode(n5, 2);
		System.out.println(node.val);

	}

	ArrayList<TreeNode> list = new ArrayList<>();

	void KthNode1(TreeNode pRoot) {
		if (pRoot == null)
			return;
		KthNode1(pRoot.left);
		list.add(pRoot);
		KthNode1(pRoot.right);

	}

	TreeNode KthNode2(TreeNode pRoot, int k) {
		KthNode1(pRoot);
		if (k <= 0 || k > list.size())
			return null;
		return list.get(k - 1);
	}

	TreeNode KthNode3(TreeNode pRoot, int k) {
		if (list.size() == k)
			return pRoot;
		if (pRoot == null)
			return null;
		KthNode(pRoot.left, k);
		list.add(pRoot);
		KthNode(pRoot.right, k);
		return null;
	}

	int index = 0; // 计数器

	TreeNode KthNode(TreeNode root, int k) {
		if (root != null) { 				// 中序遍历寻找第k个
			TreeNode node = KthNode(root.left, k);
//			if (node != null)
//				return node;
			index++;
			if (index == k)
				return root;
			node = KthNode(root.right, k);
			if (node != null)
				return node;
		}
		return null;
	}

}
