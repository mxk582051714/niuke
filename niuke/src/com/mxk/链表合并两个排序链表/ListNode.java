package com.mxk.����ϲ�������������;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (obj instanceof ListNode) {
			if (((ListNode) obj).val==(this.val))
				return true;
		}
		return false;
	}
}
