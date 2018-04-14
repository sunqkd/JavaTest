package com.java;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *���ֲ����㷨
 *�ص㣺�����ٶȿ�
 *���б�������
 */
public class BinarySearchDemo {

	public static void main(String[] args) {
		int [] numages = {10,30,54,21,9,22,34,26};
		// �Ƚ�������
		Arrays.sort(numages);
		// ���ֲ���
		int index = Arrays.binarySearch(numages, 22);
		System.out.println(index);
		
		System.out.println(binarySearchMethod(numages,22));
	}
	
	// ���ֲ����㷨ԭ��
	public static int binarySearchMethod(int[] nums, int key) {
		int start  = 0;
		int end  = nums.length - 1;
		int mid = -1;
		while(start<=end) {
			mid = ( start + end ) / 2;
			if(nums[mid] == key) {
				return mid;
			}else if(nums[mid] < key){
				start = mid + 1;
			}else{
				end = mid - 1;
			}
		}
		return -1;
	}

}
