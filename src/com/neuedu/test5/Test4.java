package com.neuedu.test5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(5);
		
		
	}
	//��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5�� 

	// ��дһ���������жϸ������ƽ�껹�����ꡣ 

    //  ��дһ���������������200����С�������� 

	//   дһ�����������ܣ�����һ��һά��int ���飬��������,Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩡�

	public static void sum(int x) 
	{    int n = 1;
		for(int y=1;y<=x;y++)
		{
			n*=y;
			
		}
		System.out.println(n);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
