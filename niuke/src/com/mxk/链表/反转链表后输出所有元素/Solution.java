package com.mxk.����.��ת������������Ԫ��;

import com.mxk.����.�����ӡ�ڵ�.*;

public class Solution {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(4);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		Solution s = new Solution();

		ListNode node = s.ReverseList(head);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode cur = null;
		ListNode pre = null;
		ListNode beh = null;
		ListNode newhead = null;
		if (head.next != null) {
			cur = head.next;
			pre = head;
			pre.next = null;
			beh = cur.next;
		} else {
			return head;
		}
		while (cur != null) {
			cur.next = pre;
			pre = cur;
			if (beh == null) {
				newhead = cur;
				break;
			}
			cur = beh;
			beh = beh.next;
		}
		return newhead;
	}
	
	public ListNode ReverseList1(ListNode head) {
		if (head == null)
			return null;
		ListNode cur = head;
		ListNode pre = null;
		ListNode newhead = null;
		while(cur!=null) {
			ListNode beh=cur.next;
			if(beh==null) {
				newhead=cur;  //��ǰ�ڵ����һ���ڵ���nullʱ����ǰ�ڵ㼴��β�ڵ�
				//break;
			}
			cur.next=pre;   //curΪ�׸��ڵ�ʱ��pre����Ϊnull
			pre=cur;
			cur=beh;
		}
		return newhead;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
