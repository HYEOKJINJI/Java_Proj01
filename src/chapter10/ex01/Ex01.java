package chapter10.ex01;

class Animal{		// Animal 클래스를 상속해서 Tiger, Eagle, Lion 를 생성 
						// 자식 클래스에서는 필드1, 메소드1 정의
					// LionChild 클래스는 Lion 클래스를 상속 해서 필드1, 메소드1
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal{
	String howlling;
	void tiger () {
		System.out.println("호랑이는 어흥");
	}
}
class Eagle extends Animal{
	String howlling;
	void eagle() {
		System.out.println("독수리는 짹짹");
	}
}
class Lion extends Animal{
	String howlling;
	void lion () {
		System.out.println("사자는 어흐흥");
	}
}
class LionChild extends Lion {
	String howlling2;
	void lionchild () {
		System.out.println("아기 사자는 엏");
	}
}
 

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Tiger =====================");
		Tiger t1 = new Tiger();
		// 부모 클래스 필드와 메소드
		t1.name = "호랑이";
		t1.age = 5;
		t1.color = "줄무늬 색";
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.color);
		t1.eat();
		t1.sleep();
		System.out.println();
		// Tiger 필드와 메소드
		t1.howlling = "어흥";
		System.out.println(t1.howlling);
		t1.tiger();
		System.out.println();
		
		System.out.println("Eagle ====================");
		Eagle e1 = new Eagle();
		// 부모 클래스 필드와 메소드
		e1.name = "독수리";
		e1.age = 4;
		e1.color = "검정색";
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.color);
		e1.eat();
		e1.sleep();
		System.out.println();
		// Eagle 필드와 메소드
		e1.howlling = "짹짹";
		System.out.println(e1.howlling);
		e1.eagle();
		System.out.println();
		
		System.out.println("Lion ==============");
		Lion l1 = new Lion();
		// 부모 클래스의 필드와 메소드
		l1.name = "사자";
		l1.age = 9;
		l1.color = "갈색";
		System.out.println(l1.name);
		System.out.println(l1.age);
		System.out.println(l1.color);
		l1.eat();
		l1.sleep();
		System.out.println();
		// Lion 필드와 메소드
		l1.howlling = "어흥흥";
		System.out.println(l1.howlling);
		l1.lion();
		System.out.println();
		
		System.out.println("LionChild ==============");
		LionChild lc1 = new LionChild();
		// Animal 클래스의 필드와 메소드
		lc1.name = "아기 사자";
		lc1.age = 1;
		lc1.color = "연한 갈색";
		System.out.println(lc1.name);
		System.out.println(lc1.age);
		System.out.println(lc1.color);
		lc1.eat();
		lc1.sleep();
		System.out.println();
		
		// Lion 클래스의 필드와 메소드
		lc1.howlling = "어흐흥";
		lc1.lion();
		System.out.println();
		
		// LionChild 클래스의 필드와 메소드
		lc1.howlling2 = "엏";
		System.out.println(lc1.howlling2);
		lc1.lionchild();
		
	}

}
