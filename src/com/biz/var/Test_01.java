package com.biz.var;

public class Test_01 {
	
	public static void main(String[] args) {
		
		// 만약 i가 9인 경우
		for(int i =2; i <=100; i++) {

			int j = 2;
			 for(j = 2; j < i; j++) {
				// j가 3이 되는경우
				// 9%3 ==0 의 조건문이 true가 되고 
				// 9%4 ==0 이후는계산할 필요가 없다.
				 if(i % j == 0) {

					 break;
				 }
			 }
			 
			 // break 이후 실행 되는곳
			 // i값이 소수이면
			 // 	j >= i
			 // i값이 소수가 아니면
			 //		j < i
			 if(j >= i ) {
				 System.out.println(i + "는 소수입니다.");
			 }
		}

	}
}