package com.mxk.niuke2;

public class Test05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		int n=3;
		Test05_1 t=new Test05_1();
		String s=t.LeftRotateString(str, n);
		System.out.println("s:"+s);
		
	}
	//实现算法要求空间复杂度O（1）
	public String LeftRotateString(String str,int n) {
       if(str==null||str.length()<=0||n<0)
    	   return "";
       int len=str.length();
       n%=len;
       char [] charr=str.toCharArray();
       reverse(charr,0,n-1);
       reverse(charr,n,len-1);
       reverse(charr, 0, len-1);
       return new String(charr);
       
    }
	private void reverse(char[] charr,int low,int high) {
		while(low<high) {
			char temp=charr[low];
			charr[low]=charr[high];
			charr[high]=temp;
			low++;
			high--;
		}
	}

}
