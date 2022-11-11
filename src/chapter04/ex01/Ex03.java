package chapter04.ex01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// <<스케너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성 해주세요.
		// IF 
		int select ;
		
		int kor;
		int eng;
		int math;
		
		int a;
		
		String aName;
		String bName;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=============================================");
		System.out.println(" 1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름 삭뵬");
		System.out.println("=============================================");
		System.out.println("위의 번호를 선택 하세요.>>>>>");
		select = sc.nextInt();
		if (select==1) {
			System.out.println("국어의 점수를 입력하세요.");
			kor = sc.nextInt();
			System.out.println("영어의 점수를 입력하세요.");
			eng = sc.nextInt();
			System.out.println("수학의 점수를 입력하세요.");
			math = sc.nextInt();
			int sum;
			sum = kor + eng + math;
			double avg;
			avg = sum / 3.0;
			System.out.println("학점의 합계는"+sum+"이고 평균은"+avg+"입니다.");
			
			
		}else if (select==2) {
			System.out.println("숫자를 넣어주세요");
			a = sc.nextInt();
			System.out.println((a %2==0)? "짝수":"홀수");
		}else if (select==3) {
			System.out.println("비교할 첫 이름을 넣어주세요");
			aName = sc.next();
			System.out.println("비교할 두번째 이름을 넣어주세요");
			bName = sc.next();
			System.out.println((aName.equals(bName))? "같습니다" : "다릅니다");
		}else {
			System.out.println("1~3 사이의 숫자를 입력해주세요");
		}
		

	}

}
