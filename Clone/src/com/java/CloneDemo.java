package com.java;

/***
 * 
 * @author Administrator
 * implements Cloneable 表明此类可以被克隆
 *
 */
public class CloneDemo implements Cloneable{
	private String name;
	private int age;
	public CloneDemo() {}
	public CloneDemo(String name, int age) {
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
	// toString 方法
	public String toString() {
		return "Dog [name=" + name + "age=" +age + "]";
	}
	// 克隆方法重写
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
