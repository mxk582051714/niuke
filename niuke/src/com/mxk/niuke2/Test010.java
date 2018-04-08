package com.mxk.niuke2;

public class Test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test010 t=new Test010();
		int n1=0;
		int n2=-4;
		int sum=t.Add(n1, n2);
		System.out.println("sum="+sum);
	}

	public int Add(int num1, int num2) {
		int sum=0;
		if(num1==0)
			return num2;
		while(num1!=0) {
			sum=num1^num2;  		//二者异或结果，显示的是没有考虑进位的结果
			num1=(num1&num2)<<1;    //按位运算，进位结果，向左移动1
			num2=sum;
		}
//		System.out.println("sum="+sum);
//		System.out.println("num2="+num2);
		return sum;
	}
	
	public int Add1(int num1,int num2) {  
        while(num2!=0){  
            int temp = num1^num2;  
            num2 = (num1 & num2)<<1;  
            num1=temp;  
        }  
        return num1;  
    }  
	
	
	
	
	
	
	
	
	
	
	
}
