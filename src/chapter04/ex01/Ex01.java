package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// IF 문을 사용해서
		// 스캐너를 사용해서 가지고 있는 돈을 입금 받습니다.
		// 0 ~ 3000 : 걸어서 다닙니다.
		// 3000 ~ 30000 : 지하철을 타고 다닙니다.
		// 30000 ~ 100000 : 택시를 타고 다닙니다.
		// 100000 ~ 	: 비행기를 타고 다닙니다.
		System.out.println("돈을 입금해주세요");
		
		Scanner sc = new Scanner(System.in);
		int money ; 
		money=sc.nextInt();
		System.out.println(money+"원이 입금되어");

		if (money>=0&&money<3000) {
			System.out.println("걸어서 다닙니다.");
		}else if (money >=3000 && money < 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		}else if (money >=30000 && money < 100000) {
			System.out.println("택시를 타고 다닙니다");
		}else if (money>=100000) {
			System.out.println("비행기를 타고 다닙니다");
		}else {
			System.out.println("숫자만 넣어주세요");
		}
		
		
		

	}

}
