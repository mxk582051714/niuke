package com.mxk.链表.输出倒数第k个节点;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	int count=0;
	ListNode keynode=null;
	public ListNode FindKthToTail(ListNode head,int k) {
			if(head==null||k<=0)
				return null;
			FindKthToTail(head.next, k);
			count++;
			if(count==k)
				keynode=head;
		return keynode;
    }
	

}
