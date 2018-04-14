package com.java;

import java.util.Comparator;
// 单独写一个类 去实现  Dog 的排序
public class DogComparable implements Comparator<Dog>{

	@Override
	public int compare(Dog arg0, Dog arg1) { // (比较对象，指定对象)
		if(arg0.getAge()<arg1.getAge()) {
			return -1;
		}else if(arg0.getAge()>arg1.getAge()) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
