package com.mxk.链表合并两个排序链表;

public class Solution {
	 public ListNode Merge(ListNode list1,ListNode list2) {
		 	if(list1==null)
		 		return list2;
		 	if(list2==null)
		 		return list1;
	        ListNode nroot=new ListNode(0);
	        ListNode proot=nroot;
	        ListNode cur=null;
	        while(list1!=null&&list2!=null) {
	        	if(list1.val<=list2.val) {
	        		cur=list1;
	        		list1=list1.next;
	        	}else {
	        		cur=list2;
	        		list2=list2.next;
	        	}
	        	nroot.next=cur;
	        	nroot=cur;
	        }
	        if(list1!=null)
		 		 nroot.next=list1;
		 	if(list2!=null)
		 		nroot.next=list2;
		 	
		 	return proot.next;
	  }
}
  