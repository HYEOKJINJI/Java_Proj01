package chapter03.ex03;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// <실습 문제>		p.jangwoo@gmail.com Ex01.java
		// 정수 2개를 Scanner 로 인풋 받고 두 값이 같으면 true 를 출력 다르면 false 를 출력
		// 이름 2개를 Scanner 로 인풋 받고 두 값이 같으면 true 를 출력 다르면 false 를 출력
			// 등가 연산자 사용. 
			// 기본 자료형 : ==
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		System.out.println("비교할 첫 수를 넣어주세요");
		a = sc.nextInt();
		System.out.println("비교할 두번째 수를 넣어주세요");
		b = sc.nextInt();
		System.out.println(a==b);
	
		
			//참조 자료형 : aName.equals(bName)
		String aname;
		String bname;
		System.out.println("비교할 첫 이름을 넣어주세요");
		aname = sc.next();
		System.out.println("비교할 두번째 이름을 넣어주세요");
		bname = sc.next();
		System.out.println(aname.equals(bname));
	
		
		
		
		
		
		
		
		
		
		
	}

}
