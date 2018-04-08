package com.mxk.test;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.*;
public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employe original = new Employe(2000);
			original.setHireday(2000, 1, 1);
			Employe copy = original.clone();
			copy.setHireday(2002, 11, 31);
			copy.raiseSal(10);

			System.out.println("original:" + original);
			System.out.println("copy:" + copy);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Employe implements Cloneable {
	private double sal;
	private Date hireday;

	public Employe(double sal) {
		this.sal = sal;
		hireday = new Date();
	}

	// 必须重写employe的clone（）方法
	public Employe clone() throws CloneNotSupportedException {
		// 调用父类的clone方法，即Object 的clone方法
		Employe cloned = (Employe) super.clone();
		// **同时注意，也需要clone Employe中的可变域
		cloned.hireday = (Date) hireday.clone();
		return cloned;
	}

	public void setHireday(int year, int month, int day) {
		Date newhireday = new GregorianCalendar(year, month - 1, day).getTime();
		this.hireday.setTime(newhireday.getTime());// 设置ms数

	}

	public void raiseSal(double byPercent) {
		double raise = sal * byPercent / 100;
		sal += raise;
	}

	public String toString() {
		return "Employe [sal=" + this.sal + ",hireday=" + this.hireday + "]";
	}
}

interface InterfaceDemo {
	
	int a=3;
    public int b = 3;
    public static int  c = 4;
    public static final int d =5;
	
	
	
	static void staticMethod() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
	}

}
