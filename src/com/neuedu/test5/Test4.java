package com.neuedu.test5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(5);
		
		
	}
	//编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。 

	// 编写一个方法，判断该年份是平年还是闰年。 

    //  编写一个方法，输出大于200的最小的质数。 

	//   写一个方法，功能：定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）。

	public static void sum(int x) 
	{    int n = 1;
		for(int y=1;y<=x;y++)
		{
			n*=y;
			
		}
		System.out.println(n);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
