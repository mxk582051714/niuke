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
			return true;  // 都匹配完了
		if (str.length > s && pattern.length <= p)
			return false; // 模式完了，字符串还有
		// 模式串a*a没结束，匹配串可结束可不结束
		
		//下面是真正开始匹配
		if (p + 1 < pattern.length && pattern[p + 1] == '*'){		// 当前pattern的下一个是*号时
			// 字符串完了
			if (s >= str.length)
				return matchCore(str, s, pattern, p + 2);
			else {
				//核心：若果当前字符匹配（匹配的话也分成两种情况，相等，或者模式中当前字符是.）
				if (pattern[p] == str[s] || pattern[p] == '.') {
					// 当前位置匹配完成，移动到下一个模式串
					return matchCore(str, s + 1, pattern, p + 2) || matchCore(str, s + 1, pattern, p)
							|| matchCore(str, s, pattern, p + 2);
				} else
				//核心：当前字符不匹配，那么str就不要动了，模式串p的*字符肯定起到了使得当前字符出现0次的效果，如：aaa,b*a.
					return matchCore(str, s, pattern, p + 2);
			}
		}
					
																 // 当前pattern的下一个不是*时候
		if (s >= str.length)
			return false;
		else {
			if (str[s] == pattern[p] || pattern[p] == '.')
				return matchCore(str, s + 1, pattern, p + 1);
		}
		return false;
	}

}
