package com.java;

import java.util.Arrays;
import java.util.Random;

public class MathandRandom {

	public static void main(String[] args) {
		// 数学函数
		System.out.println(Math.random());// 0.0-1.0之间的随机数Double
		System.out.println(Math.round(3.1415)); // 四舍五入
		System.out.println(Math.round(3.4512*100)/100.00);// 保留两位小数
		System.out.println(Math.PI);
		
		// 类 伪随机数
		Random r = new Random();
		System.out.println(r.nextInt(100)); // 参数为范围 0-100（不包括100）
		
		// Array 数组操作工具类
		int[] nums = {1,2,10,4,5,6,7};
		nums = Arrays.copyOf(nums, 10);
		System.out.println(nums.length);
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		// 数组排序
		Arrays.sort(nums); // 没有返回值  原理即为冒泡排序
		for(int i = 0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
	    // foreach 循环方法
		for(int i : nums) {
			System.out.println(i);
		}
		
		// 复制数组
		int [] temp = new int[nums.length];
		System.arraycopy(nums, 0,temp,0, temp.length);// 原数组 起始位置 目标数组 目标位置 长度
		
		for(int i : temp) {
			System.out.println(i+",");
		}
		
		// 二分查找算法（必须数组是有序的） 特点查找速度快
		
		int index = Arrays.binarySearch(nums, 7);
		System.out.println(index);
	}

}
