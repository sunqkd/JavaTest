package com.java;
/**
 * 
 * @author Administrator
 * ʹ��String�����ַ������������ܻ�ǳ��ͣ���ʱ�����õ�StringBuffer��
 * StringBuffer��ʡ�ڴ�
 * StringBuffer ��ͬ���� �̰߳�ȫ
 * StringBuilder ���첽��  �̲߳���ȫ  �������ڶ��߳���
 *
 */
public class StringBufferDemo {

	public static void main(String[] args) {
        String s = "Hello";
        String ss = s + " World!";
        System.out.println(ss);
        for(int i = 0;i<10;i++) {
        	s +=i;
        }
        System.out.println(s);
        
        StringBuffer sss = new StringBuffer(24); // ָ������  ���ô������Ĺ��췽��
        for(int i = 0;i<17;i++) { // ������16��
        	sss.append(i);
        }
        System.out.println(sss); // ��ӡ�����Զ�����toString()����
        System.out.println(sss.toString());
        System.out.println(sss.length()); // 24  ����
        System.out.println(sss.capacity()); // 34 16*2+2  ��������
        
        StringBuilder strbuild = new StringBuilder();
	}

}

