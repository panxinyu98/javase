package com.neuedu.test7.copy;

import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Ball ball = Ball.createNewPlayer();
			if(ball == null) {
				System.out.println("对不起，已经创建了11个球员对象");
				break;
			} else {
				System.out.println("创建了一个球员对象！");
			}
		}
	}
}

class Ball{
	private static int count = 0; //创建一个对象，count会加1
	private static int num = 11; //最多创建11个对象
	private Ball(){
		count++;
	}	
	public static Ball createNewPlayer() {
		//count<num时，可以创建新的对象
		if (count < num) {
			return new Ball(); 
		} else {
			return null;
		}
	}	
}
