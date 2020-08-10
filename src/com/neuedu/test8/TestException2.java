package com.neuedu.test8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {
	
        //catch 块注意顺序问题，子类异常在前，父类异常在后
	
	public static void main(String[] args) {
		
		try{
			int a=10;
			int b=0;
			int c=a/b;//算数异常
			
			int[ ]arr= new int[2];
			arr[2]=1;//越界异常
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();//输入不匹配
			
			
				FileInputStream ins = new FileInputStream("d:/a.txt");
			
		}
		
		
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		

         catch(InputMismatchException e){
        	 e.printStackTrace();
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(Exception e){
			System.out.println("出错误了");
		}
		
		System.out.println("continue...");
		
	}
}
