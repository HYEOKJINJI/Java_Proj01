package chapter13.ex08;

interface Animal{
	void cry();
	void fly();
}

// 인터페이스를 사용해서 4가지 형태로 출력
// 1. Animal 을 구현한 Inner Class 생숭 후 메소드 출력
class A{
	Animal a = new B();
	
	void abc () {
		a.cry();
		a.fly();
	}
	
	
	class B implements Animal{
		@Override
		public void cry() {
			System.out.println("독수리는 끼요옷 웁니다.");
		}
		@Override
		public void fly() {
			System.out.println("독수리는 날라 다닙니다.");
		}
	}
}

// 2. Animal 을 익명 클래스로 생성해서 출력
class B {
	void abc () {
		Animal a = new Animal() {
			@Override
			public void cry() {
				System.out.println("독수리는 끼요옷 웁니다.");
			}
			@Override
			public void fly() {
				System.out.println("독수리는 날라 다닙니다.");
			}
		};
		a.cry();
		a.fly();
	}
}

// 3. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성
class C {
	void abc (Animal a1) {
		a1.cry();
		a1.fly();
	}
}
// 4. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성(x)

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Animal 을 구현한 Inner Class 생숭 후 메소드 출력
		System.out.println("1====================");
		A a = new A ();
		a.abc();
		
		// 2. Animal 을 익명 클래스로 생성해서 출력
		System.out.println("2=================");
		B b = new B ();
		b.abc();

		// 3. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성
		System.out.println("3======================");
		C c = new C ();
		Animal a1 = new Animal () {
			@Override
			public void cry() {
				System.out.println("독수리는 끼요옷 웁니다.");
			}
			@Override
			public void fly() {
				System.out.println("독수리는 날라 다닙니다.");
			}
		};
		c.abc(a1);
		
		
		// 4. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성(x)
		System.out.println("4========================");
		c.abc(new Animal () {
			@Override
			public void cry() {
				System.out.println("독수리는 끼요옷 웁니다.");
			}
			@Override
			public void fly() {
				System.out.println("독수리는 날라 다닙니다.");
			}
		});
		
	}
	

}
