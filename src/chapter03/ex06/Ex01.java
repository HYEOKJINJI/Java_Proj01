package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수 값이 홀수 이면 "홀수" 라고 출력
				// 인풋 받은 값이 짝수이면 "짝수" 라고 출력
				// 삼항 연산자를 사용
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("숫자를 넣어주세요");
		num = sc.nextInt();
		
		System.out.println((num%2 == 0)? "짝수입니다" : "홀수입니다");
	


	}

}
