package com.neuedu.test6;

import java.util.Random;

public class TestWarrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��������սʿ
		Warrior f1= new Warrior("��ë");
		Warrior f2= new Warrior("Сë");		
		
		Random r= new Random();//���������
		
		while(true)
		{
			int num = r.nextInt(10);
			f1.HitOther(f2, num);
			if(f2.blood<=0)
			{
				break;
			}
			
			int num2 = r.nextInt(10);
			f2.HitOther(f1, num2);
			if(f1.blood<=0)
			{
				break;
			}	
		}

	}

}

class Warrior{
	
	//Ĭ��100
	String name;
	int blood;
	
	public Warrior(String name)
	{
		this.name = name;
		this.blood = 100;
	}
	
	public void HitOther(Warrior w,int num)
	{
		w.blood-=num;
		if(w.blood<=0)
		{
			System.out.println(w.name+"����");
		}
		else
		{
			System.out.println(this.name +"����"+w.name+"һ���� "+w.name+"����"+num+"��Ѫ��ʣ��blood:"+w.blood);;
		}
	}

}
