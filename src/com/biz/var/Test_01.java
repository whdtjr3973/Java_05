package com.biz.var;

public class Test_01 {
	
	public static void main(String[] args) {
		
		// ���� i�� 9�� ���
		for(int i =2; i <=100; i++) {

			int j = 2;
			 for(j = 2; j < i; j++) {
				// j�� 3�� �Ǵ°��
				// 9%3 ==0 �� ���ǹ��� true�� �ǰ� 
				// 9%4 ==0 ���Ĵ°���� �ʿ䰡 ����.
				 if(i % j == 0) {

					 break;
				 }
			 }
			 
			 // break ���� ���� �Ǵ°�
			 // i���� �Ҽ��̸�
			 // 	j >= i
			 // i���� �Ҽ��� �ƴϸ�
			 //		j < i
			 if(j >= i ) {
				 System.out.println(i + "�� �Ҽ��Դϴ�.");
			 }
		}

	}
}