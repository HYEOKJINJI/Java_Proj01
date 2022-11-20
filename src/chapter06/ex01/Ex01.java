package chapter06.ex01;

class Man{
	// 필드
	String name = "홍길동";
	int age = 30;
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	
	// 기본 생성자 생략됨 : Man () {}
	
	// 메소드 :
	void add1() {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력
		int sum = 0;
		System.out.println("void1 입니다");
		for (int i = 1; i < 101; i++) {
				if(i%2==0) {
					System.out.print(i + " ");
					sum = i +sum;
				}
		}
		System.out.println();
		
		System.out.println("합계 : "+sum);
		System.out.println();
	}
	void add2() {
		// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값을 출력
		int sum = 0;
		System.out.println("add2입니다");
		for (int  i = 1; i < 501; i++) {
			if (i%3==0 || i%4==0) {
				System.out.print(i + " ");
				sum = i + sum;
			}
			
		}
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println();
	}
	void aad3() {
		// 1 ~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력
		System.out.println("add3 입니다");
		int sum = 0;
		for (int i = 1; i < 1001; i++) {
			if (i%4!=0) {
				System.out.print(i + " ");
				sum = i + sum;
			}
		}
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println();
	}
	
}





public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성 및 객체의 필드의 값이나 메소드 호출 
		Man man = new Man();
		man.add1();
		man.add2();
		man.aad3();
		
		
		
		
		
		
	}

}
