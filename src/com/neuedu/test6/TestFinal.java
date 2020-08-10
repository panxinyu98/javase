package com.neuedu.test6;

public class TestFinal {
/*
 * 属性有默认值
 * final的属性没有默认值声明
 * 两个时机赋初值：1.声明赋值2.方法构造
 */

	final String name;
	
	public TestFinal(String name)
	{
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int a = 100;
		System.out.println(a);
	}

}
