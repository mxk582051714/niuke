/**
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 */

package com.mxk.niuke1;

public class Test3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3_1 test = new Test3_1();
		int res = 0;
		res = test.NumberOf1Between1AndN_Solution(2593);
		System.out.println(res);

	}

	//����1��n��5�ĳ��ֵĴ���
	public int NumberOf1Between1AndN_Solution(int n) {
		int res=0;
		if(n<=0)
			return res;
		int i=1;      //��ǰλ������������2593����ǰλ��һλ����3
		while((n/i)!=0) {
			//�ؼ�1.�����������ǰλ������3���õ�ǰλ��ߣ�ȫ������λ������259���õ�ǰλ�ұߵ�λ������0
			int cur=(n/i)%10;
			int left=n/(i*10);
			int right=n-(n/i)*i;
			//�ؼ�2.������������������֣����յ�ǰֵ��5�Ĵ�С���бȽϷֳ�����
			if(cur==5) {
				res+=(left*i+right+1);
			}else if(cur<5) {
				res+=left*i;
			}else {
				res+=(left*i+i);
			}
			//System.out.println("cur:"+cur+"  left:"+left+"   right:"+right);
			i*=10;
		}
		
		return res;
	}

}
