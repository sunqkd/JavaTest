package com.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		System.out.println("日期操作类");
		Date now = new Date();
		System.out.println(now);
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR); // 获取年份
		System.out.println(year);
		int month = c.get(Calendar.MONTH); // 获取月份
		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);// 获取天数
		System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK);// 获取星期
		System.out.println(week);
		int hour = c.get(Calendar.HOUR_OF_DAY);// 获取小时（24小时制）
		System.out.println(hour);
		int min = c.get(Calendar.MINUTE);// 获取分钟
		System.out.println(min);
		int second = c.get(Calendar.SECOND);// 获取秒
		System.out.println(second);
		int PM = c.get(Calendar.PM);
		System.out.println(PM);	
		
		// 日期格式化类  DateFormat抽象类
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd天HH:mm:ss SSS");
		System.out.println(df.format(new Date()));
		
		
		// 系统毫秒数
		long data = System.currentTimeMillis();
		System.out.println(data);
	}

}
