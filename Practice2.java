package com.neuedu.test3;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//输出数字有几位
		
		int x=123;
		int sum=1;
		for(int i=0;i<=x;i++)
		{   
			x=x/10;
			
		    if(x==0)
		    {
		    	break;
		    }

			sum++;
		}
          System.out.println(sum);*/
		
		//21.由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
		
		int x=1234;
	
		for(int i=1;i<=4;i++)
		{
			int y=x%10;
			
		    System.out.print(y);
		    
			x=x/10;
			
		}	
			
		System.out.print('\t');
			
			
			
		//5.企业发放的奖金根据利润提成。
		//利润低于或等于10万元时，奖金可提10%；
		//利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
		//20万到40万之间时，高于20万元的部分，可提成5%；
		//40万到60万之间时高于40万元的部分，可提成3%；
		//60万到100万之间时，高于60万元的部分，可提成1.5%，
		//高于100万元时，超过100万元的部分按1%提成，在程序中设定一个变量为当月利润，求应发放奖金总数？	
			
			double a=1010000;
			if(a<=100000)
			{
			   a=a*0.1;
			}
			else if(a<=200000)
			{
				a=100000*0.1+(a-10)*0.075;
			}
				
					else if (a<=400000)
					{
						a=100000*0.1+100000*0.075+(a-200000)*0.05;
					}
						
							else if (a<=600000)
							{
								a=100000*0.1+100000*0.075+200000*0.005+(a-400000)*0.03;

							}
							    else if (a<=1000000)
							    {
							    	a=100000*0.1+100000*0.075+200000*0.05+200000*0.03+(a-600000)*0.015;

							    }
							    else{
							    	a=100000*0.1+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(a
							    			-1000000)*0.01;

							    }System.out.println(a);
				}
			
             
			
	

}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

