package com.neuedu.test3;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   int day =0;
                   //byte,short,int,char,string,enum
                   //必须是等值匹配
                   //switch 中要见到break 跳出循环，否者否者会一直执行
                   switch (day)
                   {
                   case 0:
                	   System.out.println("星期日");
                	   break;
                   case 1:
                	   System.out.println("星期一");
                	   break;
                   case 2:
                	   System.out.println("星期二");
                	   break;
                   case 3:
                	   System.out.println("星期三");
                	   break;
                   case 4:
                	   System.out.println("星期四");
                	   break;
                   case 5:
                	   System.out.println("星期五");
                	   break;
                   case 6:
                	   System.out.println("星期六"); 
                	   break;
                	   
                   }
                   
                   
                   
               int year = 2000;
               int month=6;
               //1,3,5,7,8,10,12 > 31day
               //4,6,9,11 > 30day
               //2
               switch(month)
               {
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12:
            	   System.out.println("31day");
            	   break;
               case 4:
               case 6:
               case 9:
               case 11:
               
            	   System.out.println("30day");   
            	  break;
               case 2:
            	  if(year %400 ==0)
   				{
  			    	 System.out.println("29天");
  				}
  				else if(year %4 ==0 && year %100!=0)
  				{
  					 System.out.println("29天");
  				}
  				else
  				{
  					 System.out.println("28天");
  				}			
  			    break;
  		 default:
  			 System.out.println("输入不合法");
  			 break;

         
            	   
               }
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
               
	}

}
