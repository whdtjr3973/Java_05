package com.biz.myclass;

public class Oop_07 {

	public static void main(String[] args) {

		String strNation ="���ѹα�";
		int intNum1 = 30;
		
		String strName = new String("ȫ�浿");
		System.out.println(strName.length());
		
		// strnation.
		// intNum.
		
		Integer iNum1 = new Integer(100);
		Integer iNum2 = 100; // ������ iNum1���� ������ 100�� ������ �ʱ�ȭ
		
		iNum2= Integer.valueOf("30");
		
		// Integer, Float, Double, Boolean ����
		// Ŭ�������� �⺻�� ������ ����� ��� �����ϰ��ִ�
		// �׷��� �̷� Ŭ������ wrapper Ŭ���� ����Ѵ�.
		int a1 = 0;
		Integer a11 = 0;
		Integer a111 = new Integer(0);
		
		float f1 = 0.0f;
		Float f11 = 0.0f;
		Float f111 = new Float(0.0F);
		
	}

}
