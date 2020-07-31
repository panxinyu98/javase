package com.neuedu.test5;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 t=new Test3();
		System.out.println(t.sum(10,10));
		System.out.println(t.sum(12.5,12.5));
		
	}

	
	//重载的方法
	//1.方法名不同
	//2.方法参数不同
	
	
	
	/*
	//不是方法重载
	public int sum(int a,int b)
	{
		return a+b;
	}
	*/
	public int sum(int x,int y)
	{
		return x+y;
	}
	public double sum(double a,double b)
	{
		return a+b;
	}
	public double sum(int a,double b)
	{
		return a+b;
	}
}


