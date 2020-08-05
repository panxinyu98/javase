package com.neuedu.test7;


import java.util.Date;

import com.neuedu.test6.*;



public class TestPackage extends Point{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		
		Date now = new Date();
		//通过子类对象访问父类对象的protected属性
		TestPackage t= new TestPackage();
		t.x=10;
		t.y=20;
		
		
		Point p= new Point();
		
		Rectangle r = new Rectangle(10,1);
		
	}

}
