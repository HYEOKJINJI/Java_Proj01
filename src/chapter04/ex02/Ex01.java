package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> switch 문을 사용하여 프로그램 하세요.
		//	  스캐너로 정수 1 을 인풋 받으면 "금메달 입니다"출력
		//				2 를 인풋 받으면  은메달
		//              3 을 인풋 받으면  동
		//              그외 메달이 없습니다
	
	Scanner sc = new Scanner (System.in);	
	System.out.println("순위를 입력하세요.");
	int medal;
	medal = sc.nextInt();
	switch (medal) {
	case 1:
		System.out.println("금메달 입니다.");
		break;
	case 2:
		System.out.println("은메달 입니다.");
		break;
	case 3:
		System.out.println("동메달 입니다.");
		break;
	default:
		System.out.println("메달이 없습니다.");
		break;
		
	}
	// <문제 2>>
	System.out.println("===========================");
	
	
	String medal2;
	System.out.println("메달을 입력해 주세요.");
	medal2 = sc.next();
	
	switch (medal2){ 
	
	case "gold": case "Gold": case "GOLD":      // 케이스를 여러개 넣을 수 있다. break; 안쓰면 계속 넘어가서 가능
		System.out.println("금메달 입니다");
		break;
	case "silver": case "Silver": case "SILVER":
		System.out.println("은메달 입니다");
		break;
	case "bronze": case "Bronze" : case "BRONZE":
		System.out.println("동메달 입니다.");
		break;
	default:
		System.out.println("메달이 없습니다.");
		break;
	
	}
	
	sc.close(); // <=== Scanner 를 사용하면 마지막에 sc.close(); 해줘야한다.
	
	
  }
	

}


