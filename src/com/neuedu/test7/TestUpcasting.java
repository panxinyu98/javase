package com.neuedu.test7;

public class TestUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		//����ת�� ->��������ָ���������
		Animal a = new Cat();
		
		//����->��ʧ�������е����Ժͷ���
		
		//����ת��
		//ע�⣺1.ǰ����������ת�� 2.����ǿ������ת��
		//��ʲô�ã��õ��������е����Ժͷ���
		Animal b = new Animal();
		Cat c2 = (Cat)a;
		
		//���С����
		//����ת��
		Animal ani = buyAnimal();
		//����ת�ͣ����ж����ͣ�
		if(ani instanceof Cat)
		{
			Cat cat = (Cat)ani;
			cat.miao();
		}
		if (ani instanceof Dog)
		{
			Dog dog = (Dog)ani;
			dog.bark();
		}
		
	}
	
	public static Animal buyAnimal()
	{
		return new Cat();
	}
	
	
	
	
	
	

}

class Animal{
	String name;
	
	public void eat(){
		
	}
}

class Cat extends Animal{
	int age;
	public void miao(){
		
	}
}

class Dog extends Animal{
	String bark;
	public void bark()
	{
		
	}
}






