package com.mxk.������.�ж������ӽṹ;

import java.util.*;

import com.mxk.������.����������.TreeNode;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//����������һ���ڵ㣬��ô�ͱ�������ýڵ��µ����нڵ㣨�����ĸ��
	//�ӽṹ��������һ���ڵ㣬����ֻȡ�ýڵ�����������������������߶���ȡ
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if(root1==null||root2==null) {
			return false;
		}
		if(root1.val==root2.val) {  //��ȼ����жϸýڵ��µ������ڵ�
			return equal(root1,root2);  //����д���Ǵ����
		}else {      //�ýڵ㲻��ͬ��Ҳ����ֱ���жϲ����ӽṹ�������ж�root1�����������������Ƿ�͸ýڵ����
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
