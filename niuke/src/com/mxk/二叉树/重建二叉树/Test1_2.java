package com.mxk.������.�ؽ�������;

import com.mxk.������.����������.TreeNode;

public class Test1_2 {

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		Test1_2 t = new Test1_2();
		t.reConstructBinaryTree(pre, in);
		System.out.println("test");

	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null)
			return null;
		TreeNode root = buildTree(pre, 0, pre.length, in, 0, in.length);

		return root;

	}

	// ʵ�ʹ���������
	public TreeNode buildTree(int[] pre, int pstart, int pend, int[] in, int istart, int iend) {
		if (pstart >= pend || istart >= iend)
			return null;

		TreeNode root = new TreeNode(pre[pstart]);
		// ������������ṹ,Ѱ����pre[0]��ͬ�ĵ㣬ȷ�����ڵ�,���ڵ������������
		// �ұ���������
		for (int index = istart; index <iend; index++) {
			if (in[index] == root.val) {
				root.left = buildTree(pre, pstart + 1, pstart + index - istart+1, in, istart, index);
				root.right = buildTree(pre, pstart + index - istart + 1 , pend, in, index + 1, iend);
				break;
			}
		}
		return root;
	}

}
