package com.neuedu.test5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           
		System.out.println(sum(5));
		
		System.out.println(isleapyear(1995));
		
		System.out.println(zhishu(2005));
		
	}
	//��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5�� 

	// ��дһ���������жϸ������ƽ�껹�����ꡣ 

    //  ��дһ���������������200����С�������� 

	//   дһ�����������ܣ�����һ��һά��int ���飬��������,Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩡�

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
			boolean flag=true;//������
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;//��������
				}
			}
			if(flag)
			{
				return i;
			}
				
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
