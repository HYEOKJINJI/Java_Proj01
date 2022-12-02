package chapter16.ex07;

// 제너릭 클래스로 들어오는 타입을 제한을 할 수 있다. extends 키를 사용해서 제한
	// extends 키를 사용해서 제너릭 타입에 들어오는 타입을 제한을 할 수 있다.

class A {}
class B extends A {}
class C extends B {}

class D <T extends B>{	// T 타입으로 들어오는 타입을 제한 할 수 있다. T : B, C 타입만 올 수 있다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

public class BoundedTypeOfGenericCalss {

	public static void main(String[] args) {
		
//		D <A> d1 = new D(); 	// 오류 발생 : A 타입은 T 에 들어 갈 수 없다.
		D <B> d2 = new D();		// B 타입은 T 에 들어감.
		D <C> d3 = new D();		// C 타입은 T 에 들어감.
		
		D d4 = new D();			// == D <B> d4 = new D(); 
								// 타입을 생략해서 호출하면 제한된 타입이 기본으로 들어감.
		
		// setter 를 사용해서 타입에 값 입력.
		d2.setT(new B());		// d2 는 B 타입으로 정의해서 객체를 생성, setter 주입시 B 타입의 객체를 주입
		d3.setT(new C());		// d3 는 C 타입으로 정의해서 객체를 생성, setter 주입시 C 타입의 객체를 주입
		
		// 
//		d3.setT(new B()); 		// 오류발생 : d3 는 C 타입으로 정의 되어 있다. 
				// B 를 객체화하면 A, B 를 내포하고 있고 C 객체가 내포 되어 있지 않다.
		d3.setT(new C()); 		// 
		d2.setT(new C());		// C 객체가 B타입으로 업케스팅
		
		

	}

}
