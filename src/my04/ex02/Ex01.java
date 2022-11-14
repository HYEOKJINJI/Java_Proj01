package my04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("순위를 알려주세요.");
		int num1 = sc.nextInt();
		if (num1==1) {
			System.out.println("금메달 입니다.");
		}else if (num1==2) {
			System.out.println("은메달 입니다.");
		}else if (num1==3) {
			System.out.println("동메달 입니다.");
		}else {
			System.out.println("메달이 없습니다.");

		}
	}

}
