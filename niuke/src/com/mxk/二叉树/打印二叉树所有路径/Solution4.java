package com.mxk.二叉树.打印二叉树所有路径;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
import java.util.*;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution4 {

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
		n2.right = n5;
		n5.left = n6;
		n5.right = n7;
		Solution4 s=new Solution4();
		ArrayList<ArrayList<Integer>> res =s.FindPath(n1,4);
		for (ArrayList<Integer> nodelist : res) {
			for (Integer node : nodelist) {
				System.out.print(node + " ");
			}
			System.out.println();
		}
		System.out.println();

	}
	ArrayList<ArrayList<Integer>> res=new ArrayList<>();  //存储结果
	Stack<Integer> stack=new Stack<>();   //前序遍历，stack存储遍历过程中的节点
	int num=0;
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if(root==null)
			return res;
		num+=root.val;
		stack.add(root.val);
		boolean isleaf=((root.left==null)&&(root.right==null));
		if(num==target&&isleaf){
			ArrayList<Integer> path=new ArrayList<>();
			for(Integer i:stack) {
				path.add(i);
			}
			res.add(path);
		}
		FindPath(root.left,target);
		FindPath(root.right, target);
		num-=root.val;
		stack.pop();
		return res;
	}

}
