package com.mxk.niuke3;

public class Test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_1 t=new Test1_1();
		String str="bac";
		String pattern="acb*";
		
		boolean b=t.match(str.toCharArray(), pattern.toCharArray());
//		boolean b=t.match("aaa".toCharArray(), "b*a.a".toCharArray());
		System.out.println(b);
	}

	public boolean match(char[] str, char[] pattern) {
		if (str == null || pattern == null)
			return false;

		return matchCore(str, 0, pattern, 0);
	}

	public boolean matchCore(char[] str, int s, char[] pattern, int p) {
		if (str.length <= s && pattern.length <= p)
			return true;  // ��ƥ������
		if (str.length > s && pattern.length <= p)
			return false; // ģʽ���ˣ��ַ�������
		// ģʽ��a*aû������ƥ�䴮�ɽ����ɲ�����
		
		//������������ʼƥ��
		if (p + 1 < pattern.length && pattern[p + 1] == '*'){		// ��ǰpattern����һ����*��ʱ
			// �ַ�������
			if (s >= str.length)
				return matchCore(str, s, pattern, p + 2);
			else {
				//���ģ�������ǰ�ַ�ƥ�䣨ƥ��Ļ�Ҳ�ֳ������������ȣ�����ģʽ�е�ǰ�ַ���.��
				if (pattern[p] == str[s] || pattern[p] == '.') {
					// ��ǰλ��ƥ����ɣ��ƶ�����һ��ģʽ��
					return matchCore(str, s + 1, pattern, p + 2) || matchCore(str, s + 1, pattern, p)
							|| matchCore(str, s, pattern, p + 2);
				} else
				//���ģ���ǰ�ַ���ƥ�䣬��ôstr�Ͳ�Ҫ���ˣ�ģʽ��p��*�ַ��϶�����ʹ�õ�ǰ�ַ�����0�ε�Ч�����磺aaa,b*a.
					return matchCore(str, s, pattern, p + 2);
			}
		}
					
																 // ��ǰpattern����һ������*ʱ��
		if (s >= str.length)
			return false;
		else {
			if (str[s] == pattern[p] || pattern[p] == '.')
				return matchCore(str, s + 1, pattern, p + 1);
		}
		return false;
	}

}
