package com.mxk.niuke2;

import java.util.ArrayList;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test03 t = new Test03();
		int sum = 15;
		ArrayList<ArrayList<Integer>> reslist = new ArrayList<>();
		reslist = t.FindContinuousSequence(sum);
		for (ArrayList<Integer> list : reslist) {
			System.out.println("���Ϊ" + sum + "   " + list);
		}
	}
	// public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	// ArrayList<ArrayList<Integer> > reslist=new ArrayList<>();
	// if(sum<=2) {
	// return reslist;
	// }
	// int small=1;
	// int big=2; //��¼�������У�ֻ��Ҫ֪��small��big����ֵ
	// int currentsum=3; //��¼��ǰ����ֵ�ͣ���sum�Ƚϣ�����������small��������big
	// int len=sum/2; //����ѭ������������Ҫ��smallҪС��len,��Ϊ��������Ҫ���������а�������
	//
	// while(small<=len) {
	// if(currentsum==sum) {
	// ArrayList<Integer> list=new ArrayList<>();
	// for(int i=small;i<=big;i++) {
	// list.add(i);
	// }
	// reslist.add(list);
	// currentsum-=small;
	// small++;
	// }else if(currentsum<sum) {
	// big++;
	// currentsum+=big;
	// }else {
	// currentsum-=small;
	// small++;
	// }
	// }
	// return reslist;
	//
	// }

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if (sum < 3)
			return list;
		int s = (int) Math.sqrt(2 * sum);//��ȫ������ѧ��ʽ�������
		for (int i = s; i >= 2; i--) {
			if (2 * sum % i == 0) {   	 //
				int d = 2 * sum / i;
				if (d % 2 == 0 && i % 2 != 0 || d % 2 != 0 && i % 2 == 0) {
					int a1 = (d - i + 1) / 2;
					int an = (d + i - 1) / 2;
					ArrayList<Integer> temp = new ArrayList<Integer>();
					for (int j = a1; j <= an; j++)
						temp.add(j);
					list.add(temp);
				}
			}
		}
		return list;
	}

}
