package com.neuedu.test7.copy;


/*1.Cola��˾�Ĺ�Ա��Ϊ���������ࣺ 

ColaEmployee ����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��

SalariedEmployee �� ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н

HourlyEmployee ��ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��

SalesEmployee ��ColaEmployee �����࣬������Ա�������������۶������ʾ��������ԣ������۶�����

����һ����Company���ڸ�����дһ�����������ø÷������Դ�ӡ��ĳ��ĳ��Ա���Ĺ������дһ��������TestCompany,��main�����������ɸ������͵�Ա������һ��ColaEmployee ���������Ԫ��������ÿ��Ա�����µĹ��ʡ�
*/


public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColaEmployee[] emps = new ColaEmployee[3];
		emps[0] = new SalariedEmployee(8000,"xiaoming",8);
		emps[1] = new HourlyEmployee(200,180,"xiaogang",10);
		emps[2] = new SalesEmployee(190000,0.15,"С��",8);
		
		Company c = new Company();
		
		for(ColaEmployee e :emps)
		{
			c.showInfo(e, 8);
		}


	}

}
class Company{
	
	public void showInfo(ColaEmployee c, int month)
	{
		System.out.println(c.name+","+c.getSalary(month));

	}
	
}

class ColaEmployee{
	String name;
	int birth;
	public ColaEmployee(String name, int  birth)
	{
		this.name = name;
		this.birth = birth;
	}
	
	public double getSalary(int month )
	{
		if(month==this.birth )
		{
			return 100;
		}
		return 0;
	}
	
}

class SalariedEmployee extends ColaEmployee{

	double monthsalary;
	
	public SalariedEmployee(double monthsalary,String name,int  birth)
	{		
		super(name, birth);		
		this.monthsalary = monthsalary;
	}
     @Override
	public double getSalary(int month )
	{
		return super.getSalary(month)+this.monthsalary;
		
	}
	
}
class HourlyEmployee extends ColaEmployee{
	double hoursalary;
	int hour;
	
	public HourlyEmployee(double hoursalary,int hour,String name,int  birth)
	{		
		super(name, birth);		
		this.hoursalary = hoursalary;
		this.hour=hour;
		
	}
	@Override
	public double getSalary(int month)
	{   double total=0;
	if(hour>160)
	{
		total=(hour-160)*1.5*hoursalary+160*hoursalary;
	}
	else {
		total=hour*hoursalary;
	}
		return  super.getSalary(month)+total;
	}
	
}

class SalesEmployee  extends ColaEmployee{
	
	double money;
	double percentage;
	
	public SalesEmployee(double money,double percentage,String name, int birth)
	{
		super(name,birth);
		this.money = money;
		this.percentage = percentage;
	}
	
	@Override
	public double getSalary(int month)
	{
		return super.getSalary(month) + this.money * this.percentage;
	}
}


