/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
package com.mxk.niuke3;

import java.util.*;

public class Test6_1 {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n5.left = n7;
		n5.right = n8;
		Test6_1 t1 = new Test6_1();
		t1.PrintFunction1(n1);
	}

	public void Print1(TreeNode pRoot) {
		Deque<TreeNode> q1 = new LinkedList<TreeNode>();
		Deque<TreeNode> q2 = new LinkedList<TreeNode>();

		if (pRoot == null)
			return;
		q1.offer(pRoot);
		int i = 1;
		while (!q1.isEmpty()) {
			pRoot = q1.poll();
			System.out.println(pRoot.val);
			if (i == 1) {
				if (pRoot.right != null) {
					// System.out.println(pRoot.right.val);
					q1.offer(pRoot.right);
				}
				if (pRoot.left != null) {
					System.out.println(pRoot.left.val);
				}
			}
			if (i == 0) {
				if (pRoot.left != null) {
					System.out.println(pRoot.left.val);
				}
				if (pRoot.right != null) {
					System.out.println(pRoot.right.val);
				}

			}

		}
	}

	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		int layer = 1;
		// s1存奇数层节点
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		s1.push(pRoot);
		// s2存偶数层节点
		Stack<TreeNode> s2 = new Stack<TreeNode>();

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		while (!s1.empty() || !s2.empty()) {
			if (layer % 2 != 0) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s1.empty()) {
					TreeNode node = s1.pop();
					if (node != null) {
						temp.add(node.val);
						System.out.print(node.val + " ");
						s2.push(node.left);
						s2.push(node.right);
					}
				}
				if (!temp.isEmpty()) {
					list.add(temp);
					layer++;
					System.out.println();
				}
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s2.empty()) {
					TreeNode node = s2.pop();
					if (node != null) {
						temp.add(node.val);
						System.out.print(node.val + " ");
						s1.push(node.right);
						s1.push(node.left);
					}
				}
				if (!temp.isEmpty()) {
					list.add(temp);
					layer++;
					System.out.println();
				}
			}
		}
		return list;
	}

	// 按之字形打印
	public void PrintFunction(TreeNode root) {
		ArrayList<ArrayList<Integer>> list_list = new ArrayList<>();
		ArrayList<Integer> list_in1 = new ArrayList<>();
		ArrayList<Integer> list_in2 = new ArrayList<>();
		if (root == null)
			return ;
		List<TreeNode> list1 = new ArrayList<>(); // 存储当前打印层的节点
		List<TreeNode> list2 = new ArrayList<>(); // 存储下一层打印的节点
		TreeNode node;
		int line = 0; // 标志奇偶层
		list1.add(root); // 把根节点放入root中

		while (list1.size() > 0) {
			ArrayList<Integer> list = new ArrayList<>();
			if (line == 0) {
				node = list1.remove(0);
				// list.add(node.val);
				list_in1.add(node.val);
			} else {

				node = list1.remove(list1.size() - 1); // 每次从list1取出最后一个节点，相当于stack的pop方法
			}
			System.out.printf("%-3d", node.val);
			if (node.left != null) {
				list2.add(node.left);
			}
			if (node.right != null) {
				list2.add(node.right);
			}
			if (list1.size() == 0) {
				line = 1 - line;
				List<TreeNode> tmp = list1;
				list1 = list2; // node每次打印都是list1，所以需要调换list1和list2并分别输出
				list2 = tmp;
				System.out.println();
			}
		}
	}

	// 分层打印
	public void PrintFunction1(TreeNode root) {
		List<TreeNode> list1 = new ArrayList<>(); // 双端队列
		List<TreeNode> list2 = new ArrayList<>();

		list1.add(root);
		TreeNode node;
		while (!list1.isEmpty()) {
			node = list1.remove(0);
			System.out.print(node.val); // 打印list1中的元素

			if (node.left != null)
				list2.add(node.left); // 先添加左
			if (node.right != null)
				list2.add(node.right);

			if (list1.isEmpty()) {
				List<TreeNode> temp = list1;
				list1 = list2;
				list2 = temp;
				System.out.println();
			}
		}
	}

}
