package chapter12.ex06;

interface A {
	
	// 기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스 기능이 추가됨
	// 2022 년에 새로운 기능 추가.
	// default 메소드 : 인터페이스 내에서 구현부가 있는 메소드, 
		// 모든 자식 클래스에서 상속 되어 내려감. 새로운 기능을 추가할때 자식 클래스에서 오류 없이 기능 추가.
	default void cde() {		// public 생략 되어있다.
		System.out.println("블루투스 기능 추가됨");
	}
	
	// 추상 메소드 : public abstract 가 생략 되어 있다. <=== 실행부가 없는 메소드 {}
		// 자식 클래스에서는 선언만 된 메소드를 구현해야 될 의무
	void abc();		// 2000 년에 구현된 메소드
	void bcd();		// 2005 년에 구현된 메소드
//	void cde();		// 2010 년에 구현된 메소드
}
class B implements A{	// extends Object 가 생략 되어 있따.
	@Override
	public void abc() {
		System.out.println("와이파이 기능 1");
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 2");
	}
	public void def() {		// 자식 클래스에서 인터페이스의 메소드 호출 : A.super.메소드명
		// 인터페이스의 메소드를 호출시 : 
		A.super.cde();		// interface A 의 cde() 메소드 호출
//		super.cde();		// Object 클래스의 cde() 메소드 호출 : 오류발생
	}
}

public class Interface_Super_Use {

	public static void main(String[] args) {
		// 자식 클래스에서 인터페이스에 구현된 default 메소드 호출사 : 
		
		// 1. 객체 생성
		A a1 = new B();
		a1.abc();	// interface A 에 존재함	B() 에서 오버라이딩됨
		a1.bcd();	// interface A 에 존재함	B() 에서 오버라이딩됨
		a1.cde();	// interface A 에 존재함	default 메소드
		
		// a1 을 B 타입으로 다운캐스팅 해야 def() 메소드를 호출 할 수 있다.
		System.out.println("==========================");
		B b1 = (B) a1;
		b1.def();

	}

}
