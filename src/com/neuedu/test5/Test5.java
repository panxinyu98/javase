package com.neuedu.test5;

public class Test5 {

	public static void main(String[] args) {
		
		int sum=fun(5);
		System.out.println(sum);
		
		int n=feibonaqie(8);
		System.out.println(n);
		
		
	}
	/*
	 * �Լ������Լ����ݹ����
	 * 
	 * */

	public static int fun(int n)
	{
		if(n==2)
		{
			return 2;
		}
		else
		{
			return n*fun(n-1);
			 
		}
	}
	//쳲���������
	public static int feibonaqie(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else 
		{
			return feibonaqie(n-1)+feibonaqie(n-2);
		}
	}
}
