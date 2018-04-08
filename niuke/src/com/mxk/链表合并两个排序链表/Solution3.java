package com.mxk.链表合并两个排序链表;

import com.mxk.链表.输出倒数第k个节点.ListNode;

public class Solution3 {
	
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(5);
		ListNode node3=new ListNode(4);
		ListNode node4=new ListNode(6);
		head.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		//node4.next=node1;
		Solution3 s=new Solution3();
		ListNode res=s.clone(head);
		while(res!=null) {
			System.out.println(res.val);
			res=res.next;
		}
		
	}
	
	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode head = null;
		ListNode p = null;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				if (head == null) {
					head = list1;
					p = head;
				} else {
					p.next = list1;
					p=list1;
				}
				list1 = list1.next;
			} else {
				if (head == null) {
					head = list2;
					p = head;
				} else {
					p.next = list2;
					p=list2;
				}
				list2 = list2.next;
			}
		}
		if (list1 == null)
			p.next = list2;
		if (list2 == null)
			p.next = list1;
		return head;
	}

	public ListNode clone(ListNode head) {
		if(head==null)
			return null;
		ListNode nhead=new ListNode(head.val);
		ListNode p=nhead;
		while(head!=null) {
			head=head.next;
			ListNode temp=null;
			if(head!=null) {
				temp=new ListNode(head.val);
			}
			p.next=temp;
			p=temp;
		}
		
		return nhead;
	}

}
