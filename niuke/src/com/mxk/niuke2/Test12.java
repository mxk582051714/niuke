/**
 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
 *  ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
 *  Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
 *   ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2
 */

package com.mxk.niuke2;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    boolean b=false;
	    if(numbers==null||numbers.length<2)  //��������������
	    	return false;
	    //��������numbers
	    for(int i=0;i<numbers.length;i++) {
	    	int num=numbers[i];
	    	if(num>=length) {
	    		return false;
	    	}
	    	if(num<0) {
	    		num=Math.abs(num);
	    	}
	    	//numֵ��Ӧ������λ��Ҫȡ��
	    	if(numbers[num]<0) {
	    		duplication[0]=-numbers[num];
	    		return true;
	    	}
	    	numbers[num]*=(-1);
	    }
	    return b;    
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
