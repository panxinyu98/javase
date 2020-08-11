package com.neuedu.test10;

public class TestContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Container<String> c = new Container<>();
		
		c.setE("a");
		
		String str = c.getE();
		
		System.out.println(str);
		
		Container<Integer> c2 = new Container<>();
		
		c2.setE(100);
		
		int x=c2.getE();
	}

}
