package com.mxk.������.�ж϶������Ƿ�Ϊ�ԳƵ�;

import java.util.ArrayList;

import com.mxk.������.����������.TreeNode;

public class Snippet {
		//ͨ����⾵�����Գ�
		//�Գƾ���һ�����ڵ㣬�������ӽڵ㣬ҪôȫΪ�գ�Ҫôֵ��ȣ�֮���ٰ������ӽڵ���Ϊ���ڵ㴦��
		//���ݽṹ����������list,һ������������һ����������
		 boolean isSymmetrical(TreeNode root) {
			 if(root==null)
				 return true;
			 ArrayList<TreeNode> leftlist=new ArrayList<>();
			 ArrayList<TreeNode> rightlist=new ArrayList<>();
			 leftlist.add(root.left);
			 rightlist.add(root.right);
			 while(!leftlist.isEmpty()&&!rightlist.isEmpty()) {
				 TreeNode leftnode=leftlist.remove(0);
				 TreeNode rightnode=rightlist.remove(0);
				 if(leftnode==null&&rightnode==null) {
					 continue;
				 }
				 if(leftnode==null||rightnode==null) {
					 return false;
				 }
				 if(leftnode.val!=rightnode.val) {
					 return false;
				 }
				 leftlist.add(leftnode.left);    //������Ҫͬʱ�Ž�ȥ
				 rightlist.add(rightnode.right);
				 leftlist.add(leftnode.right);    //������Ҫͬʱ�Ž�ȥ
				 rightlist.add(rightnode.left);
			 }
			 return true;
		 }
}

