package com.neuedu.test7.copy;


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Student{
	
	double midscore;
	double endscore;
	
	public Student(double midscore, double endscore)
	{
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
	
	public English(double speech, double midscore, double endscore)
	{		
		super(midscore,endscore);		
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
	
	public Computer(double operation, double writing, double midscore, double endscore)
	{
		super(midscore,endscore);
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
	
	public Literature(double speech, double product, double midscore, double endscore)
	{
		super(midscore,endscore);
		this.speech = speech;
		this.product = product;
	}
	
	@Override
	public double getTotalScore()
	{
		return this.speech * 0.35 +this.product*0.35 +super.midscore*0.15 + super.endscore*0.15;
	}
	
}