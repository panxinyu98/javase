package com.neuedu.test6;

public class Employee {
	
	//Ĭ�Ϲ��췽������������
	//1.���������������һ��
	//2.�����з���ֵ
	public Employee()
	{
		//��һ�����췽���������һ�����췽��
		//this("JONE DOE",18,22);
		//this()������ڹ��췽����ĵ�һ��
		this("JONE DOE");
		this.age = 20;
		this.salary =3544;
		
	}
	
	
	
	
	/*public Employee()
	{
		System.out.println("invoked");
	}
	*/
	//�вι��췽��
	//���췽����������
	//ע�⣺����Լ������˹��췽����jdk�Ͳ�������Ĭ�ϵ��޲εĹ��췽����һ���Լ����˲Σ�һ��Ҫ���޲�д����
	/*public Employee(String _name,int _age,double _salary)
	{
		name = _name;
		age = _age;
		salary = _salary;
	}*/
	
	//this ����ǰ����
	public Employee(String name,int age,double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	//����  ��Ĭ��ֵ

		String name;
		int age;
		double salary;
		
		public Employee(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public int getAge()
		{
			return age;
		}
		
		
		public void updateName(String name)
		{
			this.name = name;
		}

		
		public double getSalary()
		{
			return salary;
		}

		
		public static void main(String[] args) {
			//����һ��Ա���Ķ���
			//new Employee() ,������Ĺ��췽��
			/*Employee e1 = new Employee();
			
			e1.name = "zhangsan";
			e1.age =25;
			e1.salary=8888;
			
			System.out.println(e1.getAge());
			System.out.println(e1.getName());
			System.out.println(e1.getSalary());*/
			
			Employee e1 = new Employee();
			e1.name = "zhangsan";
			e1.updateName("james");
			
			//System.out.println(e1.name);
			//System.out.println(e1.getName());
			
			//�ٴ���һ��Ա��
             /*Employee e2 = new Employee();
			
			e2.name = "lisi";
			e2.age =35;
			e2.salary=5566;
			
			System.out.println(e2.getAge());
			System.out.println(e2.getName());
			System.out.println(e2.getSalary());*/
			
			//ʹ���в����ķ��������ù��췽��
			
			Employee e2 = new Employee("maomao",6,22.3);
			
			System.out.println(e2.name);
			System.out.println(e2.age);
			System.out.println(e2.salary);
			
			//�ٴ���һ��Ա��
			Employee e3 = new Employee("lele");
			System.out.println(e3.name);
			
		}
		
		
	}


