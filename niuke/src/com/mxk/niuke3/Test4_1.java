/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ��
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

	//��ʵ��������������ҵ��Ľڵ�ŵ�һ��list�У�����
	//�ҵ�����ڵ㣬�ĸ��ڵ������һ���ڵ�
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		TreeLinkNode resnode=null;
		TreeLinkNode temp =null;   //���ڵ�,next��ָ�򸸽ڵ��ָ��
		if(pNode==null)           //��ǰ�ڵ�Ϊ��
			return resnode;
		if(pNode.right!=null) {        //��ǰ�ڵ���ҽڵ㲻Ϊ��
			temp=pNode.right;
			while(temp.left!=null) {
				temp=temp.left;
			}
			return temp;
		}
//		if(pNode.right==null) {        //��ǰ�ڵ���ҽڵ�Ϊ��
			
			while(pNode.next!=null) {
				temp=pNode.next;
				if(temp.left==pNode)   //�ýڵ��Ǹ��ڵ����ڵ㣬��ô���ظ��ڵ�
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
