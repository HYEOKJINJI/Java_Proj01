package chapter11.ex01;

class A {		// 선언과 동시에 값 할당.
	int a = 3;			// 필드 : 값을 수정 할 수 있다.
	final int b= 5;		// 상수 : 값을 수정 할 수 없다.
	
	A(){}
}
class B {		// 선언, 값 할당을 분리
	int a;
	final int b;
	
	B(){
		a = 3;	
		b = 5;
	}
}
class C {
	int a = 3;
	final int b = 5;
	C(){
		a = 7;
//		b = 10;		 오류 발생 한번 들어간 값이 있으면 수정이 안됨.
	}
}



public class Final_Field {

	public static void main(String[] args) {
		// final modifier : 
			// 1. 필드 : 값을 수정하지 못 하도록 [상수]
			// 2. 메소드 : 자식 클래스에서 오버라이딩을 불가
			// 3. 클래스 : 상속이 불가 한 클래스 
		
		A a1 = new A ();
		
		// a: 필드변수 : 값을 수정 할 수 있다.
		// b: 상수 : 값을 수정을 할 수 없다.
		a1.a = 5;
//		a1.b = 6;	// 오류 발생 A 클래스에서 final 상수로 정해놔서 수정 못함
		
		B b1 = new B();
		b1.a = 10;
//		b1.b = 20;	// 오류 발생 B 클래스에서 final 상수로 정해놔서 수정 못함
		

	}

}
