package com.neuedu.test3;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//20.编写一个程序，找出大于200的最小的质数。

		for(int num=200;;num++) 
		{	
        boolean flag=true;//是质数
         for(int i=2;i<=num-1;i++)
        {       
        	
        	if(num%i==0)
        	{
        		flag=false;//不是质数
        		//整除了
        		//System.out.println("不是质数");
        		break;
        	
        	}
        }
        
        if(flag)//一个都没整除
        {	
        //break 到这
        //System.out.println("是质数");
        //找到质数
        System.out.println(num);
        break;
        
        }
	
		}
	}
}
