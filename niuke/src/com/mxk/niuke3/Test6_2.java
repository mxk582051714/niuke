/**
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
 * �ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 */
package com.mxk.niuke3;

import java.util.*;

public class Test6_2 {

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
		n3.left = n7;
		n3.right = n8;
		Test6_2 t1 = new Test6_2();
		t1.Print1(n1);
		// t1.PrintFunction1(n1);
	}

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

		int layer = 1; // ��������������㣬ż����
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Stack<TreeNode> s1 = new Stack<>(); // ������ڵ�
		Stack<TreeNode> s2 = new Stack<>(); // ż����ڵ�
		if (pRoot == null)
			return null;
		s1.push(pRoot);

		TreeNode node;
		while (!s1.isEmpty() || !s2.isEmpty()) {
			if (layer % 2 == 1) { // �����㣬����
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s1.isEmpty()) {
					node = s1.pop();
					System.out.printf("%-3d", node.val);
					temp.add(node.val);
					if (node.left != null)
						s2.push(node.left);
					if (node.right != null)
						s2.push(node.right);

				}
				list.add(temp);
				layer++;
				System.out.println();
			} else { // ż���㣬����
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s2.isEmpty()) {
					node = s2.pop();
					System.out.printf("%-3d", node.val);
					temp.add(node.val);
					if (node.right != null)
						s1.push(node.right);
					if (node.left != null)
						s1.push(node.left);

				}
				list.add(temp);
				layer++;
				System.out.println();
			}
		}
		return list;
	}

	public ArrayList<ArrayList<Integer>> Print1(TreeNode pRoot) {

		int layer = 1; // ��������������㣬ż����
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Stack<TreeNode> s1 = new Stack<>(); // ������ڵ�
		Stack<TreeNode> s2 = new Stack<>(); // ż����ڵ�
		if (pRoot == null)
			return null;
		s1.push(pRoot);

		TreeNode node;
		while (!s1.isEmpty() || !s2.isEmpty()) {
			if (layer % 2 == 1) { // �����㣬����
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s1.isEmpty()) {
					node = s1.remove(0);
					System.out.printf("%-3d", node.val);
					temp.add(node.val);
					if (node.left != null)
						s2.push(node.left);
					if (node.right != null)
						s2.push(node.right);
					
				}
				list.add(temp);
				layer++;
				System.out.println();
			} else { // ż���㣬����
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s2.isEmpty()) {
					node = s2.remove(0);
					System.out.printf("%-3d", node.val);
					temp.add(node.val);
					if (node.left != null)
						s1.push(node.left);
					if (node.right != null)
						s1.push(node.right);
				}
				list.add(temp);
				layer++;
				System.out.println();
			}
		}
		return list;
	}

}
