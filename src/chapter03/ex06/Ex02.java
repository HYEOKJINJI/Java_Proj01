package chapter03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제 2 Ex02> 스케너로 3,6,9 의 배수이면 "3,6,9의 배수입니다"
					// 그렇지 않으면 "3,6,9의 배수가 아닙니다: 룰 츌룍
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("숫자를 넣어주세요");
		num=sc.nextInt();
		
		
		System.out.println((num%3==0 || num%6 ==0 || num%9==0)?   "은 3,6,9 의 배수입니다." : "3,6,9의 배수가 아닙니다");
		
		
		
	}

}
