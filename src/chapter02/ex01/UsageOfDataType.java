package chapter02.ex01;

public class UsageOfDataType {

	public static void main(String[] args) {
		// 변수 선언 및 값 대입을 위한 두가지 방법

		// 1. 변수를 선언하고, 이후에 값을 대입
				// 자바는 변수를 선언하면 값이 비어있다.
		int a;		// 변수 선언( 1번만 선언 )
		//System.out.println(a);		오류가 발생
		a = 3;		// 변수의 값을 할당.
		System.out.println(a);	// 3
		a = 5;
		System.out.println(a);	// 5
		
		// 2. 변수를 선언과 동시에 값을 대입하는 방법
		
		int b = 4;	// 변수 선언과 동시에 값을 할당.
		System.out.println(b);
		b = 7;
		System.out.println(b);
		
		
		
	}

}
