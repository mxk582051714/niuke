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
	 * ���������������ģ�⻷��˼·���ǱȽϼ򵥣����Ǹ����±�Ҫ����
	 */
	public static int findLastNumber(int n, int m) {
		if (n < 1 || m < 1)
			return -1;
		int[] array = new int[n]; 
		int i = -1, step = 0, count = n;
		while (count > 0) { 		// ����ѭ��ʱ�����һ��Ԫ��Ҳ����Ϊ��-1
			i++; 					// ָ����һ����ɾ���������һ��Ԫ�ء�
			if (i >= n)
				i = 0; 				// ģ�⻷��
			if (array[i] == -1)
				continue; 			// ������ɾ���Ķ���
			step++; 				// ��¼���߹��ġ�
			if (step == m) { 		// �ҵ���ɾ���Ķ���
				array[i] = -1;
				step = 0;
				count--;
			}
		}
		return i;		//��������ѭ��ʱ��i,�����һ��������Ϊ-1��Ԫ��
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
