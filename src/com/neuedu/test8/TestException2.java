package com.neuedu.test8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {
	
        //catch ��ע��˳�����⣬�����쳣��ǰ�������쳣�ں�
	
	public static void main(String[] args) {
		
		try{
			int a=10;
			int b=0;
			int c=a/b;//�����쳣
			
			int[ ]arr= new int[2];
			arr[2]=1;//Խ���쳣
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();//���벻ƥ��
			
			
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
			System.out.println("��������");
		}
		
		System.out.println("continue...");
		
	}
}
