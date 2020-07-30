package com.neuedu.test3;

public class Flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ë®ÏÉ»¨Êý
		for(int i=100;i<=999;i++)
		{
			int a=i%10;
			int b=i/10%10;
			int c=i/100;
			
			if(a*a*a+b*b*b+c*c*c==i)
			{
				System.out.println(i);
			}
		}
		

	}

}
