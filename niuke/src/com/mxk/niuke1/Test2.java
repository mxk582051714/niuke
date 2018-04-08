package com.mxk.niuke1;

import java.util.*;  

public class Test2 {  
    public static final int N = 5;  
  
    
  
    public static void main(String[] args) {  
        int[] a = new int[N];  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("请输入数据：");
        for (int i = 0; i < N; i++) {  
            a[i] = scanner.nextInt();
           //System.out.println("完成第"+i+"个数据输入！");
        }  
  
    } 
    public static int max(int a, int b) {  //取出二者之间的最大值
        return a > b ? a : b;  
    } 
    public int FindGreatestSumOfSubArray(int[] array) {
    	if (array.length == 0)
			return 0;
        int total=array[0];   //记录前i-1个元素的对第i个元素的贡献值
        int maxSum=array[0];  //记录当前的和最大值
        for(int i=1;i<array.length;i++) {
        	if(total>=0) {
        		total+=array[i];  //有贡献
        	}else {
        		total=array[i];   //没有贡献，就抛弃前i-1个值
        	}
        	
        	if(total>maxSum) {
        		maxSum=total;
        	}
        }
        return maxSum;
    }
    
    
    
  
}  