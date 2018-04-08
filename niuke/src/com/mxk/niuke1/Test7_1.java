/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣�
 * ���������������һ������ԡ�����һ������,�����������е�����Ե�����P��
 * ����P��1000000007ȡģ�Ľ������� �����P%1000000007
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
        int [] copy=new int [array.length];  // ������������
        for(int i=0;i<array.length;i++) {
        	copy[i]=array[i];
        }
        
        res=InversePairsCore(array,copy,0,array.length-1);
        return res;
    }
    
    //������Եĺ���
    private static int InversePairsCore(int[] array, int[] copy, int low, int high) {
    	int mid=(low+high)/2;
    	if(low==high)  		//��λ=��λ˵����������ֻ��һ��һ��Ԫ�ز����ٷ���
    		return 0;
    	int left=InversePairsCore(array,copy,low,mid)% 1000000007;
    	int right=InversePairsCore(array,copy,mid+1,high)% 1000000007;
    	
    	int i=mid;		 //��ָ�룬ָ�����������������λ
    	int j=high;   	 //��ָ�룬ָ�����������������λ
    	int locCopy=high;   //�ϲ���������λ�����ұ�
    	int count=0;     //����
    	
    	while(i>=low&&j>mid) {
    		if(array[i]>array[j]) {
    			copy[locCopy]=array[i];
    			locCopy--;
    			i--;
    			count=count+j-mid;
    			if (count >= 1000000007)   //��ֵ��������
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




