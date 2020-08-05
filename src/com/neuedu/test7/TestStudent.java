package com.neuedu.test7;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Student s = new Student();
			s.setName("小花");
			s.setAge(13);
			s.setSex("女");
		
			Student s2 = new Student("hua",12,"女");
			//修改信息
			s2.setName("小明");
			s2.setAge(23);
			s2.setSex("男");
			
			System.out.println(s2.getName());
			System.out.println(s2.getName());
			System.out.println(s2.getName());
	}

}
