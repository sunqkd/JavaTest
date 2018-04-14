package com.java;

public class Cat implements Comparable<Cat>{
	private String name;
	private int age;
	
	// �������Ĺ��췽��
	public Cat(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	// Ĭ�Ϲ��췽��
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
	// ��д
	public String toString() {
		return "Cat [name=" + name + "age=" +age + "]";
	}
	// ͨ���˷���ʵ�ֶ���ıȽ�
	// �������
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
