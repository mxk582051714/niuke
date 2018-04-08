/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针
 */

package com.mxk.niuke3;
import java.util.*;
public class Test4_1 {
	List<TreeLinkNode> list=new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode n1=new TreeLinkNode(1);
		TreeLinkNode n2=new TreeLinkNode(2);
		TreeLinkNode n3=new TreeLinkNode(3);
		TreeLinkNode n4=new TreeLinkNode(4);
		TreeLinkNode n5=new TreeLinkNode(5);
		TreeLinkNode n7=new TreeLinkNode(7);
		TreeLinkNode n8=new TreeLinkNode(8);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n5.left=n7;
		n5.right=n8;
		n2.next=n1;
		n3.next=n1;
		n4.next=n2;
		n5.next=n2;
		n7.next=n5;
		n8.next=n5;
		Test4_1 t=new Test4_1();
		TreeLinkNode res=t.GetNext(n3);
		System.out.println(res.val);
		
	}

	//先实现中序遍历，将找到的节点放到一个list中，再找
	//找到这个节点，的父节点就是下一个节点
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		TreeLinkNode resnode=null;
		TreeLinkNode temp =null;   //根节点,next是指向父节点的指针
		if(pNode==null)           //当前节点为空
			return resnode;
		if(pNode.right!=null) {        //当前节点的右节点不为空
			temp=pNode.right;
			while(temp.left!=null) {
				temp=temp.left;
			}
			return temp;
		}
//		if(pNode.right==null) {        //当前节点的右节点为空
			
			while(pNode.next!=null) {
				temp=pNode.next;
				if(temp.left==pNode)   //该节点是父节点的左节点，那么返回父节点
					return temp;
				pNode=pNode.next;
			}
			return null;
//		}
//		return resnode;
	}
	
	public void zhongxu(TreeLinkNode root) {
		if(root==null) {
			return;
		}
		zhongxu(root.left);
		System.out.print(root.val+" ");
//		list.add(root);
		zhongxu(root.right);
	}
	
}

class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}
