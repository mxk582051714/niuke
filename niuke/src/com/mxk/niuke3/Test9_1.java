/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
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
		if(size%2==1) {   //������
			return (double)list.get(size/2);
		}else {
			return ((double)list.get(size/2)+list.get(size/2-1))/2;
		}
	}

}
