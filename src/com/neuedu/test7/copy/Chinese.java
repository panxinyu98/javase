package com.neuedu.test7.copy;

public class Chinese {
    //��̬
	String name;
	static String country;
	int age;
	
	/*����ص��ڴ��Զ�ִ��
	 * 
	 * ��ʲôʱ�򱻼��ص��ڴ棺
	 * 1.Chinese.����/����
	 * 2.Chinese c=new Chinese();
	 * 
	 * ִ��˳��
	 * 1.��̬�����
	 * 2.���췽��
	 * 
	 * 
	 * ���ã���static�����Ը���ֵ
	 * 
	 * */
	static{
		country = "�й�";
		System.out.println("static");
	}
	
	//��ͨ�����
	{
		System.out.println("hahaah");
	}
	
	public Chinese()
	{
		System.out.println("constructor");
	}
	
	public Chinese(String name,int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("constructor");
	}
	
	/* ע�⣺
	 *   static �ķ�����ֻ�ܷ���static������
	 *   static �ķ����ﲻ��дthis,super
	 * ʲô����Ӧ�ö���static��������û�ж������ԣ������Կ��ǳɶ��徲̬��
	 * ���徲̬�ĺô������õ�ʱ��ֱ���� ����.���� �Ϳ���
	 * */
	
	public static void showInfo()
	{
		System.out.println(country);
	}
	
	public void showName()
	{
		//���Է���static
	   System.out.println(name );	
	   System.out.println(country);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chinese c1 = new Chinese();
		c1.name = "xx";
		Chinese.country = "�й�";
		c1.age =20;
		
		Chinese c2 = new Chinese();
		
		c2.country = "�л����񹲺͹�";
        //System.out.println(Chinese.country);

		showInfo();
	}

}
