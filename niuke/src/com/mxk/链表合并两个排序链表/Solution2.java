package com.mxk.链表合并两个排序链表;

/**
 * 三个链表合并
 * 
 * @author HWLUO
 *
 */
public class Solution2 {
	
	public static void main(String[] args) {
		Solution2 s=new Solution2();
		ListNode node1_1=new ListNode(4);
		ListNode node1_2=new ListNode(5);
		ListNode node1_3=new ListNode(10);
		ListNode node1_4=new ListNode(12);
		node1_1.next=node1_2;
		node1_2.next=node1_3;
		node1_3.next=node1_4;
		
		ListNode node2_1=new ListNode(6);
		ListNode node2_2=new ListNode(8);
		node2_1.next=node2_2;
		
		ListNode node3_1=null;
//		ListNode node3_1=new ListNode(2);
//		ListNode node3_2=new ListNode(7);
//		node3_1.next=node3_2;
		
		ListNode node=s.Merge(node1_1, node2_1, node3_1);
		
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
	}
	
	
	
	public ListNode Merge(ListNode list1, ListNode list2, ListNode list3) {

		if (list1 == null && list2 == null)
			return list3;
		if (list1 == null && list3 == null)
			return list2;
		if (list2 == null && list3 == null)
			return list1;

		ListNode nroot = new ListNode(0);
		ListNode proot = nroot;
		ListNode cur = null;
		while ((list1 != null && list2 != null) || (list1 != null && list3 != null) || (list2 != null && list3 != null)) {
			// 选出三点之间最小的节点
			cur=min(list1, list2, list3);
			if(list1!=null&&list1.val==cur.val)
				list1=list1.next;
			if(list2!=null&&list2.val==cur.val)
				list2=list2.next;
			if(list3!=null&&list3.val==cur.val)
				list3=list3.next;
			nroot.next = cur;
			nroot = cur;
		}
		
		
		if (list1 != null)
			nroot.next = list1;
		if (list2 != null)
			nroot.next = list2;
		if (list3 != null)
			nroot.next = list3;
		
		return proot.next;
	}

	ListNode min(ListNode list1, ListNode list2, ListNode list3) {
		ListNode cur = null;
		if (list1 != null && list2 != null) {
			cur=min_two(list1,list2);
			if(list3!=null){
				cur=min_two(cur, list3);
			}
		}else if(list1 != null && list3 != null) {
			cur=min_two(list1,list3);
			if(list2!=null){
				cur=min_two(cur, list2);
			}
		}else if(list2 != null && list3 != null) {
			cur=min_two(list2,list3);
			if(list1!=null){
				cur=min_two(cur,list1);
			}
			
		}
		return cur;
	}
	ListNode min_two(ListNode list1, ListNode list2) {
		ListNode cur = null;
		if (list1.val <= list2.val) {
			cur = list1;
		}else {
			cur=list2;
		}
		return cur;
		
	}
	
	
	

}
