package com.mxk.niuke2;

import java.util.*;

public class Test08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test08_1 t = new Test08_1();
		ArrayList<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.remove(1);
		list.remove(2);
		System.out.println("list:"+list);
		int res=findLastNumber(6, 2);
		int res1=t.LastRemaining_Solution(6, 2);
		System.out.println("res1:"+res1);
	}

	/*
	 * 这道题我用数组来模拟环，思路还是比较简单，但是各种下标要理清
	 */
	public static int findLastNumber(int n, int m) {
		if (n < 1 || m < 1)
			return -1;
		int[] array = new int[n]; 
		int i = -1, step = 0, count = n;
		while (count > 0) { 		// 跳出循环时将最后一个元素也设置为了-1
			i++; 					// 指向上一个被删除对象的下一个元素。
			if (i >= n)
				i = 0; 				// 模拟环。
			if (array[i] == -1)
				continue; 			// 跳过被删除的对象。
			step++; 				// 记录已走过的。
			if (step == m) { 		// 找到待删除的对象。
				array[i] = -1;
				step = 0;
				count--;
			}
		}
		return i;		//返回跳出循环时的i,即最后一个被设置为-1的元素
	}
	
	int LastRemaining_Solution(int n, int m)  
    {  
        if(n < 1 || m < 1)  
            return -1;  
        int last = 0;  
        for(int i = 2; i <=n; i++) {
        	last = (last + m) % i;  
        	System.out.println(last);
        }
            
          
        return last;  
    }  
}
