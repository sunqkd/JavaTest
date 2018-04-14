package com.java;

public class Dog {
	private String name;
	private int age;
	
	
	public Dog() {}
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	// ÖØÐ´
	public String toString() {
		return "Dog [name=" + name + "age=" +age + "]";
	}
}
