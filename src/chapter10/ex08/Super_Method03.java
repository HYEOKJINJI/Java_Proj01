package chapter10.ex08;

class A {
	A () {
		this(3);	// 자신 객체의 정수 1개인 생성자 호출
		System.out.println("A 생성자 1 입니다.");
	}
	A(int a){
		System.out.println("A 생성자 2 입니다.");
	}
}
class B extends A{	// 자식 클래스는 생성자 첫 라인에 super()[생략], this() 반드시 위치.
	B(){
		this(3);
		System.out.println("B 생성자 1 입니다.");
	}
	B(int a){
		// super();
		System.out.println("B 생성자 2 입니다.");
	}
}


public class Super_Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 객체 생성후 출력
		A a = new A();			// A 생성자 2, A 생성자 1
		
		System.out.println();
		
		// 2. 
		A aa2 = new A(3);		// A 생성자 2
		
		System.out.println();
		
		// 3.
		B b = new B();			// A 생성자2, A 생성자1, B 생성자2, B 생성자1	
		
		System.out.println();
		
		// 4.
		B bb = new B(3);		// A 생성자2, A 생성자1, B 생성자2
		
		

	}

}
