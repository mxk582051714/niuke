package com.mxk.二叉树.判断树的子结构;

import java.util.*;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		n2.right=n5;
		n5.left=n6;
		n5.right=n7;
		
		TreeNode n11 = new TreeNode(2);
		TreeNode n22 = new TreeNode(4);
		TreeNode n33 = new TreeNode(5);
		n11.left=n22;
		n11.right=n33;
		Solution2 s=new Solution2();
		boolean b=s.HasSubtree(n1,n11);
		System.out.println(b);
	}

	// 子树：包含一个节点，那么就必须包含该节点下的所有节点（子树的概念）
	// 子结构：包含了一个节点，可以只取该节点的左子树或者右子树，或者都不取
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) {
			return false;
		}
		boolean res = false;
		if (root1.val == root2.val) {  //相等继续判断该节点下的其他节点
			res = equal(root1, root2);   //可能还存在其他和root1节点相等的节点，该返回值为false,不能说明其不是root1的子结构
		}
		if (!res) {
			res = HasSubtree(root1.left, root2);  //前序遍历模式
		}
		if (!res) {
			res = HasSubtree(root1.right, root2);
		}
		return res;
	}

	public boolean equal(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root1.val == root2.val) {
			return equal(root1.left, root2.left) && equal(root1.right, root2.right);
		} else {
			return false;
		}
	}

}
