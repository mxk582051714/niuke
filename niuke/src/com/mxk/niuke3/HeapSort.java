package com.mxk.niuke3;

import java.util.Arrays;

public class HeapSort {
	
	public static void main(String[] args) {
		HeapSort t=new HeapSort();
		int [] arr1= {50,10,90,30,70,40};
		int [] arr= {5,1,2,4,3,10,7};
		t.heapSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
    public int[] heapSort(int[] A, int n) {
        for(int i=(n-1)/2;i>=0;i--){
	            heapOne(A,n,i);
	        }
	        //边输出堆顶，边调整
	        int n1=n;
	        while(n1>0){
	            swap(A,n1-1,0);
	            n1--;
	            heapOne(A,n1,0);
	        }
	        return A ;
    }
    // 非递归
    //k是根节点 
    public static void heapOne(int a[],int n,int k){
        int k1=2*k+1;   //k号节点的左子树
        int k2=2*k+2;   //k号节点的右子树
        int max=k;      //假设根节点最大，找到这课子树中最大 的节点，用max来记录
        while(k1<n){
            if(k1<n&&a[k1]>a[k]){
                max=k1;
            }
            if(k2<n&&a[k2]>a[max]){
                max=k2;
            }
            if(max != k){
                swap(a,max,k);
            }else{
                break;
            }
            k=max;
            k1=2*k+1;
            k2=2*k+2;
        }
    }
    public static void swap(int A[],int a,int b){
        int temp;
        temp=A[b];
        A[b]=A[a];
        A[a]=temp;
    }
    
}
