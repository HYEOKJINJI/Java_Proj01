package my03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("비교할 숫자를 공백을 넣어 입력해 주세요");
		int num1 = sc.nextInt();
		System.out.println((num1%2==0)? "짝수" : "홀수");
		

	}

}
