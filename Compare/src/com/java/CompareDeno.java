package com.java;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 * ����Ƚ���
 * ���ͺ�String�Ѿ�ʵ��Comparable ���Ƕ���û��ʵ��
 *
 */
public class CompareDeno {

	public static void main(String[] args) {
		int [] nums = {10,12,5,4,89,445};
		Arrays.sort(nums); // ��������
		for(int i : nums) {// foreach ���
			System.out.println(i);
		}
		
		String[] names = {"tom","jack","asd","werw"};
		Arrays.sort(names);// �����������
		for(String i : names) {
			System.out.println(i);
		}
		// ����
		Cat [] cats = {new Cat("tom", 2),new Cat("jack", 3),new Cat("asd",5),new Cat("qwe",8)};
		Arrays.sort(cats);
		
		for(Cat i : cats) {
			System.out.println(i);
		}
		
		
		// �������� Dog
		Dog [] dog = {new Dog("toms", 2),new Dog("jacks", 3),new Dog("asds",5),new Dog("qwes",8)};
		Arrays.sort(dog,new DogComparable()); // (��������飬����ʵ����)
		for(Dog i :dog) {
			System.out.println(i);
		}
		
	}

}
