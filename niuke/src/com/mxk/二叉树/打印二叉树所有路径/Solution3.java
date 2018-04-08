package com.mxk.������.��ӡ����������·��;

import java.util.*;

import com.mxk.������.����������.TreeNode;
public class Solution3 {
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right=n5;
		n5.left=n6;
		n5.right=n7;
		Solution3 s=new Solution3();
		 ArrayList<ArrayList<Integer>> res=s.FindPath(n1);
		 for(ArrayList<Integer> nodelist:res) {
			 for(Integer i:nodelist) {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
	}

	private ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
	private Stack<Integer> stack=new Stack<>();  //��ű������Ľڵ�
    public  ArrayList<ArrayList<Integer>> FindPath(TreeNode root) {
       if(root==null)
    	   return result;
       stack.push(root.val);
       if(root.left==null&&root.right==null) { 		//���ж����Ƿ�ΪҶ�ӽڵ�
    	   ArrayList<Integer> path=new ArrayList<>();
    	   for(Integer i:stack) {
    		   path.add(i);
    	   }
    	   result.add(path);
       }
       FindPath(root.left);   //����·�������������ǰ������Ļ���֮��
       FindPath(root.right);
       stack.pop();
       return result;
    }
}
