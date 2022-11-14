package my04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("교통비를 입금 받았습니다. 얼마인지 넣어주세요.");
		int num1 = sc.nextInt();
		if (num1>=0&&num1<3000) {
			System.out.println("걸어서 다녀야 겠습니다.");
		}else if (num1>=3000 && num1<30000) {
			System.out.println("지하철을 타고 다녀야 겠습니다.");
		}else if (num1>=30000&&num1<100000) {
			System.out.println("택시를 타고 다녀야 겠습니다.");
		}else {
			System.out.println("비행기를 타고 다녀야 겠습니다.");
		}
	}

}
