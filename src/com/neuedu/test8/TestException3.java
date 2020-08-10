package com.neuedu.test8;

public class TestException3 {

	/*
	 * finally是必须执行的代码，就算有return，也必须执行完finally的代码
	 * try-catch,try-catch-finally,try-finally
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		int a=10;
		int b=0;
		int c=a/b;
		
		}
	

	catch(ArithmeticException e)
	{
		e.printStackTrace();
		return;
	}
	
	finally
	{
		System.out.println("must run");
	}
		
	System.out.println("XXX");	
		
		
		
		
		
		
		
   }
}
