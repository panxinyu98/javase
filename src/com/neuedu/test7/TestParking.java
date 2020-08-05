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
	   //参数多态(好处： 入参的类型更加宽泛)

      //参数多态(让入参类型更加宽泛)
	public static void park(Bus b)
	{
		int money=b.payParkingFee();//触发多态
		
		System.out.println(money);
	}
	
	//静态多态，编译时多态，通过方法重载来实现
	
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