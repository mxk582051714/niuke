package com.mxk.������.�����������ĺ������;
/**
 * ������һ�����飬�ж��Ƿ�Ϊĳ�������������ĺ���������
 * @author HWLUO
 */
public class Solution {
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
		 int key=arr[high];     //���ڵ�
		 int index=low;  		//�ֽ���
		 while(arr[index]<key) {
			 index++;
		 }
		 for(int j=index;j<=high-1;j++) {
			 if(arr[j]<key)
				 return false;
		 }
		 return verify(arr,low,index-1)&&verify(arr,index,high-1);
	 }
}
