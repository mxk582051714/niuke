/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */

package com.mxk.niuke3;

public class Test7_1 {

	StringBuilder sb = new StringBuilder();

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
		Test7_1 t = new Test7_1();
		String str = t.Serialize(n1);
		String  str1= "1,2,#,#,3,4,#,#,#,";
		t.Deserialize(str1);
		System.out.println(str);
	}

	boolean b = true;

	String Serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if (root == null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val + ",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}

	//
	int index = -1;
	TreeNode Deserialize(String str) {
		index++;
		String[] strr = str.split(",");
		TreeNode node = null;
		if (!strr[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(strr[index]));
			node.left = Deserialize(str);
			node.right = Deserialize(str);
		}

		return node;
	}

}
