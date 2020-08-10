package com.neuedu.test7.copy;

public class TestAlarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlarmDoor a = new AlarmDoor();
		//����ת��
		a.alert();
		a.length = 100;
		a.width = 50;
		
		a.open();
		
		a.close();
		
		System.out.println(a.cst);
		
		a.test();

	}

}

interface Test{
	
	String cst = "test";
	
	public void test();
}



class Door
{
   String brand;
   int length;
   int width;
   
   public void open()
   {
	   System.out.println("open");
   }
   
   public void close()
   {
	   System.out.println("close");
   }
   
   
}

/*
 * �ӿڣ��ж��ؼ̳е�Ч��
 * */
class AlarmDoor extends Door implements Alarm,Test{

	@Override
	public void alert() {
		System.out.println("alert");
		
	}

	@Override
	public void test() {
		System.out.println("test");

	}
	
}