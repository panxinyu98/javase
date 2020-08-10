package com.neuedu.test9;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//获得当前系统时间
		Date now = new Date();
		Date now1 = new Date(System.currentTimeMillis());
		
		System.out.println(now);
		System.out.println(now1);
		
		//1970-1-1 0:0:0
		Date d1 = new Date(1000);
		
		System.out.println(d1);
		
		//我们距离时间原点走过了多少毫秒数
		System.out.println(System.currentTimeMillis());
		
		System.out.println(now.after(d1));//true
		System.out.println(now.before(d1));//false
		System.out.println(now.equals(now1));//true
		
		System.out.println(now.compareTo(now1));//>0
		
		

	}
}