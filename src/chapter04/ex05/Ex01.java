package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> do while 문으로 무한루프를 돌립니다.
		//	스캐너에서 1 을 넣으면 "1. 평균출력" 으로 출력
		//	스캐너에서 2            ;;
		//	스캐너에서 3			 ;;
		// 	스캐너에서 4 번을 넣으면 빠져나옴
		//		1 ~ 4이 외의 번호를 넣으면 "잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요."
		Scanner sc = new Scanner(System.in);
		int a ;
		do {
			System.out.println("===============================================");
			System.out.println("1. 평균출력 | 2. 합계출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("===============================================");
			System.out.println("위 번호를 선택하세요>>>");
			a=sc.nextInt();
			
			if(a==1) {
				System.out.println("1. 평균 출력");
			}else if(a==2) {
				System.out.println("2. 합계출력");
			}else if(a==3) {
				System.out.println("3. 이름 출력");
			}else if (a==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요.");
			}
			
			
		}while (true);	// true.. 어렵다..
		System.out.println("do while 문을 빠져 나왔습니다.");
	}
}
	