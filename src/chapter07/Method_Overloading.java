package chapter07;

class MethodOverloading{
	
	// 메소드 오버로딩 : 동일한 이름의 메소드이지만 시그니처에 따라서 다른 메소드를 호출하는 것
			// 시그니처 : 매개변수 갯수, 매개변수 데이터 타입
	
	void print() {		// print () : 인풋 매개 변수가 없는 메소드
		System.out.println("데이터가 없습니다.");
	}
	void print(int a) {	// print(int a) : 인풋 매개변수에 정수 1개를 인풋받는 메소드
		System.out.println("int : "+ a);
	}
	void print (double a) {
		System.out.println("double : " + a);
	}
	void print (int a, int b) {
		System.out.println("int 2개 : " + a +" "+ b);
	}
	void print (double a, int b) {
		System.out.println("double 1개, int 1개 " + a + " " + b);
	}
	void print (int c , double k) {
		// 시그니처 중복 항목이 없다
	}
	
	// 메소드 오버로딩의 위배 : 시그니처가 같다
	// void print (double g, int k) {
		
	// }
	
	
}


public class Method_Overloading {

	public static void main(String[] args) {
		// 메소드 오버로딩 : 동일한 이름의 메소드를 시그니처에 따라서 다른 메소드를 호출하는 것
				// 시그니처(식별자) : 메소드의 인풋 매개변수 갯수, 인풋 되는 타입이 다를 경우 다른 메소드로 식별
		// 메소드 오버라이딩 : 상속 에서만 적용됨
			// 부모 클래스에서 선언된 메소드를 자식 클래스에서 재정의 해서 사용하는것
		MethodOverloading mo = new MethodOverloading();
		
		// 1. 매개변수가 없는 메소드 호출
		mo.print();
		
		// 2. 매개변수가 1개인 정수 메소드 호출
		mo.print(10);
		
		// 3. 매개 변수가 1개인 실수 메소드 호출
		mo.print(50.0);
		
		// 4. 매개 변수가 2개인 정수 메소드 호출
		mo.print(30, 70);
		
		// 5. 매개 변수가 2개인 double, int 메소드 호출
		mo.print(55.5, 40);
		
	}

}
