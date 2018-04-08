package com.mxk.二叉树.打印二叉树所有路径;

import java.util.*;

import com.mxk.二叉树.二叉树遍历.TreeNode;
public class Solution2 {
	
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
		Solution2 s=new Solution2();
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
	private ArrayList<Integer> arr=new ArrayList<Integer>();
	int num=0;
	
    public  ArrayList<ArrayList<Integer>> FindPath(TreeNode root) {
        if(root==null){
            return result;
        }
        arr.add(root.val);    			//向队列中添加数据
        if((root.left==null)&&(root.right==null)){
            ArrayList<Integer> path = new ArrayList<Integer>();
            for(int i=0;i<arr.size();i++){
                path.add(arr.get(i));
            }
            result.add(path);
        }
        if(root.left!=null){
            FindPath(root.left);
        }
        if(root.right!=null){
            FindPath(root.right);
        }
        arr.remove(arr.size()-1); //递归的精髓
        return result;
    }
}
