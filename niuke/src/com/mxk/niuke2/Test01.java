/**
 * ����һ�ö��������жϸö������Ƿ���ƽ�������
 * ע�⣺��ȷʲô�¶���ƽ�����������Ƕ���������+����������Ȳ�����1
 */
package com.mxk.niuke2;

import com.mxk.niuke1.*;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ��������ʱ��������һ���ڵ㣬�����������Ѿ����� �����Ե������жϣ�ÿ���ڵ�ֻ��Ҫ����һ��

	private boolean isBalanced = true;
	public boolean IsBalanced_Solution(TreeNode root) {
		getDepth(root);
		return isBalanced;
	}

	public int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);

		if (Math.abs(left - right) > 1) {
			isBalanced = false;
		}
		return right > left ? right + 1 : left + 1;

	}

}