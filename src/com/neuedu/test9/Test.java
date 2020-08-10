package com.neuedu.test9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//创建两个student对象
		Student s1=new Student("xx",12);
		Student s2=new Student("YY",18);
		
		System.out.println(s1);//默认调用了s1.toString()
		System.out.println(s2);//默认调用了s1.toString()

		
		//默认object的equals比较的是两个对象的内存地址
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//打印s1和s2的哈希码
		
		/*（粗略定位，不是对象的唯一标识）
		 * 哈希码:1.哈希码不同，能确定对象一定不同
		 *      2.哈希码相同，对象可能相同，可能不同。
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            哈希码相同，对象可能相同，可能不同
		 * 
		 * */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
class Student{
	private String name;
	private int age;
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age =age;
	}

	@Override
	public boolean equals(Object obj) {
		
		Student s2 = (Student)obj;
		if(this.name.equals(s2.name) && this.age==s2.age){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.name +","+this.age;
	}


}



class Employee {
	private String name;
	private String department;
	@Override
	public boolean equals(Object obj) {
		Employee e2 = (Employee)obj;
		if(this.name.equals(e2.name) && this.department==e2.department){
			return true;
		}
		return false;
	}
	}
	
	











