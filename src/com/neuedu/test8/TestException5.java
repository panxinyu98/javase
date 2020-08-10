package com.neuedu.test8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			test();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try
		{
			test2();
        }
		finally{
		System.out.println("main");
		}
	}

	public static void test() throws FileNotFoundException
	{
		try
		{
			FileInputStream ins=new FileInputStream("d:/a.txt");
		}
		finally{
			System.out.println("test");
		}
		
	}	
		
	public static void test2()
	{
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(c);
		
		int[]arr = new int[2];
	    arr[2]=100;
	    
	    System.out.println("here");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
