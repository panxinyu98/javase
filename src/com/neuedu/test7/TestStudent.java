package com.neuedu.test7;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Student s = new Student();
			s.setName("С��");
			s.setAge(13);
			s.setSex("Ů");
		
			Student s2 = new Student("hua",12,"Ů");
			//�޸���Ϣ
			s2.setName("С��");
			s2.setAge(23);
			s2.setSex("��");
			
			System.out.println(s2.getName());
			System.out.println(s2.getName());
			System.out.println(s2.getName());
	}

}
