/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó���
 */

package com.mxk.niuke2;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] multiply(int[] A) {
		int [] B=new int[A.length];
		if(A==null||A.length==0)
			return B;
		
		for(int i=0;i<B.length;i++) {
			B[i]=1;
			for(int j=0;j<A.length;j++) {
				if(j==i)
					continue;
				B[i]*=A[j];
			}
		}
		return B;
    }
	/**
	 * ͨ���ֱ�����ÿ��B[i]���������ǲ��ֵ�����
	 * @param A
	 * @return
	 */
	public int[] multiply1(int[] A) {
		int [] B=new int[A.length];
		if(A==null||A.length==0)
			return B;
		B[0]=1;
		//���������ǲ���,
		for(int i=1;i<B.length;i++) {
			B[i]=B[i-1]*A[i-1];  //b[1]=a[0],b[2]=a[0]*a[1]
		}
		//���������ǲ��֣����һ����b[n-1]�Ѿ�������ɣ�����ֻ�������ǲ���
		//��ˣ�j��len-2��ʼ����
		int temp=1;
		for(int j=B.length-2;j>=0;j--) {
			temp*=A[j+1];
			B[j]*=temp;
		}
		return B;
    }
	
	
	
	
	
	
	
	
	
	
	
	

}
