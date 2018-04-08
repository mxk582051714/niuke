package com.mxk.二叉树.重建二叉树;

import com.mxk.二叉树.二叉树遍历.Beh;
import com.mxk.二叉树.二叉树遍历.Pre;
import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Test1_3 {

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = {4,2,6,5,7,1,3 };
		int [] beh= {4,6,7,5,2,3,1};
		Test1_3 t = new Test1_3();
		TreeNode root=	t.rebuild(in, beh);
		Pre.pre_trace(root);
		System.out.println("test");

	}
	//根据后序和中序遍历结果是重建二叉树
	public TreeNode rebuild(int [] in,int [] beh) {
		if(in==null||in.length==0)
			return null;
		if(beh==null||beh.length==0)
			return null;
		TreeNode root=build(beh,0,beh.length-1,in,0,in.length-1);
		return root;
	}
	public TreeNode build(int [] beh,int blow,int bhigh,int [] in,int ilow,int ihigh){
		if(blow>bhigh||ilow>ihigh)  //注意
			return null;
		TreeNode root=new TreeNode(beh[bhigh]);
		
		for(int index=ilow;index<=ihigh;index++) {
			if(in[index]==root.val) {
				root.right=build(beh,bhigh-(ihigh-index),bhigh-1,in,index+1,ihigh);
				root.left=build(beh,blow,bhigh-(ihigh-index)-1,in,ilow,index-1);
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
