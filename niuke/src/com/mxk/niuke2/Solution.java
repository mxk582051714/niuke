/**
 * 总结二叉树深度计算方法，输出每条路径，判断是否是二叉平衡树
 */

package com.mxk.niuke2;

import java.util.*;

public class Solution {
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		TreeNode node8=new TreeNode(8);
		TreeNode node11=new TreeNode(11);
		TreeNode node9=new TreeNode(9);
		TreeNode node10=new TreeNode(10);
		
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node6;
		node3.right=node5;
		node6.left=node8;
		node6.right=node11;
		node3.left=node9;
		node9.right=node10;
		Solution s=new Solution();
		s.FindPath(node1);
		for(ArrayList<Integer> al:s.listAll) {
			for(Integer i:al)
				System.out.print(i+" ");
			System.out.println();
		}
		
	}

	

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root) {
		if (root == null)
			return listAll;
		list.add(root.val);
		//target -= root.val;
		if ( root.left == null && root.right == null)
			listAll.add(new ArrayList<Integer>(list));
		FindPath(root.left);
		FindPath(root.right);
		list.remove(list.size() - 1);
		return listAll;
	}

}
