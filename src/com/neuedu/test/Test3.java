package com.neuedu.test;

public class Test3 {

	public static void main(String[] args) {
		
		//十进制
		int a=10;
		//十六进制
		int b=0X10;//16
		//八进制
		int c=010;//8
		//二进制
		int d=0B100;//4
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//进制转换
		//十进制->十六，八，二（短除法）
		//十六，八，二->十进制（权加法）
		//十六，八进制<->二进制
		//十进制转换其它进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		
		
		
		
		
		
		
	}
}
