package com.neuedu.test3;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        if(true)
        {
	       System.out.println(true);
          }

           System.out.println("output anyway");

           
         int n=7;  
           if(n%2==0){
        	   
         System.out.println(n+"是一个奇数");
           }
           
           else{
        	   System.out.println(n+"是一个偶数");
           } 
           
           
System.out.println("--------------------------------");
           
           int i = 55;
           if (i <= 100 && i >= 90) {
               System.out.println("成绩是A");
           } else if (i >= 80) {
               System.out.println("成绩是B");
           } else if (i >= 70) {
               System.out.println("成绩是C");
           } else if (i >= 60) {
               System.out.println("成绩是D");
           } else {
               System.out.println("成绩是E");
           }
 
 System.out.println("--------------------------------");
                   
           //4年一润，百年不润，400年在润
          int year =2000;
          if(year %400 ==0)
  		{
  			System.out.println(year +"是闰年");
  		}
  		else if(year %4 ==0 && year %100!=0)
  		{
  			System.out.println(year +"是闰年");
  		}
  		else
  		{
  			System.out.println(year +"不是闰年");
  		}

System.out.println("--------------------------------");  
          
          
      
          
          
          
          
          
          
          
  	}   

  }
