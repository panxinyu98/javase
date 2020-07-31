package com.neuedu.test5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           
		System.out.println(sum(5));
		
		System.out.println(isleapyear(1995));
		
		System.out.println(zhishu(2005));
		
	}
	//编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。 

	// 编写一个方法，判断该年份是平年还是闰年。 

    //  编写一个方法，输出大于200的最小的质数。 

	//   写一个方法，功能：定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）。

	public static int sum(int n) 
	{    int sum = 1;
		for(int i=n;i>n;i--)
		{
			sum*=i;
			
		}
		return sum;
	}
	
	
	
	public static boolean isleapyear(int year)
	{
		if(year%400==0)
		{
			return true;
		}
		if(year%4==0&&year%100==0)
		{
			return true;
		}
		return false;
	}
	
	
	
	public static int zhishu(int n)
	{
		for(int i=n+1;;i++)
		{
			boolean flag=true;//是质数
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;//不是质数
				}
			}
			if(flag)
			{
				return i;
			}
				
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
