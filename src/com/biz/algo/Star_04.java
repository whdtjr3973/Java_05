package com.biz.algo;

import java.util.Random;

public class Star_04 {

	public static void main(String[] args) {

		int Num1 = 0;
		// Random type�� ������ ����
		// Random type�� ������ �ʱ�ȭ�� �ϴµ�
		// new ��� Ű���带 �̿��ؼ� �ʱ�ȭ�� ����
		Random rnd = new Random() ;
		
		// Random type�� �̿��ؼ� ������ rnd��� ������
		// Random type���� �����ϴ� �پ��� ��ɵ��� �����ϴ�
		// Ʋ���� ������ �ȴ�.
		// �̷��� �������� ��ü��� �Ѵ�.
		// 		�Ǵ� �ν��Ͻ���� �Ѵ�.
		Num1 = rnd.nextInt(10);
		
		System.out.println(Num1);
		
		for(int i = 1; i <= Num1+1; i++) {
			for(int j =1; j<= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
