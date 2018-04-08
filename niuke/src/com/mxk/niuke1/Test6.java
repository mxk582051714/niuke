package com.mxk.niuke1;

import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Test6 test = new Test6();
		int ch = 'a';
		int ch1 = 'A';

		System.out.println("ch:" + ch + "CH1" + ch1);
		String str = "Aababccddzemk";
		int index = test.FirstNotRepeatingChar(str);
		System.out.println("index=" + index);

	}

	// public int FirstNotRepeatingChar(String str) {
	// if(str==null||str.trim().length()==0)
	// return 0;
	// int index=0;
	// ArrayList<Integer> list=new ArrayList<Integer>();
	// Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	// for(int i=0;i<str.length();i++) {
	// char ch=str.charAt(i);
	// int num=ch-'a';
	// if(!list.contains(num)){
	// list.add(num);
	// int time=1;
	// map.put(num, time);
	// }else{
	// int time=map.get(num);
	// time++;
	// map.put(num, time);
	// }
	// }
	// int key=0;
	// for(int i=0;i<list.size();i++) {
	// int num=list.get(i);
	// int time =map.get(num);
	// if(time==1) {
	// key=num;
	// break;
	// }
	// }
	// char chkey=(char)('a'+key);
	// System.out.println("chkey="+chkey);
	// char [] arr=str.toCharArray();
	// for(int i=0;i<arr.length;i++) {
	// Character ch=arr[i];
	// if(ch.equals(chkey)) {
	// index=i;
	// break;
	// }
	// }
	// return index;
	// }
	// public int FirstNotRepeatingChar(String str) {
	// if(str==null||str.trim().length()==0)
	// return -1;
	// int index=0;
	// Map<Character,Integer> map=new HashMap<>();
	// for(int i=0;i<str.length();i++) {
	// char ch=str.charAt(i);
	// if(!map.containsKey(ch)){
	// map.put(ch, 1);
	// }else{
	// int value=map.get(ch);
	// map.put(ch, value+1);
	// }
	// }
	// for(int i=0;i<str.length();i++) {
	// int time=map.get(str.charAt(i));
	// if(time==1){
	// index=i;
	// break;
	// }
	// }
	// return index;
	// }

	public int FirstNotRepeatingChar(String str) {
		if (str == null || str.trim().length() == 0)
			return -1;
		char[] c = str.toCharArray(); // 字符串变成数组
		int[] a = new int['z' + 1]; // 开辟了一段空间，保证存放所有的字符对应的ASCII值
		for (char ch : c)
			a[(int) ch]++; // 以字符对应ASCII值作为索引，增加对应位置的值
		for (int i = 0; i < c.length; i++)
			if (a[(int) c[i]] == 1) // 遍历所有的字符对应的位置，查看其值的大小，相当于构建了一个map
				return i;
		return -1;
	}

}
