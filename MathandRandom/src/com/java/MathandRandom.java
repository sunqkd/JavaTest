package com.java;

import java.util.Arrays;
import java.util.Random;

public class MathandRandom {

	public static void main(String[] args) {
		// ��ѧ����
		System.out.println(Math.random());// 0.0-1.0֮��������Double
		System.out.println(Math.round(3.1415)); // ��������
		System.out.println(Math.round(3.4512*100)/100.00);// ������λС��
		System.out.println(Math.PI);
		
		// �� α�����
		Random r = new Random();
		System.out.println(r.nextInt(100)); // ����Ϊ��Χ 0-100��������100��
		
		// Array �������������
		int[] nums = {1,2,10,4,5,6,7};
		nums = Arrays.copyOf(nums, 10);
		System.out.println(nums.length);
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		// ��������
		Arrays.sort(nums); // û�з���ֵ  ԭ��Ϊð������
		for(int i = 0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
	    // foreach ѭ������
		for(int i : nums) {
			System.out.println(i);
		}
		
		// ��������
		int [] temp = new int[nums.length];
		System.arraycopy(nums, 0,temp,0, temp.length);// ԭ���� ��ʼλ�� Ŀ������ Ŀ��λ�� ����
		
		for(int i : temp) {
			System.out.println(i+",");
		}
		
		// ���ֲ����㷨����������������ģ� �ص�����ٶȿ�
		
		int index = Arrays.binarySearch(nums, 7);
		System.out.println(index);
	}

}
