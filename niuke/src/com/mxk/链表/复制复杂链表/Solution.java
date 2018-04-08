package com.mxk.链表.复制复杂链表;

public class Solution {
	public RandomListNode Clone(RandomListNode pHead)
    {
		cloneNode(pHead);
		pHead(pHead);
		return ReconnectNode(pHead);
		
    }
	public void cloneNode(RandomListNode pHead ) {
		if(pHead==null)
			return ;
		RandomListNode pnode=pHead;  //复制头结点指针，防止原始链表结构改变
		while(pnode!=null) {
			RandomListNode pclone=new RandomListNode(pnode.label);
			pclone.next=pnode.next;
			pnode.next=pclone;
			pnode=pclone.next;
		}
	}
	public void pHead(RandomListNode pHead) {
		if(pHead==null)
			return ;
		RandomListNode pnode=pHead; 
		while(pnode!=null) {
			pnode.next.random=pnode.random.next;
			pnode=pnode.next.next;
		}
	}
	public RandomListNode ReconnectNode(RandomListNode pHead) {
		if(pHead==null)
			return null;
		RandomListNode pnode=pHead; 
		RandomListNode pclonehead=null;
		RandomListNode pclonenode=null;
		pclonehead=pclonenode=pnode.next;
		pnode=pclonehead.next;
		while(pnode!=null) {
			pclonenode.next=pnode.next;
			pclonenode=pclonenode.next;
			pnode.next=pclonenode.next;
			pnode=pnode.next;
		}
		return pclonehead;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
