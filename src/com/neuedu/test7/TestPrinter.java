package com.neuedu.test7;

/*  多态形成的三种条件：
 * 1.父子继承关系
   2.子类重写父类方法
   3.父类引用指向子类对象 ->向上转型
   */






public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p= new BlackWhitePrinter();
		
		//特别注意：调用的不是父类的调用方法 ，而是具体子类的方法
		
		p.print();//出现了多态的效果
		
		
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