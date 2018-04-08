package com.mxk.niuke2;
import java.util.*;
public class CheckBalance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		
		node1.left=node2;
		//node1.right=node3;
		node2.left=node4;
		//node2.right=node5;
		
		CheckBalance c=new CheckBalance();
		//boolean b=c.check(node1);
		//System.out.println(b);
		ArrayList<String> list=new ArrayList<>();
		int a=1;
		
		
		c.addd(list,a);
		System.out.println(list+"   .."+a);
		
	}
	boolean res = true;
	
	public boolean check(TreeNode root) {
      
        getHeight(root, 1, res);
        return res;
    }
	public void addd(ArrayList<String> nlist,int b) {
		nlist.add("mxk");
		nlist.add("aa");
		b++;
	}
 
    private int getHeight(TreeNode node, int level, boolean res) {
        if (node == null) {
            return level;
        }
        int leftHeight = getHeight(node.left, level + 1, res);
        if (!res) {
            return level;
        }
        int rightHeight = getHeight(node.right, level + 1, res);
        if (!res) {
            return level;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
        	System.out.println("≤‚ ‘");
        	
            res = false;
            return Math.max(leftHeight, rightHeight);
        }
        return Math.max(leftHeight, rightHeight);
    }

}
