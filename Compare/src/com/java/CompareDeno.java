package com.java;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 * 对象比较器
 * 整型和String已经实现Comparable 但是对象没有实现
 *
 */
public class CompareDeno {

	public static void main(String[] args) {
		int [] nums = {10,12,5,4,89,445};
		Arrays.sort(nums); // 数组排序
		for(int i : nums) {// foreach 输出
			System.out.println(i);
		}
		
		String[] names = {"tom","jack","asd","werw"};
		Arrays.sort(names);// 数组对象排序
		for(String i : names) {
			System.out.println(i);
		}
		// 数组
		Cat [] cats = {new Cat("tom", 2),new Cat("jack", 3),new Cat("asd",5),new Cat("qwe",8)};
		Arrays.sort(cats);
		
		for(Cat i : cats) {
			System.out.println(i);
		}
		
		
		// 对象数组 Dog
		Dog [] dog = {new Dog("toms", 2),new Dog("jacks", 3),new Dog("asds",5),new Dog("qwes",8)};
		Arrays.sort(dog,new DogComparable()); // (对象的数组，对象实现类)
		for(Dog i :dog) {
			System.out.println(i);
		}
		
	}

}
