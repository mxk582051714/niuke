package com.mxk.二叉树.二叉树中序遍历的下一个节点;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode n1=new TreeLinkNode(1);
		TreeLinkNode n2=new TreeLinkNode(2);
		TreeLinkNode n3=new TreeLinkNode(3);
		TreeLinkNode n4=new TreeLinkNode(4);
		TreeLinkNode n5=new TreeLinkNode(5);
		TreeLinkNode n6=new TreeLinkNode(6);
		TreeLinkNode n7=new TreeLinkNode(7);
		TreeLinkNode n8=new TreeLinkNode(8);
		TreeLinkNode n9=new TreeLinkNode(9);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n2.next=n1;
		n3.next=n1;
		n4.next=n2;
		n5.next=n2;
		n4.left=n6;
		n4.right=n7;
		n6.next=n4;
		n7.next=n4;
//		n7.left=n8;
		n7.right=n9;
//		n8.next=n7;
		n9.next=n7;
		
		Solution2 s=new Solution2();
		TreeLinkNode key=	s.GetNext_beh(n6);
		System.out.println(key.val);
	}

	// 中序遍历寻找下一个节点，要分成该节点是否有右子树（因为中序遍历的节点输出顺序是左节点，根节点，右节点）
	// 分叉路口只在根节点到右节点发生
	public TreeLinkNode GetNext_mid(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		// 该点的右子树不为空
		if (pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		} else { // 该点是父节点的右子树为空
			while (pNode.next != null) {
				if (pNode.next.left == pNode)
					return pNode.next;
				pNode = pNode.next;
			}
			return null;
		}
	}

	// 变形，求前序遍历下一个节点
	public TreeLinkNode GetNext_pre(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		// 该点的左子树不为空
		if (pNode.left != null) {
			return pNode.left;
		}
		// 该点是父节点的zuo子树为空,xian判断其右子树是否为空
		if (pNode.right != null) {
			return pNode.right;
		}
		if(pNode.next==null) {
			//说明pNode是根节点
			return null;
		}
		// 该点是叶子节点
		// 1.若该节点是叶子节点且是父节点的左子树
		if (pNode.next.left == pNode) {
			while (pNode.next != null) {
				if (pNode.next.right != null) {
					return pNode.next.right;
				}
				pNode=pNode.next;
			}
		}
		// 2.若该节点是叶子节点且是父节点的右子树
		if (pNode.next.right == pNode) {
			pNode=pNode.next;
			while(pNode.next!=null) {
				if(pNode.next.right!=null)
					return pNode.next.right;
				pNode=pNode.next;
			}
		}
		return null;
	}

	
	// ****求后序遍历的下一个节点
	public TreeLinkNode GetNext_beh(TreeLinkNode pNode) {
		if(pNode==null)
			return null;
		if(pNode.next==null)  //该点是根节点
			return null;
		if(pNode.next.right==null||(pNode.next.right==pNode)){ //该节点
			return pNode.next;
		}
		//该节点是其父节点的左子树且其父节点的右子树不为空
		pNode=pNode.next.right;
		while(pNode!=null) {
			if(pNode.left==null&&pNode.right==null) {
				return pNode;
			}else if (pNode.left!=null) {
				pNode=pNode.left;
			}else {
				pNode=pNode.right;
			}
		}
		return null;
	}
	
	
}
