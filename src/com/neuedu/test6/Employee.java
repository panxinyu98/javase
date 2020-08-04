package com.neuedu.test6;

public class Employee {
	
	//默认构造方法（构造器）
	//1.方法名必须跟类名一样
	//2.不能有返回值
	public Employee()
	{
		//在一个构造方法里调用另一个构造方法
		//this("JONE DOE",18,22);
		//this()必须放在构造方法里的第一句
		this("JONE DOE");
		this.age = 20;
		this.salary =3544;
		
	}
	
	
	
	
	/*public Employee()
	{
		System.out.println("invoked");
	}
	*/
	//有参构造方法
	//构造方法可以重载
	//注意：如果自己定义了构造方法，jdk就不会生成默认的无参的构造方法，一旦自己有了参，一定要把无参写出来
	/*public Employee(String _name,int _age,double _salary)
	{
		name = _name;
		age = _age;
		salary = _salary;
	}*/
	
	//this 代表当前对象
	public Employee(String name,int age,double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	//属性  有默认值

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
			//创建一个员工的对象
			//new Employee() ,调用类的构造方法
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
			
			//再创建一个员工
             /*Employee e2 = new Employee();
			
			e2.name = "lisi";
			e2.age =35;
			e2.salary=5566;
			
			System.out.println(e2.getAge());
			System.out.println(e2.getName());
			System.out.println(e2.getSalary());*/
			
			//使用有参数的方法，调用构造方法
			
			Employee e2 = new Employee("maomao",6,22.3);
			
			System.out.println(e2.name);
			System.out.println(e2.age);
			System.out.println(e2.salary);
			
			//再创建一个员工
			Employee e3 = new Employee("lele");
			System.out.println(e3.name);
			
		}
		
		
	}


