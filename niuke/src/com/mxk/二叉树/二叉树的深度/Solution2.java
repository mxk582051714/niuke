package com.mxk.������.�����������;

import java.util.*;

import com.mxk.������.����������.*;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();

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
		n2.right = n5;
		n5.left = n6;
		n5.right = n7;
		int depth = s.TreeDepth(n1);
		System.out.println(depth);

	}
	//�������������������Ƚϴ��߼�1
	//��ϸ������
	public int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		int nleft = TreeDepth(root.left);
		int nright = TreeDepth(root.right);
		return nleft>nright?(nleft+1):(nright+1);
	}

}
