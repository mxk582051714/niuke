package com.mxk.二叉树.判断树的子结构;

import java.util.*;

import com.mxk.二叉树.二叉树遍历.TreeNode;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//子树：包含一个节点，那么就必须包含该节点下的所有节点（子树的概念）
	//子结构：包含了一个节点，可以只取该节点的左子树或者右子树，或者都不取
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if(root1==null||root2==null) {
			return false;
		}
		if(root1.val==root2.val) {  //相等继续判断该节点下的其他节点
			return equal(root1,root2);  //这种写法是错误的
		}else {      //该节点不相同，也不能直接判断不是子结构，继续判断root1的左子树和右子树是否和该节点相等
			return HasSubtree(root1.left,root2)||HasSubtree(root1.right, root2);
		}
	}
	public boolean equal(TreeNode root1,TreeNode root2) {
		if(root1==null&&root2!=null) {
			return false;
		}else if(root1==null&&root2==null) {
			return true;
		}else if(root1!=null&&root2==null) {
			return true;
		}else {
			if(root1.val==root2.val) {
				return equal(root1.left,root2.left)&&equal(root2.right,root2.right);
			}else {
				return false;
			}
		}
	}
	

}
