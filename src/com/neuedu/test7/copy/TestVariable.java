package com.neuedu.test7.copy;
/*
 * 变量的类型：
 * 1.局部变量->属于方法，没有默认值，必须赋初值才能用
 * 2.成员变量（属性）->属于对象，有默认值
 * 3.静态变量（类属性）->属于类，有默认值
 * 
 * 
 * */


public class TestVariable {

	char a;
	static char b;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestVariable t = new TestVariable();
		
		System.out.println(t.a );
		System.out.println((int)t.a );
		
		System.out.println(t.b );
		System.out.println((int)t.b );
		
		
		
	}

}
