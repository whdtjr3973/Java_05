package com.biz.myclass;

public class PlusMinus {

	/*
	 * add() method�� �ΰ��� ������ �Ű������� �����ϰ� ������ �ΰ��� ���ڸ� �ٱ��Ͽ� �޾Ƽ� ������ ������ �� ����� �ֿܼ� ǥ���Ѵ�.
	 */
	public void add(int num1, int num2) {
		int intSum = num1 + num2;

		System.out.println(num1 + " ���ϱ� " + num2 + " �� " + (num1 + num2) + " �Դϴ�");

	}

	public void add(int num1) {
		System.out.println(num1);
	}

	/*
	 * method�� �ߺ� ����(overloading)
	 * 
	 */
	public void add(float num1, float num2) {
		// int intSum = num1 + num2 ;

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + " �Դϴ�");

	}
}
