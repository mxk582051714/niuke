package com.mxk.niuke3;

public class Test7_3 {

	StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n8 = new TreeNode(8);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n3.left=n5;
		n3.right=n6;
		
		Test7_3 t = new Test7_3();
		String s1=t.Serialize(n1);
		System.out.println(s1);
		
		
		
		String str ="1,2,4,#,#,#,3,5,#,#,6,#,#,";
		t.Deserialize(str);
		
		System.out.println(str);
//		System.out.println("str.length:"+str.length());
		
		
		
	}

	

	String Serialize(TreeNode root) {
		StringBuilder sb=new StringBuilder();
		if(root==null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val+",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		
		return sb.toString();
		
	}
	public int index = -1;
	TreeNode Deserialize(String str) {
		index++;
		String [] arr=str.split(",");
		TreeNode root=null;
		if(!arr[index].equals("#")) {
			root=new TreeNode(Integer.parseInt(arr[index]));
			root.left=Deserialize(str);
			root.right=Deserialize(str);
		}
		return root;
	}

}
