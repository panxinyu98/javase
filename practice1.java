package com.neuedu.test3;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100万存三年，利率4%，按月付息，每月给多少利息，取12月利息之后要全部取出来，银行定期一年0.3%，银行能给多少
		double sum=1000000;
	 	double	sum1=sum;
		/*int i=0;
		 while(i<3)
	   	 {   
	   		 
	   		 sum*=(1+0.04);
	   		 i++;
	   	 }
	   	  
		 sum=(sum-1000000)/36;
	   	System.out.println("月利息"+sum);

	 
	   		 
	   		 sum1*=(1+0.003);
	   		 sum1=sum1-sum*12;
	
	    
	    System.out.println("利息"+sum1);
	   	
	   	  */
	 	
	 	for(int i=0;i<3;i++)
	 	{
	 		sum=sum*(1+0.04);
	 	}
	 	sum=(sum-sum1)/36;
		System.out.println("月利息"+sum);
		
		
		sum1*=(1+0.003);
		sum1=sum1-sum*12;
		System.out.println("利息"+sum1);	
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
		   
		
	}

}
