package com.mxk.二叉树.二叉树中序遍历的下一个节点;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	TreeLinkNode res=null;
	TreeLinkNode pre=null;
		
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
        	return res;
        TreeLinkNode keynode=pNode;
        while(pNode.next!=null)
        	pNode=pNode.next;
        mid(pNode,keynode);
        return res;
        
    }
	public void mid(TreeLinkNode root,TreeLinkNode keynode) {
		if(root==null)
			return;
		mid(root.left,keynode);
		if(pre!=null&&res==null)
			res=root;
		if(root==keynode) {
			pre=root;
		}
		mid(root.right,keynode);
		
	}

}
