/*
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * time��12.11
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
