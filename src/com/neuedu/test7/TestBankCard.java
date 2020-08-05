package com.neuedu.test7;

public class TestBankCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//用借记卡刷卡
		DebitCard dc= new DebitCard(1000);
		shuaka(dc,500);
		
		//用信用卡刷卡
		CreditCard cc= new CreditCard(200);
		shuaka(cc,500);
		
		
		
	}
	//参数多态
	public static void shuaka(BankCard c,int money)
	{
		c.shuaka(money);
	}
	
}
class BankCard{
	public void shuaka(int money){
		System.out.println("刷卡:"+money);

	}
	
	
}
class DebitCard extends BankCard{
	double balance;
	public DebitCard(double balance)
	{
		this.balance = balance;
	}

	public void shuaka(int money)
	{
		if(this.balance>=money)
		{
			this.balance -=money;
			System.out.println("借记卡刷卡，刷了"+money+",余额："+this.balance);

		}
		else {
			System.out.println("余额不足");
		}
	}
}

class CreditCard extends BankCard{
	double balance;
	
	 public CreditCard(double balance)
	    {
	    	this.balance = balance;
	    }

	
	public void shuaka(int money)
	{
		if(this.balance>=money)
		{
			this.balance -=money;
			System.out.println("信用卡刷卡，刷了"+money+",余额："+this.balance);

		}
		else {
			System.out.println("信用卡额度不足");
		}
	}
}