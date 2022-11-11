package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스케너를 등록 하고, 
		// 	어머님 이름, 아버님 이름, 형제 이름, 자신 이름		sc.next();
		// 	어머님 나이, 아버님 나이, 형제 나이, 자신 나이		sc.nextInt();
		
		// 콘솔에서 인풋 받은 이름은 모두 출력 
		// 나이의 합계와 평균 출력
		
	Scanner sc = new Scanner(System.in);
	
	String fathername;
	String mothername;
	String broname;
	String myname;
	
	int fatherage;
	int motherage;
	int broage;
	int myage;
	
	System.out.println("어머니 이름을 입력하세요.");
	mothername = sc.next();
	System.out.println("아버지 이름을 입력하세요.");
	fathername = sc.next();
	System.out.println("형제 이름을 입력하세요.");
	broname = sc.next();
	System.out.println("나의 이름을 입력하세요.");
	myname = sc.next();
	System.out.println("어머니의 이름은 "+ mothername + "이고 아버지의 이름은" + fathername + "이고 형제의 이름은" + broname + "이고 나의 이름은" + myname + "입니다");
	
	System.out.println("어머니의 나이를 입력하세요.");
	motherage = sc.nextInt();
	System.out.println("아버지의 나이를 입력하세요.");
	fatherage = sc.nextInt();
	System.out.println("형제의 나이를 입력하세요.");
	broage = sc.nextInt();
	System.out.println("나의 나이를 입력하세요.");
	myage = sc.nextInt();
	
	int sum;
	sum = motherage + fatherage + broage + myage ;
	
	double avg;
	avg = sum / 5.0;
	
	System.out.println("우리 가족의 나이 합계는 "+ sum + "이고");
	System.out.println("우리 가족의 평균 나이는 " + avg + "입니다.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
