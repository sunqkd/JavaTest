package com.java;
/**
 * 
 * @author Administrator
 * 使用String连接字符串，代码性能会非常低，此时可以用到StringBuffer类
 * StringBuffer节省内存
 * StringBuffer 是同步的 线程安全
 * StringBuilder 是异步的  线程不安全  不能用在多线程中
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
        
        StringBuffer sss = new StringBuffer(24); // 指定容量  调用带容量的构造方法
        for(int i = 0;i<17;i++) { // 超过了16个
        	sss.append(i);
        }
        System.out.println(sss); // 打印对象自动调用toString()方法
        System.out.println(sss.toString());
        System.out.println(sss.length()); // 24  长度
        System.out.println(sss.capacity()); // 34 16*2+2  扩充容量
        
        StringBuilder strbuild = new StringBuilder();
	}

}

