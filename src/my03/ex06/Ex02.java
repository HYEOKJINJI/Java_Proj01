package my03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("3,6,9의 배수가 맞는지 숫자를 넣어주세요");
		int num1 = sc.nextInt();
		System.out.println((num1%3==0 & num1%6==0 & num1%9==0)? "3,6,9의 배수입니다.": "3,6,9의 배수가 아닙니다.");
		

	}

}
