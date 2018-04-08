
/**
 * �������������ҳ����ǵĵ�һ��������㡣
 * �����������������ڵ�һ�������ڵ�֮������нڵ㶼����ͬ�ģ��������������������Ϊͬһ���ڵ��nextָ��
 * ֻ��ָ��ͬһ���ڵ�
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
	 * ˼·��һ���򵥵ķ����ǣ����ȱ�����������õ����ǵĳ��ȣ�����֪���ĸ�����Ƚϳ���
	 * �Լ���������ȶ̵�����༸���ڵ㡣�ڵڶ��α�����ʱ�����ڽϳ��Ľڵ��������ɲ���
	 * ����ͬʱ�����������ϱ������ҵ��ĵ�һ����ͬ�Ľڵ�������ǵĹ����Ľڵ�
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
