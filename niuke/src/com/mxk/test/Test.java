package com.mxk.test;
import java.lang.reflect.Field;  //������Ҫ����İ�
import java.util.*;
public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
//		Student  st=new Student("��", 89, 10);
//		Field[]  f = st.getClass().getDeclaredFields(); //��ȡ������ֶΣ�public, protected, default (package) access, and private��
//		for(Field ff:f)            //�����ֶ�
//		{
//		  ff.setAccessible(true);
//		  System.out.println(ff.get(st)+"  .."+ff.getName());    //��ȡ�ֶ�����
//		  //System.out.println();    //��ȡ�ֶ���
//		}
//		st.getSal();
		
		Test t=new Test();
		Collection<String> collection;
		String s=new String("mxk");
		
		System.out.println();
		
	}
	
	public int Getnumberof1(int n) {
		int count=0;
		int flag=1;  //n��flag����λ�����flag,֮��flag����������λ(��λ��0)
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
		//��������1���ƶ�
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
//ע�⣺����̳и��࣬�Ǽ̳��˸����ȫ����������ʲô����
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
		System.out.println("ѧ�����ʣ�"+sal);
		return sal;
	}
	
}
