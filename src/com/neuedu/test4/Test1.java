package com.neuedu.test4;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//动态初始化
		//数组是定长的
		int[] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//静态初始化
		int sum=0;
		int[] scores={80,23,45,67,90};//长度定了
		
            for(int i=0;i<scores.length;i++) 
            {
            	sum+=scores[i];
            }
		   double avg=(double)sum/scores.length; 
            
		System.out.println(avg);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
