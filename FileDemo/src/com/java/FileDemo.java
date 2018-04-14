package com.java;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

	/**
	 * 
	 * @param target 目标文件夹
	 * @param ext 扩展名
	 */
	public static void findfile(File target,String ext) {
		if(target != null) {
			if(target.isDirectory()) {
				File [] files = target.listFiles();
				if(files != null) {
					for (File file : files) {
						findfile(file, ".txt");
					}
				}
			}else {
				// 绝对路径
				String PATH = target.getAbsolutePath();
				if(PATH.endsWith(ext)) {
					System.out.println(PATH);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// 创建一个file对象，指向一个文件或目录（文件或目录不一定存在）
		File file = new File("E:"+File.separator+"a.txt"); // File.separator 代表 /
		// 判断文件是否存在
		System.out.println("判断文件是否存在" + file.exists());
		// 创建文件
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// 捕获输入输出异常
				e.printStackTrace();
			}
		}
		// 文件绝对路径
		System.out.println(file.getAbsolutePath());
		// 文件最后修改时间
		long lastmodifyTime = file.lastModified();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timemodify = df.format(new Date(lastmodifyTime));
		System.out.println(timemodify);
		
		//文件的长度
		System.out.println("文件的长度"+ file.length());
		// 文件是否是目录
		System.out.println("文件是否是目录" + file.isDirectory());
		
		// 目录
		File file2 = new File("E:\\codingke_text");
		if(!file2.exists()) {
			file2.mkdir(); // 创建目录
		}
		// 是否是目录
		System.out.println("文件2是否是目录"+ file2.isDirectory());
		// 删除（目录或文件）
		// file2.delete();
		
		// 获取目录下的（文件及目录）的名字
		String [] name = file2.list();
		for(String i : name) {
			System.out.println(i);
		}
		
		File [] files = file2.listFiles();
		for (File file3 : files) {
			System.out.println(file3.getPath()+ "---" + file3.length());
		}
		
		
		
		// 调用
		findfile(new File("E:\\codingke_text"),".txt");
	}

}
