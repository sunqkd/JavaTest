package com.java;

/***
 * 
 * @author Administrator
 * implements Cloneable ����������Ա���¡
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
	// toString ����
	public String toString() {
		return "Dog [name=" + name + "age=" +age + "]";
	}
	// ��¡������д
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
