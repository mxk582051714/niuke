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
		//如果为空
		if(str==null||pattern==null)
			return false;
		int s=0;
		int p=0;
		return matchCore(str, s, pattern, p);
	}

	public boolean matchCore(char[] str, int s, char[] pattern, int p) {
		//str,pattern同时匹配完毕
		if(str.length==s&&pattern.length==p)
			return true;
		
		//str还有剩余,pattern匹配完毕，那肯定不能完全匹配
		if(s<str.length&&p==pattern.length) {   
			return false;
		}
		
		//str匹配完毕，pattern还有剩余，可能匹配成功，也可能不成功，因为a*可以匹配0个
		if(s==str.length&&p<pattern.length) {
			//匹配成功的情况
			if(p+1<pattern.length&&pattern[p+1]=='*') {
				return matchCore(str, s, pattern, p+2);
			}
			//匹配不成功
			return false;
		}
		
		//str和pattern都有剩余
		if(s<str.length&&p<pattern.length) {
			//如果当前字符的前一个字符是*
			if(p+1<pattern.length&&pattern[p+1]=='*') {
				//1.当前字符匹配
				if(pattern[p]==str[s]||pattern[p]=='.') {
					return matchCore(str, s, pattern, p + 2)// 模式后移2，视为x*匹配0个字符
							|| matchCore(str, s + 1, pattern, p + 2)// 视为模式匹配1个字符
							|| matchCore(str, s + 1, pattern, p);// *匹配1个，再匹配str中的下一个
				}
				//2.当前字符不匹配
				return matchCore(str, s, pattern, p + 2);
			}
			
			////如果当前字符的前一个字符不是*
			if(pattern[p]==str[s]||pattern[p]=='.') {
				return  matchCore(str, s + 1, pattern, p + 1);
			}
			return false;
			
		}
		
		return false;
		
	}
		
		
		
}
