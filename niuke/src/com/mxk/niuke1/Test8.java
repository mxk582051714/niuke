
/**
 * 输入两个链表，找出它们的第一个公共结点。
 * 分析：这两个链表，在第一个公共节点之后的所有节点都是相同的，不是我所想的那样，因为同一个节点的next指针
 * 只能指向同一个节点
 */
package com.mxk.niuke1;

public class Test8 {

	public static void main(String[] args) {
		Test8 t=new Test8();
		// TODO Auto-generated method stub
		ListNode pHead1=new ListNode(1);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		ListNode n3=new ListNode(4);
		pHead1.next=n1;
		n1.next=n2;
		n2.next=n3;
		
		ListNode pHead2=new ListNode(3);
		pHead2.next=n1;
		
		ListNode res=null;
		
		res=t.FindFirstCommonNode(pHead1, pHead2);
		System.out.println(res.val);
		
	}
	/**
	 * 思路：一个简单的方法是：首先遍历两个链表得到它们的长度，就能知道哪个链表比较长，
	 * 以及长的链表比短的链表多几个节点。在第二次遍历的时候，先在较长的节点上走若干步，
	 * 接着同时在两个链表上遍历，找到的第一个相同的节点就是它们的公共的节点
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode res=null;
		int len1=getLen(pHead1);
		int len2=getLen(pHead2);
		int length=len1-len2;
		ListNode shorthead=pHead2;
		ListNode longhead=pHead1;
		
		if(len2>len1) {
			length=len2-len1;
			shorthead=pHead1;
			longhead=pHead2;
		}
		while(length!=0) {
			longhead=longhead.next;
			length--;
		}
		
		while(shorthead!=null&&longhead!=null&&shorthead!=longhead) {
			shorthead=shorthead.next;
			longhead=longhead.next;
		}
		res=longhead;
		return res;
    }
	public int getLen(ListNode head){
		int len=0;
		while(head!=null) {
			len++;
			head=head.next;
		}
		return len;
	}
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
