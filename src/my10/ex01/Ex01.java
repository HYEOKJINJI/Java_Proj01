package my10.ex01;


class Animal{		// Animal 클래스를 상속해서 Tiger, Eagle, Lion 를 생성 
	// 자식 클래스에서는 필드1, 메소드1 정의
// LionChild 클래스는 Lion 클래스를 상속 해서 필드1, 메소드1
	String name;
	int age;
	String color;

	void eat () {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal{
	String howlling;
	void sound() {
		System.out.println("호랑이는 어흥 웁니다.");
	}
}
class Eagle extends Animal{
	String howlling;
	void sound() {
		System.out.println("독수리는 끼요옷 웁니다");
	}
}
class Lion extends Animal{
	String howlling;
	void sound() {
		System.out.println("사자는 어흥어흥 웁니다.");
	}
}
class LionChild extends Lion{
	String howlling;
	void sound () {
		System.out.println("애기 사자는 엏엏 웁니다.");
	}
}

public class Ex01 {

public static void main(String[] args) {
	
	System.out.println("Tiger =====================");
	Tiger t1 = new Tiger ();
	// 부모 클래스 필드와 메소드
	t1.name = "호랑이";
	t1.age = 10;
	t1.color = "줄무늬 색";
	System.out.println(t1.name);
	System.out.println(t1.age);
	System.out.println(t1.color);
	// Tiger 필드와 메소드
	t1.howlling = "어흥";
	t1.sound();
	System.out.println("Eagle ====================");
	Eagle e1 = new Eagle ();
	// 부모 클래스 필드와 메소드
	e1.name = "독수리";
	e1.age = 5;
	e1.color = "검정색";
	System.out.println(e1.name);
	System.out.println(e1.age);
	System.out.println(e1.color);
	// Eagle 필드와 메소드
	e1.howlling = "끼요옷";
	System.out.println(e1.howlling);
	e1.sound();
	System.out.println("Lion ==============");
	Lion l1 = new Lion();
	// 부모 클래스의 필드와 메소드
	l1.name = "사자";
	l1.age = 8;
	l1.color = "갈색";
	System.out.println(l1.name);
	System.out.println(l1.age);
	System.out.println(l1.color);
	// Lion 필드와 메소드
	l1.howlling = "어흥어흥";
	l1.sound();
	System.out.println("LionChild ==============");
	LionChild l2 = new LionChild();
	// Animal 클래스의 필드와 메소드
	l2.name = "애기사자";
	l2.age = 2;
	l2.color = "연한 갈색";
	System.out.println(l2.name);
	System.out.println(l2.age);
	System.out.println(l2.color);
	// Lion 클래스의 필드와 메소드
	
	// LionChild 클래스의 필드와 메소드



	}
}
