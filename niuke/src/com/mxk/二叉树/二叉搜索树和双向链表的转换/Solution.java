package com.mxk.二叉树.二叉搜索树和双向链表的转换;

import com.mxk.二叉树.二叉树遍历.TreeNode;

public class Solution {
	
	TreeNode head=null;        //链表的头结点
	TreeNode smallest=null;
	public TreeNode Convert(TreeNode pRootOfTree) {
        midPrint(pRootOfTree);
		return head;
    }
    
	
	public void midPrint(TreeNode root){
		if(root==null)
			return;
		midPrint(root.left);
		if(head==null){  	//找到最小值     //从这以下是中序遍历的输出结果，应该输出最小值，头结点head就在此处设置
			head=root;                  //依次输出按大小排序的节点 
			smallest=root;
		}else{         		//找到下一个值
			smallest.right=root;
			root.left=smallest;
			smallest=root;
		}
		midPrint(root.right);
	}
}
