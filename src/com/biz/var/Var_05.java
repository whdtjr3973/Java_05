package com.biz.var;

public class Var_05 {
	
	public static void main(String[] args) {
		
		String strNum1 = "30";
		String strNum2 = "40";
		
		// ���ڿ� ������ ���ڿ��� �����Ѵ�.
		System.out.println(strNum1 + strNum2);
		
		// Integer.valueOf("���ڿ�������")
		// ���ڿ������ڸ� ���������� ��ȯ��Ű�� ���
		int intSum = Integer.valueOf(strNum1);
		intSum += Integer.valueOf(strNum2);
		intSum = Integer.valueOf(strNum1) + Integer.valueOf(strNum2);
		System.out.println(intSum);
		
		System.out.println(Integer.valueOf("300") + 30 );
		
		
	}

}
