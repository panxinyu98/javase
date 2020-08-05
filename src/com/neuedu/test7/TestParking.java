package com.neuedu.test7;

public class TestParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*park(new MiniBus());
		park(new BigBus());
		park(new MiniBus());*/
		
		park(new MiniBus());
		park(new BigBus());

	}
	   //������̬(�ô��� ��ε����͸��ӿ�)

      //������̬(��������͸��ӿ�)
	public static void park(Bus b)
	{
		int money=b.payParkingFee();//������̬
		
		System.out.println(money);
	}
	
	//��̬��̬������ʱ��̬��ͨ������������ʵ��
	
	public static void park(MiniBus m)
	{
		m.payParkingFee();
	}
	
	public static void park(BigBus b)
	{
		b.payParkingFee();
	}

}

class Bus{
	public int payParkingFee()
	{
		return 0;
	}
	
}
class MiniBus extends Bus{
	@Override
	public int payParkingFee()
	{
		return 5;
	}
}

class BigBus extends Bus{
	@Override
	public int payParkingFee()
	{
		return 10;
	}
}