package com.neuedu.test7.copy;


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr = new Student[5];
		
		//放5个学生
		arr[0] = new English("xiaohong",88,99,95);//此处有向上转型
		arr[1] = new Computer("xioli",90,91,92,77);
		arr[2] = new Literature("xiaowang",88,89,94,75);
		arr[3] = new English("xiaomao",77,88,96);//此处有向上转型
		arr[4] = new Computer("xiaogang",92,91,93,82);
		
		//循环数组
		for(Student s: arr)
		{
			System.out.println(s.name +":"+s.getTotalScore());//触发了多态
		}
		
        
	}

}

class Student{
	
	String name;	
	double midscore;
	double endscore;
	
	public Student(String name, double midscore, double endscore)
	{
		this.name = name;
		this.midscore = midscore;
		this.endscore = endscore;
	}
	
	//这个方法，标准，子类一定要重写这个方法
	public double getTotalScore()
	{
		return 0;
	}
	
}

class English extends Student{
	
	double speech;
	
	public English(String name, double speech, double midscore, double endscore)
	{		
		super(name, midscore,endscore);		
		this.speech = speech;
	}
	
	@Override
	public double getTotalScore()
	{
		return this.speech * 0.5 + super.midscore*0.25 + super.endscore*0.25;
	}
}

class Computer extends Student{
	
	double operation;
	double writing;
	
	public Computer(String name, double operation, double writing, double midscore, double endscore)
	{
		super(name,midscore,endscore);
		this.operation = operation;
		this.writing = writing;
	}
	
	@Override
	public double getTotalScore()
	{
		return this.operation * 0.4 + this.writing *0.2 + super.midscore*0.2 + super.endscore*0.2;
	}
	
}

class Literature extends Student{
	
	double speech;
	double product;
	
	public Literature(String name, double speech, double product, double midscore, double endscore)
	{
		super(name,midscore,endscore);
		this.speech = speech;
		this.product = product;
	}
	
	@Override
	public double getTotalScore()
	{
		return this.speech * 0.35 +this.product*0.35 +super.midscore*0.15 + super.endscore*0.15;
	}
	
}
