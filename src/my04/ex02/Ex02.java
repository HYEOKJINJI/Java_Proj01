package my04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("입력하신 달이 몇일인지 알려드리겠습니다.");
		int day = 30;
		int month = sc.nextInt();
		switch(month) {
		case 1 :case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
			System.out.println(month+"월은 "+(day+=1)+"일 입니다.");
			break;
		case 2:
			System.out.println(month+"월은 "+ (day-=2)+"일 입니다.");
			break;
		default:
			System.out.println(month+"월은 "+ day + "일 입니다.");
			break;
		}
		

	}

}
