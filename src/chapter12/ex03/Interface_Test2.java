package chapter12.ex03;

interface Animal1 {
	void cry();
}
interface Animal2 {
	void run();
}
interface Animal3 {
	void eat();
}

// interface extends interface
// 앞의 타입과 뒤의 타입이 동일하면 extends
interface K extends Animal1, Animal2, Animal3{
	// cry(), run(), eat()
}

class G implements K {
	@Override
	public void cry() {}
	@Override
	public void eat() {}
	@Override
	public void run() {}
}

class Aa {		// 일반 클래스 : 모든 메소드는 실행부가 존재
	void abc() {System.out.println("Aa 의 abc() 메소드");}
}

abstract class Bb {		// 추상 클래스 : 추상 메소드가 1개라도 존재하면 추상 클래스. 메소드는 실행부가 존재하지 않고 선언만 한다.
	abstract void bcd();
}

// extends 키 다음에는 1개의 클래스만 올 수 있다. 클래스는 하나의 부모만 가진다.
	// 일반클래스, 추상클래스 
// implements 키 다음에는 여러개의 인터페이스가 올 수 있다. 인터페이스는 다중 상속이 가능.
// extends 가 먼저 위치 하고 implements 가 뒤에 위치 : 순서가 바뀌면 안됨.
class Cc extends Bb implements Animal1, Animal2, Animal3{
	@Override
	void bcd() {System.out.println();}
	@Override
	public void cry() {}
	@Override
	public void eat() {}
	@Override
	public void run() {}
}


public class Interface_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
