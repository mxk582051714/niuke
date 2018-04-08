/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针
 * 
 * 代码很简单，关键还是知道怎么样才能判断一个
二叉树是否对称，只要采用前序、中序、后序、层次遍历等任何一种遍历方法，分为先左后右和先
右后左两种方法，只要两次结果相等就说明这棵树是一颗对称二叉树
 * 
 */


package com.mxk.niuke3;
import java.util.*;
public class Test5_1 {
	List<TreeNode> list=new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n7=new TreeNode(7);
		TreeNode n8=new TreeNode(8);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n5.left=n7;
		n5.right=n8;
//		n2.next=n1;
//		n3.next=n1;
//		n4.next=n2;
//		n5.next=n2;
//		n7.next=n5;
//		n8.next=n5;
		Test5_1 t=new Test5_1();
//		t.qianxu(n1);
//		System.out.println();
//		t.jingxiang(n1);
//		t.qianxu(n1);
		
		System.out.println(t.isSymmetrical(n1));
		
	}

	boolean isSymmetrical(TreeNode pRoot)
    {
		if(pRoot==null)
			return false;
		
		return compare(pRoot.left,pRoot.right);
    }
	public boolean compare(TreeNode left,TreeNode right) {
		if(left==null&&right==null)
			return true;
		if(left==null||right==null) {
			return false;
		}
		return left.val==right.val&&compare(left.right,right.left)&&compare(left.left,right.right);
	}
	//另一种方法
	public boolean isSymmetrical1(TreeNode pRoot) {
		if(pRoot==null)
			return true;
		Deque<TreeNode> q1=new LinkedList<>();
		Deque<TreeNode> q2=new LinkedList<>();
		q1.offer(pRoot.left);
		q2.offer(pRoot.right);
		
		while(!q1.isEmpty()&&!q2.isEmpty()) {
			TreeNode left=q1.poll();
			TreeNode right=q2.poll();
			if(left==null&&right==null)
				continue;
			if(left==null||right==null)
				return false;
			if(left.val!=right.val) {
				return false;
			}
			q1.offer(left.left);
			q2.offer(right.right);
			q1.offer(left.right);
			q2.offer(right.left);
		}
		return true;
	}
	
	
	
	
	
	
	
	//实现一颗二叉树的镜像
	public void Mirror(TreeNode root) {
		if(root==null)
			return;
		TreeNode temp=root.right;
		root.right=root.left;
		root.left=temp;
		Mirror(root.left);
		Mirror(root.right);
		
	}
//	 if(root==null)
//			return;
//		if(root.left!=null||root.right!=null){   //相当于前序遍历，访问节点改成改变左右节点
//			TreeNode temp=root.left;
//			root.left=root.right;
//			root.right=temp;
//		}
//		if(root.left!=null)        //访问左子树
//			Mirror(root.left);
//		if(root.right!=null)         //访问右子树
//			Mirror(root.right);
	public void qianxu(TreeNode root) {
		if(root==null)
			return;
		System.out.print(root.val+"  ");
		qianxu(root.left);
		qianxu(root.right);
	}
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}