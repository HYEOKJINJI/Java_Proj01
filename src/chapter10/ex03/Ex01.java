package chapter10.ex03;

class Fruit{		// Fruit 의 메소드를 오버라이딩해서 출력. Apple, Banana, Orange
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}
class Banana extends Fruit{
	@Override
	void eat () {
		System.out.println("바나나는 달아서 맛이 있습니다.");
	}
}
class Apple extends Fruit{
	@Override
	void eat() {
		System.out.println("사과는 새콤 달콤해서 맛이 있습니다.");
	}
}
class Orange extends Fruit{
	@Override
	void eat () {
		System.out.println("오렌지는 상큼해서 맛이 있습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Fruit banana = new Banana();
		banana.eat();
		
		Fruit apple = new Apple ();
		apple.eat();
		
		Fruit orange = new Orange();
		orange.eat();
		
		Fruit[] arr1 = new Fruit[3];
		arr1[0] = banana;
		arr1[1] = apple;
		arr1[2] = orange;
		
		Fruit a1 = arr1[0];
		Fruit a2 = arr1[1];
		Fruit a3 = arr1[2];
		
		a1.eat();
		a2.eat();
		a3.eat();
		
		

	}

}
