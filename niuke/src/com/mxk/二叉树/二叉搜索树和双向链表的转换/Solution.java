package com.mxk.������.������������˫�������ת��;

import com.mxk.������.����������.TreeNode;

public class Solution {
	
	TreeNode head=null;        //�����ͷ���
	TreeNode smallest=null;
	public TreeNode Convert(TreeNode pRootOfTree) {
        midPrint(pRootOfTree);
		return head;
    }
    
	
	public void midPrint(TreeNode root){
		if(root==null)
			return;
		midPrint(root.left);
		if(head==null){  	//�ҵ���Сֵ     //���������������������������Ӧ�������Сֵ��ͷ���head���ڴ˴�����
			head=root;                  //�����������С����Ľڵ� 
			smallest=root;
		}else{         		//�ҵ���һ��ֵ
			smallest.right=root;
			root.left=smallest;
			smallest=root;
		}
		midPrint(root.right);
	}
}
