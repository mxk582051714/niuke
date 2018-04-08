/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
package com.mxk.niuke1;

import java.util.Arrays;

public class Test7_1 {
	

    public static void main(String[] args) {
        int[] array = {7,5,6,4,11,2};
        System.out.println(InversePairs(array)); // 3
    }
	

    public static int InversePairs(int[] array) {
        int res=0;
        if(array==null&&array.length<1)
        	return res;
        int [] copy=new int [array.length];  // 建立辅助数组
        for(int i=0;i<array.length;i++) {
        	copy[i]=array[i];
        }
        
        res=InversePairsCore(array,copy,0,array.length-1);
        return res;
    }
    
    //求逆序对的核心
    private static int InversePairsCore(int[] array, int[] copy, int low, int high) {
    	int mid=(low+high)/2;
    	if(low==high)  		//高位=低位说明子数组中只有一个一个元素不能再分了
    		return 0;
    	int left=InversePairsCore(array,copy,low,mid)% 1000000007;
    	int right=InversePairsCore(array,copy,mid+1,high)% 1000000007;
    	
    	int i=mid;		 //左指针，指向的是左子数组的最高位
    	int j=high;   	 //右指针，指向的是右子数组的最高位
    	int locCopy=high;   //合并数组的最高位，最右边
    	int count=0;     //计数
    	
    	while(i>=low&&j>mid) {
    		if(array[i]>array[j]) {
    			copy[locCopy]=array[i];
    			locCopy--;
    			i--;
    			count=count+j-mid;
    			if (count >= 1000000007)   //数值过大求余
				{
					count %= 1000000007;
				}
    		}else {
    			copy[locCopy]=array[j];
    			locCopy--;
    			j--;
    		}
    	}
    	
    	while(i>=low) {
    		copy[locCopy]=array[i];
			locCopy--;
			i--;
    	}
    	while(j>mid) {
    		copy[locCopy]=array[j];
			locCopy--;
			j--;
    	}
    	
    	for (int s = low; s <= high; s++) {
			array[s] = copy[s];
		}
		System.out.println(Arrays.toString(array));
    	
    	
    	return (left+right+count)% 1000000007;
       
    }
}




