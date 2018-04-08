package com.mxk.链表.输出倒数第k个节点;


public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(5);
		ListNode node3=new ListNode(4);
		ListNode node4=new ListNode(6);
		head.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node1;
		//ListNode res=FindMid(head);
		boolean b=blsLoop(head);
		System.out.println(b);
		
	}
	//用两个指针只遍历一遍
	public ListNode FindKthToTail(ListNode head,int k) {
			if(head==null||k<=0)
				return null;
			ListNode p1=head;
			ListNode p2=null;
			for(int i=0;i<k-1;i++) {
				if(p1.next!=null) {
					p1=p1.next;
				}else {
					return null;
				}
			}
			p2=head;
			while(p1.next!=null) {
				p1=p1.next;
				p2=p2.next;
			}
		return p2;
    }
	//寻找中间节点，也是用两个指针
	public static ListNode FindMid(ListNode head) {
		if(head==null)
			return null;
		ListNode p1=head;
		ListNode p2=head;
		
		while(p1.next!=null) {
			p1=p1.next.next;  //走两步
			p2=p2.next;
			if(p1==null)
				break;
		}
		return p2;
	}
	//判断一个单向链表是否存在环形
	public static boolean blsLoop(ListNode head) {
		if(head==null)
			return false;
		ListNode p1=head;
		ListNode p2=head;
		while(p1.next!=null) {
			p1=p1.next.next;  //走两步
			p2=p2.next;
			if(p1==null)
				break;
			if(p1==p2)
				break;
		}
		if(p1==p2)
			return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
