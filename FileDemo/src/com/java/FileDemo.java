package com.java;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

	/**
	 * 
	 * @param target Ŀ���ļ���
	 * @param ext ��չ��
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
				// ����·��
				String PATH = target.getAbsolutePath();
				if(PATH.endsWith(ext)) {
					System.out.println(PATH);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// ����һ��file����ָ��һ���ļ���Ŀ¼���ļ���Ŀ¼��һ�����ڣ�
		File file = new File("E:"+File.separator+"a.txt"); // File.separator ���� /
		// �ж��ļ��Ƿ����
		System.out.println("�ж��ļ��Ƿ����" + file.exists());
		// �����ļ�
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// ������������쳣
				e.printStackTrace();
			}
		}
		// �ļ�����·��
		System.out.println(file.getAbsolutePath());
		// �ļ�����޸�ʱ��
		long lastmodifyTime = file.lastModified();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timemodify = df.format(new Date(lastmodifyTime));
		System.out.println(timemodify);
		
		//�ļ��ĳ���
		System.out.println("�ļ��ĳ���"+ file.length());
		// �ļ��Ƿ���Ŀ¼
		System.out.println("�ļ��Ƿ���Ŀ¼" + file.isDirectory());
		
		// Ŀ¼
		File file2 = new File("E:\\codingke_text");
		if(!file2.exists()) {
			file2.mkdir(); // ����Ŀ¼
		}
		// �Ƿ���Ŀ¼
		System.out.println("�ļ�2�Ƿ���Ŀ¼"+ file2.isDirectory());
		// ɾ����Ŀ¼���ļ���
		// file2.delete();
		
		// ��ȡĿ¼�µģ��ļ���Ŀ¼��������
		String [] name = file2.list();
		for(String i : name) {
			System.out.println(i);
		}
		
		File [] files = file2.listFiles();
		for (File file3 : files) {
			System.out.println(file3.getPath()+ "---" + file3.length());
		}
		
		
		
		// ����
		findfile(new File("E:\\codingke_text"),".txt");
	}

}
