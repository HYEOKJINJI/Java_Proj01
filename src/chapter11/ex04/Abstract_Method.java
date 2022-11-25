package chapter11.ex04;

abstract class Animal {		// 추상 클래스, 추상 메소드가 1개 라도 있으면 추상 클래스
	abstract void eat();
	abstract void run();
	abstract void cry();
}

class Cat extends Animal {	// 콘크리트 클래스 : 추상 메소드를 모두 구현한 클래스
	@Override
	void cry() {
		System.out.println("고양이는 야옹 하고 웁니다.");
	}
	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다.");
	}
	@Override
	void run() {
		System.out.println("고양이가 달립니다.");
	}
}

abstract class Dog extends Animal {	// 추상 클래스의 추상 메소드를 일부만 구현 한 경우 : 추상 클래스
	@Override
	void cry() {
		System.out.println("강아지는 멍멍 웁니다.");
	}
	@Override
	void eat() {
		System.out.println("강아지는 뼈다구를 먹는다.");
	}
}

class DogChild extends Dog {	// 콘크리트 클래스
	@Override
	void run() {
		System.out.println("아기 강아지는 깡충 달립니다.");
	}
}



public class Abstract_Method {

	public static void main(String[] args) {
		// 추상 클래슨느 객체를 생성하지 못 한다. 타입으로 지정은 가능 하다.
		// Animal, Dog 는 추상 클래스 이므로 객체 생성이 안됨. 타입으로 지정은 가능.
		
		// 1. Animal 객체 생성
//		Animal a1 = new Animal();		오류 발생 : 추상 클래스는 객체화 하지 못한다.
		
		// Cat 클래스를 객체화 해서 Animal 타입으로 호출
		// Animal 의 메소드 호출시 오버라이딩이 되어 Cat 의 메소드 호출
		Animal a2 = new Cat();
		a2.eat();
		a2.run();
		a2.cry();
		
		System.out.println("===========================");
		
		// 2. Cat 객체화 해서 Cat 타입으로 지정
		Cat c2 = new Cat();
		c2.eat();
		c2.run();
		c2.cry();
		
		System.out.println("===========================");
		
		// 3. Dog 객체 생성
//		Dog d1 = new Dog ();		오류 발생 : 추상 클래스는 객체화 하지 못한다.
		
		// 4. DogChild 객체 생성해서 Animal 타입으로
		Animal dc1 = new DogChild ();
		dc1.cry();		// Dog 메소드 
		dc1.eat();		// Dog 메소드  
		dc1.run();		// Dog Child 메소드
		
		System.out.println("=====================================");
		
		// 5. DogChild 객체화해서 Dog 타입으로 지정
		Dog dc2 = new DogChild ();
		dc2.cry();
		dc2.eat();
		dc2.run();
		
		System.out.println("========================================");
		
		// 6. DogChild 객체화 해서 DogChild 타입으로 지정 
		DogChild dc3 = new DogChild ();
		dc3.cry();
		dc3.eat();
		dc3.run();
		
		
		
	}

}
