package com.biz.var;

public class Var_06 {

	public static void main(String[] args) {
		
		/*
		 *  ������, ����, ��ȣ ���� ������ �����ġ�� ����ǰų�
		 *  ����� ���ؼ� �̵��ɶ�
		 *  ASCII �ڵ��� ������ ��ȯ�ȴ�.
		 *  char �� ������ 1���� ���ڸ� �����ϴ� �뵵�� ���
		 *  
		 *  �����ҹ��� a�� ASCII�ڵ� 97�� ǥ���ȴ�.
		 *  
		 *  97���� 26���� ���ڸ� ���ӿ��� char������ ��ȯ�ϸ�
		 *  �����ҹ��ڵ��� �ֿܼ��� �����ִ�.
		 */
		
		for (int i = 97; i < (97+26);  i++) {
			char a = (char)i;
			System.out.println(a);
		}
		
		// ��������ǥ�� ���� 1���� ���ڴ�
		// char������
		// ���̱�� ���ڷ� ��������
		// �����δ� 1byte ũ���� ���ڷ� �νĵȴ�.
		for(int i = 'a'; i <= 'z'; i++		) {
			 System.out.print(i); // ASCII �ڵ尪
			 System.out.print(" : ");
			 System.out.println((char)i); // ASCII �ڵ忡 �ش��ϴ� ����
		}
		// println �� ���� �ֿܼ� ǥ���ϰ� EnterŰ�� ������ó�� 
		// �ٹٲ��� �ϰ�,
		// print �� �ٹٲ��� �����ʴ´�.
		// print�� ����ϸ� �������� ��ɰ���� ���ٿ� �̾ ǥ���Ѵ�.
	}
}
