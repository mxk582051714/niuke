package com.mxk.niuke1;

import java.util.*;  

public class Test2 {  
    public static final int N = 5;  
  
    
  
    public static void main(String[] args) {  
        int[] a = new int[N];  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("���������ݣ�");
        for (int i = 0; i < N; i++) {  
            a[i] = scanner.nextInt();
           //System.out.println("��ɵ�"+i+"���������룡");
        }  
  
    } 
    public static int max(int a, int b) {  //ȡ������֮������ֵ
        return a > b ? a : b;  
    } 
    public int FindGreatestSumOfSubArray(int[] array) {
    	if (array.length == 0)
			return 0;
        int total=array[0];   //��¼ǰi-1��Ԫ�صĶԵ�i��Ԫ�صĹ���ֵ
        int maxSum=array[0];  //��¼��ǰ�ĺ����ֵ
        for(int i=1;i<array.length;i++) {
        	if(total>=0) {
        		total+=array[i];  //�й���
        	}else {
        		total=array[i];   //û�й��ף�������ǰi-1��ֵ
        	}
        	
        	if(total>maxSum) {
        		maxSum=total;
        	}
        }
        return maxSum;
    }
    
    
    
  
}  