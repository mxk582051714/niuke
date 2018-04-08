package com.mxk.niuke1;

public class Person {
	public int age;
	private void print() {
		System.out.println("age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.age=1;
		p.print();
	}  

}
