package com.biz.var;

public class Var_04 {
	
	public static void main(String[] args) {
		
		int intKor = 83;
		int intEng = 72;
		int intMath = 75;
		
		int intSum = intKor + intEng + intMath ;
		System.out.println("���� : " + intSum);
		System.out.println("��� : " + intSum/3);
		
		//�Ǽ����� �⺻���� double������ 8byte ũ��
		System.out.println("��� : " + intSum/3.0);
		System.out.println("��� : " + (double)intSum / 3.0);
		// f�� �ٿ��ָ� float������ 4byte ũ��
		System.out.println("��� : " + intSum/3.0f);
		System.out.println("��� : " + (float)intSum / 3.0f);
		
	}

}
