package com.neuedu.test3;

public class Test6 {
          public static void main(String[] args) {
			
        	  //do...while    1~100的奇数求和
        	  int sum=0;
			int i=1;
			
			do{
				sum+=i;
				i=i+2;
				
			}while(i<=100);
			System.out.println(sum);
			
			
			//for 循环1+2+...100的和
			int sum1 =0;
			for(int x=1;x<=100;x++) //for(int x=1;x<=100;x=x+2)1~100的奇数求和,其他不变
			{                       
				sum1+=x;
				
			}
        	 
			System.out.println(sum1);
			
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
		}
}
