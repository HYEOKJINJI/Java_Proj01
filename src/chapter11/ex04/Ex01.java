package chapter11.ex04;

abstract class Car {		// 트럭, 자가용, 굴삭기 
	abstract void run ();
	abstract void eat ();
}

class xmfjr extends Car {
	@Override
	void run() {
		System.out.println("트럭은 위험하게 달립니다");
	}
	@Override
	void eat() {
		System.out.println("트럭은 경유를 먹습니다");
	}
}
class wkrkdyd extends Car{
	@Override
	void run() {
		System.out.println("자가용은 쌩쌩 달립니다");
	}
	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 먹습니다");
	}
}
class rnftkrrl extends Car{
	@Override
	void run() {
		System.out.println("굴삭기는 뒤뚱 뒤뚱 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("굴삭기는 가스를 먹습니다.");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// 
		Car c1 = new xmfjr ();
		c1.run();
		c1.eat();
		System.out.println();
		
		Car c2 = new wkrkdyd();
		c2.run();
		c2.eat();
		System.out.println();
		
		Car c3 = new rnftkrrl();
		c3.run();
		c3.eat();

	}

}
