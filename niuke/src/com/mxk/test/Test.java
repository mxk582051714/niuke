package com.mxk.test;
import java.lang.reflect.Field;  //这是需要引入的包
import java.util.*;
public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
//		Student  st=new Student("凯", 89, 10);
//		Field[]  f = st.getClass().getDeclaredFields(); //获取该类的字段（public, protected, default (package) access, and private）
//		for(Field ff:f)            //遍历字段
//		{
//		  ff.setAccessible(true);
//		  System.out.println(ff.get(st)+"  .."+ff.getName());    //获取字段类型
//		  //System.out.println();    //获取字段名
//		}
//		st.getSal();
		
		Test t=new Test();
		Collection<String> collection;
		String s=new String("mxk");
		
		System.out.println();
		
	}
	
	public int Getnumberof1(int n) {
		int count=0;
		int flag=1;  //n与flag做按位与操作flag,之后flag不断向左移位(低位补0)
		int temp=0;
		if(n<0) {
			temp=-n;
		}else {
			temp=n;
		}
		while(flag!=0) {
			int res=temp&flag;
			System.out.println("res="+res);
			if(res!=0) {
				count++;
			}
			flag=flag<<1;  
		}
		return n>0?count:(count+1);
	}
	
	public int Getnumberof2(int n) {
		int count=0;
		//方法：将1右移动
		while(n!=0) {
			int res=n&1;
			if(res!=0)
				count++;
			n=n>>>1;  
		}
		return count;
	}
	
	public int NumberOf3(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n&(n-1);
		}
		return count;
	}

	
	
	

}
//注意：子类继承父类，是继承了父类的全部，不管是什么属性
class Person{
	public String name;
	private int sal;
	
	public Person(String name,int sal) {
		this.name=name;
		this.sal=sal;
	}
	public void printname() {
		System.out.println(this.name);
	}
	private void printsal() {
		System.out.println(this.sal);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
}

class Student extends Person {
	private int bone;

	public Student(String name, int sal,int bone ) {
		super(name, sal);
		// TODO Auto-generated constructor stub
	}

	public int getSal() {
		int sal=super.getSal()+this.bone;
		System.out.println("学生工资："+sal);
		return sal;
	}
	
}
