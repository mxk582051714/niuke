package com.mxk.二叉树.重建二叉树;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Test1_4 {

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		Test1_4 t = new Test1_4();
		TreeNode root=	t.rebuild(pre, in);
	
		t.beh(root);
		System.out.println();
		t.beh_trace_di(root);
		System.out.println("test");

	}
	
	public TreeNode rebuild(int [] pre,int [] in) {
		if(pre==null||pre.length==0)
			return null;
		if(in==null||in.length==0)
			return null;
		TreeNode root=build(pre,0,pre.length-1,in,0,in.length-1);
		return root;
	}
	public TreeNode build(int [] pre,int plow,int phigh,int [] in,int ilow,int ihigh){
		if(plow>phigh||ilow>ihigh)
			return null;
		TreeNode root=new TreeNode(pre[plow]);
		for(int index=ilow;index<=ihigh;index++) {
			if(in[index]==root.val) {
				root.left=build(pre,plow+1,plow+index-ilow,in,ilow,index-1);
				root.right=build(pre,plow+index-ilow+1,phigh,in,index+1,ihigh);
				break;
			}
		}
		return root;
	}
	
	public void beh(TreeNode root) {
		if(root!=null) {
			beh(root.left);
			beh(root.right);
			System.out.print(root.val+" ");
		}
	}
	public static void beh_trace_di(TreeNode root) {
		if(root!=null) {
			if(root.left!=null) {
				beh_trace_di(root.left);
			}
			if(root.right!=null) {
				beh_trace_di(root.right);
			}
			System.out.print(root.val+"  ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
