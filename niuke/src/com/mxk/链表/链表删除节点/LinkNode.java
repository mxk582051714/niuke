package com.mxk.����.����ɾ���ڵ�;

public class LinkNode {
	int val;
	LinkNode next;
	public LinkNode(int val) {
		this.val=val;
		this.next=null;
		
	}
	
	public static void main(String[] args) {
		LinkNode node1=new LinkNode(-1);
		LinkNode node2=new LinkNode(4);
		LinkNode node3=new LinkNode(2);
		LinkNode node4=new LinkNode(3);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		
		LinkNode root=deleteNode_1(node1,node4);
		while(root!=null) {
			System.out.print(root.val+" ");
			root=root.next;
		}
		
	}
	
	
	//�ҵ�ǰһ���㣬��¼
	public static LinkNode deleteNode( LinkNode root,LinkNode keynode) {
		if(root==null)
			return null;
		if(keynode==null)
			return root;
		LinkNode pre=null;
		LinkNode cur=root;
		if(root.val==keynode.val) {
			LinkNode nroot=root.next;
			root=null;
			return nroot;
		}
		while(cur!=null) {
			pre=cur;
			cur=cur.next;
			if(cur.val==keynode.val) {
				pre.next=cur.next;
				break;
			}
		}
		
		return root;
		
		
	}
	
	
	public static LinkNode deleteNode_1( LinkNode root,LinkNode keynode) {
		if(root==null)
			return null;
		if(keynode==null)
			return root;
		
		LinkNode pre=root;
		if(keynode.next==null) {  //Ŀ��ڵ������һ���ڵ�
			while(pre.next!=null) {
				pre=pre.next;
			}
			pre=null;
			return root;
		}
//		if(keynode.next.next==null) {
//			keynode.val=keynode.next.val;  //Ŀ��ڵ��ǵ����ڶ����ڵ�
//			keynode.next=null;
//			return root;
//		}
		
		keynode.val=keynode.next.val; 
		keynode.next=keynode.next.next;
		
		return root;
		
	}
		  
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LinkNode) {
			if(((LinkNode)obj).val==this.val)
				return true;
		}
		return false;
	}
}
