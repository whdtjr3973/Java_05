package com.biz.var;

public class Var_07 {
	
	public static void main(String[] args) {
		
		// 0���� 9���� ������ ASCII �ڵ�
		for(int i = '0'; i <= '9'; i++) {
			System.out.print(i);
			System.out.print(" : ");
			System.out.println((char)i);
		}
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			System.out.print(" : ");
			System.out.println((char)i);
		}
		
		//  ASCII �ڵ� 0���� 255����(8bit)�� ��� ��
		for(int i = 0; i< 256; i++) {
			System.out.print(i);
			System.out.print(" : ");
			System.out.println((char)i);
		}
	}
}
