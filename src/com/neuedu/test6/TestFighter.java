package com.neuedu.test6;

import java.util.Random;

public class TestFighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��������սʿ
		Fighter f1= new Fighter("��ë");
		Fighter f2= new Fighter("Сë");		
		
		Random r= new Random();//���������
		
		while(true)
		{
			//f1����һ��
			int num = r.nextInt(10);//0~9�����
			f1.takeDamage(num);
			
			if(f1.blood<=0)
			{
				break;
			}
			
			//f2����һ��
			int num2 = r.nextInt(10);//0~9�����
			f2.takeDamage(num2);
			
			if(f2.blood<=0)
			{
				break;
			}
		}
		
		
		
		
		
		
	}

}

class Fighter{
	//Ĭ��100
	int blood;
	String name;
	
	public Fighter(String name)
	{
		this.name=name;
		this.blood=100;
		
	}
	
	
	
	
	
	public void takeDamage(int num)
	{
		this.blood-=num;
		if(this.blood<=0)
		{
			System.out.println(name+"����,blood="+this.blood);
		}
		else
		{
			System.out.println(name+"����һ��,blood="+this.blood);
		}
	}
}