/**
 * 可以很快的求出任意非负整数区间中1出现的次数。
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

	//计算1到n中5的出现的次数
	public int NumberOf1Between1AndN_Solution(int n) {
		int res=0;
		if(n<=0)
			return res;
		int i=1;      //当前位，从右数例如2593，当前位第一位就是3
		while((n/i)!=0) {
			//关键1.就是求出：当前位的数字3、该当前位左边（全部）高位的数字259、该当前位右边低位的数字0
			int cur=(n/i)%10;
			int left=n/(i*10);
			int right=n-(n/i)*i;
			//关键2.根据以上求出的三部分，按照当前值和5的大小进行比较分成三类
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
