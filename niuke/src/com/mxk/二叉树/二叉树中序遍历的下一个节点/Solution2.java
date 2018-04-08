package com.mxk.������.�����������������һ���ڵ�;

import com.mxk.������.����������.TreeNode;

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

	// �������Ѱ����һ���ڵ㣬Ҫ�ֳɸýڵ��Ƿ�������������Ϊ��������Ľڵ����˳������ڵ㣬���ڵ㣬�ҽڵ㣩
	// �ֲ�·��ֻ�ڸ��ڵ㵽�ҽڵ㷢��
	public TreeLinkNode GetNext_mid(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		// �õ����������Ϊ��
		if (pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		} else { // �õ��Ǹ��ڵ��������Ϊ��
			while (pNode.next != null) {
				if (pNode.next.left == pNode)
					return pNode.next;
				pNode = pNode.next;
			}
			return null;
		}
	}

	// ���Σ���ǰ�������һ���ڵ�
	public TreeLinkNode GetNext_pre(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		// �õ����������Ϊ��
		if (pNode.left != null) {
			return pNode.left;
		}
		// �õ��Ǹ��ڵ��zuo����Ϊ��,xian�ж����������Ƿ�Ϊ��
		if (pNode.right != null) {
			return pNode.right;
		}
		if(pNode.next==null) {
			//˵��pNode�Ǹ��ڵ�
			return null;
		}
		// �õ���Ҷ�ӽڵ�
		// 1.���ýڵ���Ҷ�ӽڵ����Ǹ��ڵ��������
		if (pNode.next.left == pNode) {
			while (pNode.next != null) {
				if (pNode.next.right != null) {
					return pNode.next.right;
				}
				pNode=pNode.next;
			}
		}
		// 2.���ýڵ���Ҷ�ӽڵ����Ǹ��ڵ��������
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

	
	// ****������������һ���ڵ�
	public TreeLinkNode GetNext_beh(TreeLinkNode pNode) {
		if(pNode==null)
			return null;
		if(pNode.next==null)  //�õ��Ǹ��ڵ�
			return null;
		if(pNode.next.right==null||(pNode.next.right==pNode)){ //�ýڵ�
			return pNode.next;
		}
		//�ýڵ����丸�ڵ�����������丸�ڵ����������Ϊ��
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
