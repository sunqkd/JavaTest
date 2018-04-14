package com.java;

public class Cat implements Comparable<Cat>{
	private String name;
	private int age;
	
	// 带参数的构造方法
	public Cat(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	// 默认构造方法
	public Cat() {}

	// setgetmethods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 重写
	public String toString() {
		return "Cat [name=" + name + "age=" +age + "]";
	}
	// 通过此方法实现对象的比较
	// 排序规则
	@Override
	public int compareTo(Cat arg0) {
		if(this.age < arg0.age) { 
			return -1;
		}else if(this.age > arg0.age) {
			return 1;
		}else {
			return 0;
		}	
	}
	
}
