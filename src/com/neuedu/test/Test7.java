package com.neuedu.test;

public class Test7 {

	public static void main(String[] args) {
		int a=5;
		int b=2;
		
		double c=(double)(5/2); //2
		
		//a+b的和是？》》字符串拼接
		System.out.println("a+b的和是"+(a+b));
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(c);
		//打印出 ？是班长
		String str= "毛毛";
		System.out.println(str+"是班长");
		
		int money=5000;
		System.out.println("我有"+money+"钱");
		//除法中的负数
		System.out.println(5/2);
		System.out.println(5/-2);
		System.out.println(-5/2);
		System.out.println(-5/-2);
		
		
		//前面的为负数则为负数
		System.out.println(5%2);
		System.out.println(5%-2);
		System.out.println(-5%2);
		System.out.println(-5%-2);
		
		//自增自减
		int x=1;
		//先用后加
		//x++;
		//先加后用
		//++x;
		
		int y=x++;
		
		System.out.println(x);
		System.out.println(y);
		
		int h=1;
		h=h++;//h不变，无效果
		System.out.println(h);
		
		int x1=3;
		int y1=5;
		
		int r1=x1++ + x1*y1;
		//字符串常量和变量用+连接 
		System.out.println("x1="+x1+" y1="+y1 +" r1="+r1);
		
		
		
	}
}
