package com.mxk.niuke2;
import java.util.*;
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test08 t=new Test08();
		t.LastRemaining_Solution(6, 8);
	}
	public void LastRemaining_Solution(int n, int m) {
        if(n<=1)
        	return ;
        int count=0;;
        int k=n-1;
        int [] deletearr=new int[k];
        int tempd=0;
        for(int i=0;i<k;i++) {  	//��Ҫ�޳�k=n-1��С��
        	count=(m-1)%n;          //ÿ����ǰ��������
        	if(i==0) {
        		deletearr[i]=count;
            	tempd=deletearr[i];
        	}else {
        		tempd=tempd+count+1;
        		if(tempd<=n-1) {
        			deletearr[i]=tempd;	
        		}else {
        			tempd=tempd-5;
        			deletearr[i]=tempd;
        		}
        	}
        	n--;   				//����nֵ
        }
        System.out.println(Arrays.toString(deletearr));
    }

}
