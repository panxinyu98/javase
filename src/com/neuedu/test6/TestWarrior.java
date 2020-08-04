package com.neuedu.test6;

import java.util.Random;

public class TestWarrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建两个战士
		Warrior f1= new Warrior("大毛");
		Warrior f2= new Warrior("小毛");		
		
		Random r= new Random();//产生随机数
		
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
	
	//默认100
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
			System.out.println(w.name+"死了");
		}
		else
		{
			System.out.println(this.name +"砍了"+w.name+"一刀， "+w.name+"掉了"+num+"滴血，剩余blood:"+w.blood);;
		}
	}

}
