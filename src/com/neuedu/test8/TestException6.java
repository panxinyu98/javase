package com.neuedu.test8;



import java.io.FileInputStream;

public class TestException6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			test();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("countion¡­¡­");
		try
		{
			test2();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void test() throws Exception
	{
		try{
			int a=10;
			int b=0;
			
			int c=a/b;
			
			System.out.println(c);
			
			FileInputStream ins=new FileInputStream("");
		}
		
	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	}
	public static void test2()
	{
		int a=10;
		int b=2;
		
		if(a%b!=0)
		{
			throw new ArithmeticException();
		}
	}

}
