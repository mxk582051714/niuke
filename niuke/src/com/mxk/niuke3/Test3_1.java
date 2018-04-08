/*
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * time：12.11
 */

package com.mxk.niuke3;



public class Test3_1 {
	
	
	public static void main(String[] args) {
		Test3_1 t=new Test3_1();
		t.Insert('a');
		t.Insert('d');
		t.Insert('d');
		t.Insert('a');
		t.Insert('c');
		t.Insert('a');
		t.Insert('e');
		System.out.println(t.FirstAppearingOnce());
	}
	
	StringBuffer sb=new StringBuffer();
	int [] hashtable=new int[256];
	public void Insert(char ch)
    {
        sb.append(ch);
       hashtable[ch]++;
    }
	
	public char FirstAppearingOnce()
    {
		char ch='#';
		char [] arr=sb.toString().toCharArray();
		for(char c:arr) {
			if(hashtable[c]==1)
				return c;
		}
		return ch;
    }
}
