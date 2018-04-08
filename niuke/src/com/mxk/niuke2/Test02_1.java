/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
package com.mxk.niuke2;
import java.util.*;
public class Test02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test02_1 t=new Test02_1();
		int num[]= {-1,2,3,2,3,5,6,5};
		Map<Integer,Integer> numtime_map=new HashMap<>();
//		numtime_map.put(1, 2);
//		numtime_map.get(1)++;
		
		int num1[]=new int[1];
		int num2[]=new int[1];
		System.out.println("aa");
		t.FindNumsAppearOnce(num, num1, num2);
	}

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if(array==null||array.length<2)
			return;
		//找到所有异或的结果
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum^array[i];
		}
		
		int keyindex=0;
		keyindex=findFirst1(sum);  		//找到最低位1所在的位置
		for(int i=0;i<array.length;i++) {
			if(isBit1(array[i], keyindex)) {
				num1[0]^=array[i];
			}else {
				num2[0]^=array[i];
			}
		}
		System.out.println(num1[0]+"   "+num2[0]);
		
	}
	//找到最低位1所在的位置
	public int findFirst1(int n) {
		int keyindex=0;
		//找到n中最低位是1的位置
		int flag=1;
		while((n&flag)==0&&keyindex<32) {
			keyindex++;
			flag<<=1;
		}
		return keyindex;
	}
	//判断给定数n中在keyindex位置是否为1
	public boolean isBit1(int n,int keyindex) {
		n=n>>keyindex;
		if((n&1)==1) {
			return true;
		}else {
			return false;
		}
	}

}
