package com.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		System.out.println("���ڲ�����");
		Date now = new Date();
		System.out.println(now);
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR); // ��ȡ���
		System.out.println(year);
		int month = c.get(Calendar.MONTH); // ��ȡ�·�
		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);// ��ȡ����
		System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK);// ��ȡ����
		System.out.println(week);
		int hour = c.get(Calendar.HOUR_OF_DAY);// ��ȡСʱ��24Сʱ�ƣ�
		System.out.println(hour);
		int min = c.get(Calendar.MINUTE);// ��ȡ����
		System.out.println(min);
		int second = c.get(Calendar.SECOND);// ��ȡ��
		System.out.println(second);
		int PM = c.get(Calendar.PM);
		System.out.println(PM);	
		
		// ���ڸ�ʽ����  DateFormat������
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss SSS");
		System.out.println(df.format(new Date()));
		
		
		// ϵͳ������
		long data = System.currentTimeMillis();
		System.out.println(data);
	}

}
