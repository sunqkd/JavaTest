package com.java;

import java.util.Comparator;
// ����дһ���� ȥʵ��  Dog ������
public class DogComparable implements Comparator<Dog>{

	@Override
	public int compare(Dog arg0, Dog arg1) { // (�Ƚ϶���ָ������)
		if(arg0.getAge()<arg1.getAge()) {
			return -1;
		}else if(arg0.getAge()>arg1.getAge()) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
