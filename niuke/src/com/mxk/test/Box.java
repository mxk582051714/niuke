package com.mxk.test;

import java.io.*;
import java.util.*;
public class Box implements Serializable {
	private int width;
	private int height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "box:"+width+","+height+"";
				
	}

	public static void main(String[] args) {
//		Box myBox = new Box();
//		myBox.setWidth(50);
//		myBox.setHeight(30);
//		ArrayList<String> list=new ArrayList<>();

		try {
			//FileOutputStream fs = new FileOutputStream("e:\\foo.bat");
			FileInputStream in=new FileInputStream(new File("e:\\foo.bat"));
			ObjectInputStream is=new ObjectInputStream(in);
			Object obj=is.readObject();
			if(obj instanceof Box) {
				Box box=(Box) obj;
				System.out.println(box);
			}
			//ObjectOutputStream os = new ObjectOutputStream(fs);
//			os.writeObject(myBox);
//			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("序列化完成");
	}

}
