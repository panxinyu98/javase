package com.neuedu.test8;

public class TestException3 {

	/*
	 * finally�Ǳ���ִ�еĴ��룬������return��Ҳ����ִ����finally�Ĵ���
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
