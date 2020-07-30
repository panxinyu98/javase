package com.neuedu.test3;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//分解至因数
		int x=90;
	
        System.out.print(x+"=");
		for(int i=2;i<=x;i++)
		{
			while(x!=i)
			{		
			if(x%i==0)
			{
				System.out.print(i+"*");
				x=x/i;
			}
			else
			{
				break;
			}
			
			
			}
		}System.out.print(x);
		
	}
	

}
	
