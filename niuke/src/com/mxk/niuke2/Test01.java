/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 * 注意：明确什么事二叉平衡树：必须是二叉排序树+左右字数深度不超过1
 */
package com.mxk.niuke2;

import com.mxk.niuke1.*;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 后续遍历时，遍历到一个节点，其左右子树已经遍历 依次自底向上判断，每个节点只需要遍历一次

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
