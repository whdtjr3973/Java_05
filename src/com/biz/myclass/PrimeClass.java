package com.biz.myclass;


public class PrimeClass {
	
	/*
	 * lastNum ������ Oop_04����
	 * pc.prime(50)�̶�� ����� �����ϸ�
	 * 50�̶�� ���� �޴� ������ �ٱ��� ������ �Ѵ�.
	 * 
	 * �̷��� ������ Ư���� �Ű�����, argument��� �Ѵ�.
	 * �� ������ Oop_04���� pc.prime()�޼��带
	 * ���Ƿ� �����ϴ� �Ͱ� ���� ȿ���� ���� �ֵ��� �Ѵ�.
	 */
	public void prime(int lastNum) {
		
		for(int i = 1; i <= lastNum; i++) {
			int j = 0;
			for(j =2; j <= i; j++) {
				if(i%j ==0) {
					break;
				}
			}
			if(j >= i ) {
				System.out.println(i + "�� �Ҽ��̴�");
			}
		}
	}
	
	
	
	public void prime() {
		
		for(int i = 1; i <= 100; i++) {
			int j = 0;
			for(j =2; j <= i; j++) {
				if(i%j ==0) {
					break;
				}
			}
			if(j >= i ) {
				System.out.println(i + "�� �Ҽ��̴�");
			}
		}
	}
}
