/**
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
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
		//�ҵ��������Ľ��
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum^array[i];
		}
		
		int keyindex=0;
		keyindex=findFirst1(sum);  		//�ҵ����λ1���ڵ�λ��
		for(int i=0;i<array.length;i++) {
			if(isBit1(array[i], keyindex)) {
				num1[0]^=array[i];
			}else {
				num2[0]^=array[i];
			}
		}
		System.out.println(num1[0]+"   "+num2[0]);
		
	}
	//�ҵ����λ1���ڵ�λ��
	public int findFirst1(int n) {
		int keyindex=0;
		//�ҵ�n�����λ��1��λ��
		int flag=1;
		while((n&flag)==0&&keyindex<32) {
			keyindex++;
			flag<<=1;
		}
		return keyindex;
	}
	//�жϸ�����n����keyindexλ���Ƿ�Ϊ1
	public boolean isBit1(int n,int keyindex) {
		n=n>>keyindex;
		if((n&1)==1) {
			return true;
		}else {
			return false;
		}
	}

}
