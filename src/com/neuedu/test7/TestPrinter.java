package com.neuedu.test7;

/*  ��̬�γɵ�����������
 * 1.���Ӽ̳й�ϵ
   2.������д���෽��
   3.��������ָ��������� ->����ת��
   */






public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p= new BlackWhitePrinter();
		
		//�ر�ע�⣺���õĲ��Ǹ���ĵ��÷��� �����Ǿ�������ķ���
		
		p.print();//�����˶�̬��Ч��
		
		
	}

}
class Printer{
	public void print(){
		System.out.println("print");
	}
	
}
class ColoredPrinter extends Printer{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("coloredprinter");
	}
	
	
}

class BlackWhitePrinter extends Printer{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("blackwhiteprinter");
	}
	
}