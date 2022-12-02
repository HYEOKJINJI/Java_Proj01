package chapter16.ex08;
// 제너릭 메소드의 타입제한

class A {
	// Number : Boolean, Charter 를 제외한 정수, 실수를 처리하는 클래스
		// Byte, Short, Integer, Long, Float, Double
	
	public <T extends Number> void method1 (T t) {
		// Object 클래스의 메소드외의 Number 의 메소드를 사용 가능.
		System.out.println(t.intValue());	// intValue() : Number 의 메소드
	}
}

// 인터페이스 
interface MyInterface {
	void print();	// public abstract 생략 되어있
}

class B {
	
	// T : MyInterface 하위의 구현 클래스가 올 수 있다. , 주의 : 타입을 제한 할 때 extends 를 사용.
	public <T extends MyInterface> void method1 (T t) {
		t.print();
	}
}



public class BoundedtypeOfGenericMethod {

	public static void main(String[] args) {
		//
		
		A a = new A ();
		a.<Double>method1(11.11);
		a.method1(5.8);		// Double
		a.<Integer>method1(100);
		a.method1(200);
		
//		a.<String>method1("지혁진");    오류 발생 Number 가 제한을 하고 있기 때문. 
		
		B b = new B();
		b.method1(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("print() 메소드 입니다.");
			}
		});
		
		b.<MyInterface>method1(new MyInterface() {	// <MyInterface> 생략이 가능
			
			@Override
			public void print() {
				System.out.println("print() 메소드 입니다.");
			}
		});
		
		
	
	}

}
