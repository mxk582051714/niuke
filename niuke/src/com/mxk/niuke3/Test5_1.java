/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ��
 * 
 * ����ܼ򵥣��ؼ�����֪����ô�������ж�һ��
�������Ƿ�Գƣ�ֻҪ����ǰ�����򡢺��򡢲�α������κ�һ�ֱ�����������Ϊ������Һ���
�Һ������ַ�����ֻҪ���ν����Ⱦ�˵���������һ�ŶԳƶ�����
 * 
 */


package com.mxk.niuke3;
import java.util.*;
public class Test5_1 {
	List<TreeNode> list=new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n7=new TreeNode(7);
		TreeNode n8=new TreeNode(8);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n5.left=n7;
		n5.right=n8;
//		n2.next=n1;
//		n3.next=n1;
//		n4.next=n2;
//		n5.next=n2;
//		n7.next=n5;
//		n8.next=n5;
		Test5_1 t=new Test5_1();
//		t.qianxu(n1);
//		System.out.println();
//		t.jingxiang(n1);
//		t.qianxu(n1);
		
		System.out.println(t.isSymmetrical(n1));
		
	}

	boolean isSymmetrical(TreeNode pRoot)
    {
		if(pRoot==null)
			return false;
		
		return compare(pRoot.left,pRoot.right);
    }
	public boolean compare(TreeNode left,TreeNode right) {
		if(left==null&&right==null)
			return true;
		if(left==null||right==null) {
			return false;
		}
		return left.val==right.val&&compare(left.right,right.left)&&compare(left.left,right.right);
	}
	//��һ�ַ���
	public boolean isSymmetrical1(TreeNode pRoot) {
		if(pRoot==null)
			return true;
		Deque<TreeNode> q1=new LinkedList<>();
		Deque<TreeNode> q2=new LinkedList<>();
		q1.offer(pRoot.left);
		q2.offer(pRoot.right);
		
		while(!q1.isEmpty()&&!q2.isEmpty()) {
			TreeNode left=q1.poll();
			TreeNode right=q2.poll();
			if(left==null&&right==null)
				continue;
			if(left==null||right==null)
				return false;
			if(left.val!=right.val) {
				return false;
			}
			q1.offer(left.left);
			q2.offer(right.right);
			q1.offer(left.right);
			q2.offer(right.left);
		}
		return true;
	}
	
	
	
	
	
	
	
	//ʵ��һ�Ŷ������ľ���
	public void Mirror(TreeNode root) {
		if(root==null)
			return;
		TreeNode temp=root.right;
		root.right=root.left;
		root.left=temp;
		Mirror(root.left);
		Mirror(root.right);
		
	}
//	 if(root==null)
//			return;
//		if(root.left!=null||root.right!=null){   //�൱��ǰ����������ʽڵ�ĳɸı����ҽڵ�
//			TreeNode temp=root.left;
//			root.left=root.right;
//			root.right=temp;
//		}
//		if(root.left!=null)        //����������
//			Mirror(root.left);
//		if(root.right!=null)         //����������
//			Mirror(root.right);
	public void qianxu(TreeNode root) {
		if(root==null)
			return;
		System.out.print(root.val+"  ");
		qianxu(root.left);
		qianxu(root.right);
	}
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}