package com.mxk.niuke3;

public class Test1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_3 t = new Test1_3();
		String str = "";
		String pattern = ".*";

		boolean b = t.match(str.toCharArray(), pattern.toCharArray());
		// boolean b=t.match("aaa".toCharArray(), "b*a.a".toCharArray());
		System.out.println(b);
	}

	public boolean match(char[] str, char[] pattern) {
		//���Ϊ��
		if(str==null||pattern==null)
			return false;
		int s=0;
		int p=0;
		return matchCore(str, s, pattern, p);
	}

	public boolean matchCore(char[] str, int s, char[] pattern, int p) {
		//str,patternͬʱƥ�����
		if(str.length==s&&pattern.length==p)
			return true;
		
		//str����ʣ��,patternƥ����ϣ��ǿ϶�������ȫƥ��
		if(s<str.length&&p==pattern.length) {   
			return false;
		}
		
		//strƥ����ϣ�pattern����ʣ�࣬����ƥ��ɹ���Ҳ���ܲ��ɹ�����Ϊa*����ƥ��0��
		if(s==str.length&&p<pattern.length) {
			//ƥ��ɹ������
			if(p+1<pattern.length&&pattern[p+1]=='*') {
				return matchCore(str, s, pattern, p+2);
			}
			//ƥ�䲻�ɹ�
			return false;
		}
		
		//str��pattern����ʣ��
		if(s<str.length&&p<pattern.length) {
			//�����ǰ�ַ���ǰһ���ַ���*
			if(p+1<pattern.length&&pattern[p+1]=='*') {
				//1.��ǰ�ַ�ƥ��
				if(pattern[p]==str[s]||pattern[p]=='.') {
					return matchCore(str, s, pattern, p + 2)// ģʽ����2����Ϊx*ƥ��0���ַ�
							|| matchCore(str, s + 1, pattern, p + 2)// ��Ϊģʽƥ��1���ַ�
							|| matchCore(str, s + 1, pattern, p);// *ƥ��1������ƥ��str�е���һ��
				}
				//2.��ǰ�ַ���ƥ��
				return matchCore(str, s, pattern, p + 2);
			}
			
			////�����ǰ�ַ���ǰһ���ַ�����*
			if(pattern[p]==str[s]||pattern[p]=='.') {
				return  matchCore(str, s + 1, pattern, p + 1);
			}
			return false;
			
		}
		
		return false;
		
	}
		
		
		
}
