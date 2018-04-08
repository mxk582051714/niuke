package com.mxk.������.�����������ĺ������;
/**
 * ������һ�����飬�ж��Ƿ�Ϊĳ��������������ǰ��������
 * @author HWLUO
 *
 */

public class Solution2 {
	public static void main(String[] args) {
		Solution2 s=new Solution2();
		int [] arr= {10,8,20,9,11,12,14,15,17};
		boolean b=s.VerifySquenceOfBST(arr);
		System.out.println(b);
	}
	
	
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence==null||sequence.length==0)
			 return false;
		 if(sequence.length==1)
			 return true;
		 return verify(sequence,0,sequence.length-1);
	 }
	 public boolean verify(int [] arr,int low,int high) {
		 if(low>=high)
			 return true;
		 int key=arr[low];     //���ڵ�
		 int index=low+1;  		//�ֽ���
		 while(arr[index]<key) {
			 index++;
		 }
		 for(int j=index;j<=high;j++) {
			 if(arr[j]<key)
				 return false;
		 }
		 return verify(arr,low+1,index-1)&&verify(arr,index,high);
	 }
}
