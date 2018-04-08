package com.mxk.niuke2;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		int n=3;
		Test05 t=new Test05();
		String s=t.LeftRotateString(str, n);
		System.out.println("s:"+s);
		
	}
	public String LeftRotateString(String str,int n) {
        String newstr=new String();
        
        if(str==null||str.length()==0||n==0)
        	return str;
        int len=str.length();
        int num=n%len;
        String str1=str.substring(0, num);
       // System.out.println();
        String str2= str.substring(num,len);
        
        return str2+str1;
    }

}
