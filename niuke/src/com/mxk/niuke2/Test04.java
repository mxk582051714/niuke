package com.mxk.niuke2;
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test04 t=new Test04();
		ArrayList<Integer> reslist=new ArrayList<>();
		int [] array= {1,2,4,7,11,16};
		int sum=10;
		reslist=t.FindNumbersWithSum(array, sum);
		System.out.println("结果："+reslist);
	}
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> reslist=new ArrayList<>();
		ArrayList<Integer> prolist=new ArrayList<>();
		if(array==null||array.length<2)
			return reslist;
		int len=array.length;   //数组长度
		int oneindex=0;
		int another=0;
		
		while(oneindex<len) {
			 another=sum-array[oneindex];
			 if(oneindex==len-1)
				 break;
			 if(another>=array[oneindex+1]&&another<=array[len-1]) {
				//可能存在
				if(findanother(array, oneindex+1, another)) {
					int pro=array[oneindex]*another;
					prolist.add(pro);
					reslist.add(array[oneindex]);
					reslist.add(another);
				}
			}
			oneindex++;
		}
		
		
		if(prolist.size()>0) {
			System.out.println("中间结果："+reslist);
			int samllproindex=0;
			//对乘积进行排序，取出乘积最小的索引
			for(int i=1;i<prolist.size();i++) {
				if(prolist.get(samllproindex)>prolist.get(i)){
					samllproindex=i;
				}
			}
			int one=reslist.get(samllproindex*2);
			int two=reslist.get(samllproindex*2+1);
			reslist.clear();
			reslist.add(one);
			reslist.add(two);
		}
		return reslist;
    }
	public boolean findanother(int [] array,int low,int another) {
		for(int i=low;i<array.length;i++) {
			if(another==array[i])
				return true;
		}
		return false;
	}

}
