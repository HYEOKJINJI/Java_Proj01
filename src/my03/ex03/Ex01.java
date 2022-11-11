package my03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비교할 숫자를 두 숫자를 공백을 넣어 비교해 주세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1==num2);
		System.out.println("비교할 이름을 공백을 넣어 비교해주세요.");
		String aName = sc.next();
		String bName = sc.next();
		System.out.println(aName.equals(bName));

	sc.close();

	}

}
