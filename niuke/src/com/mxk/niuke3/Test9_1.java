/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */

package com.mxk.niuke3;
import java.util.*;
public class Test9_1 {
	
	
	
	public static void main(String[] args) {
		Test9_1 t=new Test9_1();
		t.Insert(5);
		t.Insert(1);
		t.Insert(2);
		t.Insert(4);
		double mid=t.GetMedian();
		System.out.println("mid:"+mid);
	}
	
	ArrayList<Integer> list=new ArrayList<>();
	public void Insert(Integer num) {
		list.add(num);
		Collections.sort(list);
	}

	public Double GetMedian() {
		double mid=0;
		if(list.size()==0)
			return mid;
		int size=list.size();
		if(size%2==1) {   //奇数个
			return (double)list.get(size/2);
		}else {
			return ((double)list.get(size/2)+list.get(size/2-1))/2;
		}
	}

}
