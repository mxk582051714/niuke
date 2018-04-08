package com.mxk.二叉树.判断二叉树是否为对称的;

import java.util.ArrayList;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Snippet {
		//通过理解镜像，理解对称
		//对称就是一个根节点，其左右子节点，要么全为空，要么值相等，之后再把左右子节点作为根节点处理
		//数据结构，就用连个list,一个村左子树，一个存右子树
		 boolean isSymmetrical(TreeNode root) {
			 if(root==null)
				 return true;
			 ArrayList<TreeNode> leftlist=new ArrayList<>();
			 ArrayList<TreeNode> rightlist=new ArrayList<>();
			 leftlist.add(root.left);
			 rightlist.add(root.right);
			 while(!leftlist.isEmpty()&&!rightlist.isEmpty()) {
				 TreeNode leftnode=leftlist.remove(0);
				 TreeNode rightnode=rightlist.remove(0);
				 if(leftnode==null&&rightnode==null) {
					 continue;
				 }
				 if(leftnode==null||rightnode==null) {
					 return false;
				 }
				 if(leftnode.val!=rightnode.val) {
					 return false;
				 }
				 leftlist.add(leftnode.left);    //这两个要同时放进去
				 rightlist.add(rightnode.right);
				 leftlist.add(leftnode.right);    //这两个要同时放进去
				 rightlist.add(rightnode.left);
			 }
			 return true;
		 }
}

