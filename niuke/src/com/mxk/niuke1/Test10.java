/**
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 */

package com.mxk.niuke1;

import java.util.*;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// public int TreeDepth(TreeNode root) {
	// int depth = 1;
	// ArrayList<TreeNode> nodelist=new ArrayList<>();
	// ArrayList<Integer> depthlist=new ArrayList<>();
	// if(root==null) //空树
	// return 0;
	// TreeNode temp=root;
	//
	// while(temp!=null) {
	// nodelist.add(temp);
	// if(temp.left==null&&temp.right==null){
	// //node0节点是叶节点
	// depthlist.add(depth);
	// depth--;
	//
	// }else if(temp.left!=null) {
	// temp=temp.left;
	// depth++;
	// }else if(temp.right!=null) {
	// temp=temp.right;
	// }
	// }
	//
	//
	//
	// return depth;
	// }
	//利用前序遍历
	public int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);

		return Math.max(left, right)+1;
	}

}

 class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}

}
