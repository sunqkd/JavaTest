package com.java;

public class Text {

	public static void main(String[] args) {
		CloneDemo cd = new CloneDemo("jack",10);
		try {
			CloneDemo cd1 = (CloneDemo) cd.clone();
			System.out.println(cd+"---"+cd1);
			System.out.println(cd1 == cd); // false 不是同一个对象
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
