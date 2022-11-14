package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 스캐너로 인풋 받은 값을 선택시 해당 내용을 이중 for 문을 사용해서 출력 하세요.
		// 4. 프로그램 종료시까지 무한 루프를 돌려서 작동 시키세요.
		// 1 ~ 4 번 외의 내용을 선택시 " 잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요."
		
		Scanner sc = new Scanner(System.in);
		
		do {System.out.println("===============================================================");
		System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7의배수단만 출력 | 4. 프로그램 종료");
		System.out.println("===============================================================");
		System.out.println("위 번호를 선택하세요>>>");
		int num1 = sc.nextInt();
			if (num1==1) {
				for (num1=1; num1<10; num1++) {
					for (int num2=1; num2<10; num2++) {
						System.out.println(num1+" * "+ num2+" = "+num1*num2);
					}
				}
				
			if (num1==2) {
				for (num1=1; num1<20; num1++) {
					for (int num2=1; num2<20; num2++) {
						System.out.println(num1+" * "+num2+" = "+ num1*num2);
					}
				}
			}
			}else if (num1==2) {
				for (num1=1; num1<20; num1++) {
					for (int num2=1; num2<20; num2++) {
						System.out.println(num1+" * "+num2+" = "+ num1*num2);
					}
				}
			}else if (num1==3) {
				for (num1=7; num1<20; num1+=7) {
					for (int num2=1; num2<20; num2++) {
						System.out.println(num1+" * "+num2+" = "+ num1*num2);
					}
				}
			}else if (num1==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요.");
			}
		}while(true);	
		sc.close();
			
		

	}

}
