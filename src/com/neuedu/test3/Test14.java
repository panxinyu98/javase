package com.neuedu.test3;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//求两个数的最大公约数
		int m=8;
		int n=12;
		int result=1;
		int min=m<n?m:n;
		for(int i=1;i<min;i++)
		{
			if(m%i==0&&n%i==0)
			{
				result=i;
			}
				
		}
		
		System.out.println(m+"和"+n+"的最大公约数："+ result);
	}

}
