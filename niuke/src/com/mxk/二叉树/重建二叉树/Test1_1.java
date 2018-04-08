package com.mxk.二叉树.重建二叉树;

import com.mxk.二叉树.二叉树遍历.Beh;
import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Test1_1 {

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		Test1_1 t = new Test1_1();
		TreeNode root=	t.reConstructBinaryTree(pre, in);
		Beh.beh_trace(root);
		System.out.println("test");

	}

	// public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
	// if(pre==null||in==null)
	// return null;
	// TreeNode root=null;
	// root=buildTree(pre,0,pre.length,in,0,in.length);
	//
	// return root;
	//
	// }
	//
	// //实际构建二叉树
	// public TreeNode buildTree(int[] pre,int ps,int pe,int [] in,int is,int ie) {
	// if(ps>=pe||is>=ie)
	// return null;
	//
	//
	// TreeNode root=new TreeNode(pre[ps]);
	// //遍历中序遍历结构,寻找与pre[0]相同的点，确定根节点,跟节点左侧是左子树
	// //右边是右子树
	// for(int index=is;index<ie;index++) {
	// if(in[index]==root.val) {
	// root.left=buildTree(pre,ps+1,ps+index-is+1,in,is,index);
	// root.right=buildTree(pre,ps+index-is+1+1,pe,in,index+1,ie);
	// break;
	// }
	// }
	// return root;
	//
	// }

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}

	// 前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
	private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

		if (startPre > endPre || startIn > endIn)
			return null;
		TreeNode root = new TreeNode(pre[startPre]);

		for (int i = startIn; i <= endIn; i++)
			if (in[i] == pre[startPre]) {
				root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
				break;
			}
		return root;
	}

}


