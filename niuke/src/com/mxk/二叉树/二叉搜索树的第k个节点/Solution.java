package com.mxk.二叉树.二叉搜索树的第k个节点;

import com.mxk.二叉树.二叉树遍历.TreeNode;
import java.util.*;
/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 * @author HWLUO
 *
 */
public class Solution {
	
	
	int index=0;
	TreeNode res=null;
	TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null)
        	return res;
        KthNode(pRoot.left, k);
        index++;
        if(index==k)
        	res=pRoot;
        KthNode(pRoot.right, k);
        return res;
    }
	
	//非递归解决，本质是中序遍历非递归的算法
	TreeNode KthNode1(TreeNode pRoot, int k)
    {
        if(pRoot==null||k==0)
        	return null;
        Stack<TreeNode> stack=new Stack<>();
        int count=0;
        while(pRoot!=null||!stack.isEmpty()) {
        	while(pRoot!=null) {
        		stack.push(pRoot);
        		pRoot=pRoot.left;
        	}
        	pRoot=stack.pop();
        	count++;
        	if(count==k)
        		return pRoot;
        	pRoot=pRoot.right;
        }
        return null;
    }
	
	
	
	
}
