package com.mxk.niuke1;

public class Test5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5_1 test = new Test5_1();
		int res = test.GetUglyNumber_Solution(10);
		System.out.println("res:" + res);
	}
	//ȡ�õ�index������
	//�÷������Ӷ���o(n),��ֱ�Ӹ�����֪�ĳ����������һ�������������ж�һ�����Ƿ��ǳ���
	public int GetUglyNumber_Solution(int index){
		if(index<=0)
			return 0;
		if(index<7)
			return index;
		int [] res=new int[index];  //������ų���
		res[0]=1;
		int t2=0,t3=0,t5=0;//t2:����2*t2���ɵĳ�����t2=(1,2,3,4,5,6,8,9,..)
		
		for(int i=1;i<index;i++) {
			res[i]=Math.min(2*res[t2],Math.min(3*res[t3], 5*res[t5]));//�ҵ���һ������
			if(res[i]==2*res[t2])
				t2++;
			if(res[i]==3*res[t3])
				t3++;
			if(res[i]==5*res[t5])
				t5++;
		}
		return res[index-1];
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
