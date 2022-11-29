package my13.ex08;

interface Animal{
	void cry();
	void fly();
}

// 인터페이스를 사용해서 4가지 형태로 출력
// 1. Animal 을 구현한 Inner Class 생숭 후 메소드 출력
class A {
	B b = new B();
	void abc() {
		b.cry();
		b.fly();
	}
	class B implements Animal{
		@Override
		public void cry() {
			System.out.println("독수리는 웁니다.");
		}
		@Override
		public void fly() {
			System.out.println("독수리는 날아요");
		}
		
	}
}
// 2. Animal 을 익명 클래스로 생성해서 출력
class B {
	void abc() {
		Animal animal = new Animal() {
			@Override
			public void cry() {
				System.out.println("독수리 울어");
			}
			@Override
			public void fly() {
				System.out.println("독수리 날아");
			}
		};
		animal.cry();
		animal.fly();
	}
}

// 3. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성
class C {
	void abc(Animal animal) {
		animal.cry();
		animal.cry();
	}
}


// 4. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성(x)

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Animal 을 구현한 Inner Class 생숭 후 메소드 출력
		System.out.println("1.==============");
		A a1 = new A ();
		a1.abc();
		
		// 2. Animal 을 익명 클래스로 생성해서 출력
		System.out.println("2. ===================");
		B b1 = new B();
		b1.abc();
		
		// 3. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성
		System.out.println("3. ======================");
		C c = new C ();
		Animal animal = new Animal() {
			@Override
			public void cry() {
				System.out.println("독수리 울다");
			}
			@Override
			public void fly() {
				 System.out.println("독수리 날다");
			}
		};
		c.abc(animal);
		
		// 4. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수 생성(x)
		System.out.println("4. ==================");
		c.abc(new Animal() {
			@Override
			public void cry() {
				System.out.println("독수리 울다");
			}
			@Override
			public void fly() {
				 System.out.println("독수리 날다");
			}
		});
		
		
		
		
		
		
		
	}
	

}
