package com.mxk.链表.倒序打印节点;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        if(listNode==null)
        	return res;
        while(listNode!=null) {
        	stack.push(listNode);
        	listNode=listNode.next;
        }
        while(!stack.isEmpty()) {
        	res.add(stack.pop().val);
        }
        return res;
    }
    ArrayList<Integer> res=new ArrayList<>();
	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		 if(listNode==null)
	        return res;
		 printListFromTailToHead1(listNode.next);
		 res.add(listNode.val);
		return res;
    }

}
