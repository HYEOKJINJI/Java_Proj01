package chapter13.ex02;

// 이너 클래스에서 외부 클래스의 필드와 메소드 접근 

// 메소드 오버라이딩 : 1. 반드시 상속 관계가 있어야 한다. 
//				  2. <인스턴스 메소드> 오버라이딩
// 				  3. 인스턴스 필드, 정적 필드, 정적 메소드 는 오버라이딩이 되지 않는다.

class A {		// Outer Class 
	// 필드
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	// 메소드 : 중복 메소드
	void abc () {	// 오버라이딩 되지 않는다.
		System.out.println("A 클래스의 abc() 메소드 입니다.");
	}
	void def() {
		System.out.println("A 클래스의 def() 메소드 입니다.");
	}
	
	// Inner Class
	class B {
		// 이너 클래스의 필드
		int a = 5;
		int b = 6;
		
		// 이너 클래스의 메소드 : 중복 메소드
		void abc() {	// 오버라이딩 되지 않는다.
			System.out.println("B 클래스의 abc() 메소드 입니다.");
		}
		void bcd () {
			// 이너 클래스의 필드 호출
			System.out.println(a);	// this.a	5
			System.out.println(b);	// this.b	6
			
			System.out.println("===========================");
			
			// 이너 클래스에서 아우터 클래스의 필드 호출
			System.out.println(A.this.a);	//	Outer Class A	3
			System.out.println(A.this.b);	//	Outer Class A	4
			
			// 이너 클래스의 메소드 호출 : 중복된 메소드
			abc();			// this.abc()
			
			// 이너 클래스에서 아우터 클래스의 메소드 호출
			A.this.abc();
			
			// 이너클래스와 아우터 클래스에서 중복 되지 않는 필드 호출
			System.out.println("=================");
			System.out.println(c);		// 아우터 클래스의 필드
			System.out.println(d);		// 아우터 클래스의 필드
			System.out.println("======================");
			
			// 외부의 중복 되지 않는 메소드 : 
			def();
			
			
		}
	}
}


public class InnerClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 외부 객체 생성
		A a = new A();
		
		// 2. 내부 객체 생성
		A.B b = a.new B();
		
		b.bcd();
	}

}
