package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("돈을 입금해주세요");
		
		Scanner sc = new Scanner (System.in);
		int money;
		money = sc.nextInt();
		
		if (0<=money&&money<3000) {
			System.out.println("걸어서 다닙니다");
		}else if (3000<=money && money < 30000){
			System.out.println("지하철을 타고 다닙니다");
		}else if (30000<=money&&money<100000) {
			System.out.println("택시를 타고 다닙니다");
		}else if (100000<=money) {
			System.out.println("비행기를 타고 다닙니다");
		}else {
			System.out.println("숫자를 넣어주세요");
		}
			
	


	}

}
