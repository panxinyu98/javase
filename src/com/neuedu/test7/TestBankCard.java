package com.neuedu.test7;

public class TestBankCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ý�ǿ�ˢ��
		DebitCard dc= new DebitCard(1000);
		shuaka(dc,500);
		
		//�����ÿ�ˢ��
		CreditCard cc= new CreditCard(200);
		shuaka(cc,500);
		
		
		
	}
	//������̬
	public static void shuaka(BankCard c,int money)
	{
		c.shuaka(money);
	}
	
}
class BankCard{
	public void shuaka(int money){
		System.out.println("ˢ��:"+money);

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
			System.out.println("��ǿ�ˢ����ˢ��"+money+",��"+this.balance);

		}
		else {
			System.out.println("����");
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
			System.out.println("���ÿ�ˢ����ˢ��"+money+",��"+this.balance);

		}
		else {
			System.out.println("���ÿ���Ȳ���");
		}
	}
}