package com.mxk.������.�����������ĵ�k���ڵ�;

import com.mxk.������.����������.TreeNode;
import java.util.*;
/**
 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
 * ���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
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
	
	//�ǵݹ�������������������ǵݹ���㷨
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
