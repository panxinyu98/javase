package com.neuedu.test7.copy;

import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Ball ball = Ball.createNewPlayer();
			if(ball == null) {
				System.out.println("�Բ����Ѿ�������11����Ա����");
				break;
			} else {
				System.out.println("������һ����Ա����");
			}
		}
	}
}

class Ball{
	private static int count = 0; //����һ������count���1
	private static int num = 11; //��ഴ��11������
	private Ball(){
		count++;
	}	
	public static Ball createNewPlayer() {
		//count<numʱ�����Դ����µĶ���
		if (count < num) {
			return new Ball(); 
		} else {
			return null;
		}
	}	
}
