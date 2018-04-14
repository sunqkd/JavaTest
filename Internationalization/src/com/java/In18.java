package com.java;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 * 程序国际化
 *
 */
public class In18 {

	public static void main(String[] args) {
		Locale locale = Locale.CHINA; // 常量方式定义国际化
		Locale locale2 = new Locale("en","US"); // 美国  （language，country）
		ResourceBundle rb = ResourceBundle.getBundle("com.java.info",locale); // 	根据具体绑定文件
		
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
