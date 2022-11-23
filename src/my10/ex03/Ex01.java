package my10.ex03;

class Fruit{		// Fruit 의 메소드를 오버라이딩해서 출력. Apple, Banana, Orange
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}
class Apple extends Fruit {
	@Override
	void eat () {
		System.out.println("사과는 아삭 아삭 맛이 있습니다.");
	}
}
class Banana extends Fruit {
	@Override
	void eat () {
		System.out.println("바나나는 단맛이 맛이 있습니다.");
	}
}
class Orange extends Fruit{
	@Override
	void eat () {
		System.out.println("오렌지는 상큼하게 맛이 있습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Fruit a1 = new Apple();
		Fruit b1 = new Banana();
		Fruit o1 = new Orange();
		
		a1.eat();
		b1.eat();
		o1.eat();
		
		Fruit [] arr1 = new Fruit[3];
		arr1[0] = a1;
		arr1[1] = b1;
		arr1[2] = o1;
		
		Fruit f1 = arr1[0];
		Fruit f2 = arr1[1];
		Fruit f3 = arr1[2];
		
		f1.eat();
		f2.eat();
		f3.eat();
		
		

	}

}
