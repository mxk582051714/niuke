/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
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
	 * 通过分别设置每个B[i]的上下三角部分的数据
	 * @param A
	 * @return
	 */
	public int[] multiply1(int[] A) {
		int [] B=new int[A.length];
		if(A==null||A.length==0)
			return B;
		B[0]=1;
		//计算下三角部分,
		for(int i=1;i<B.length;i++) {
			B[i]=B[i-1]*A[i-1];  //b[1]=a[0],b[2]=a[0]*a[1]
		}
		//计算上三角部分，最后一个数b[n-1]已经计算完成，即它只有下三角部分
		//因此，j从len-2开始计算
		int temp=1;
		for(int j=B.length-2;j>=0;j--) {
			temp*=A[j+1];
			B[j]*=temp;
		}
		return B;
    }
	
	
	
	
	
	
	
	
	
	
	
	

}
