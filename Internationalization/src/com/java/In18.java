package com.java;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 * ������ʻ�
 *
 */
public class In18 {

	public static void main(String[] args) {
		Locale locale = Locale.CHINA; // ������ʽ������ʻ�
		Locale locale2 = new Locale("en","US"); // ����  ��language��country��
		ResourceBundle rb = ResourceBundle.getBundle("com.java.info",locale); // 	���ݾ�����ļ�
		
		Scanner input = new Scanner(System.in);
		System.out.println(rb.getString("welcom"));
		System.out.println(rb.getString("input.username"));
		String username = input.next();
		System.out.println(rb.getString("input.pad"));
		String psd = input.next();
		
		if("abc".equals(username) && "123".equals(psd)) {
			String info = MessageFormat.format(rb.getString("info"), "abc");
			System.out.println(info);
			System.out.println(rb.getString("info"));
		}else {
			System.out.println(rb.getString("infowrong"));
		}
		
	}

}
