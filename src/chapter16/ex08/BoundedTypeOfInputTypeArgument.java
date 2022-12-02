package chapter16.ex08;

// 메소드에 인풋으로 들어오는 타입을 제한
class Aa {}
class Bb extends Aa{}
class Cc extends Bb{}
class Dd extends Cc {}

// 제너릭 클래스
class Goods<T>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class Test {
	void method1 (Goods<Aa> g) {}			// case 1	: A 타입만 가능
	void method2 (Goods<?> g) {}			// case 2	: ? : 모든 클래스 올 수 있다. A, B, C, D
	void method3 (Goods<? extends Bb> g) {} // case 3	: B, C, D 만 올 수 있다
	void method4 (Goods<? super Bb> g) {} 	// case 4	: A, B 만 ㄴ올 수 있다.
	
}



public class BoundedTypeOfInputTypeArgument {

	public static void main(String[] args) {
		// 메소드로 인풋 되는 제너릭 타입의 제한
		Test t = new Test();
		
		// 1. case 1
		t.method1(new Goods<Aa>());	// Goods<Aa> 객체만 올 수 있다. 	
//		t.method1(new Goods<Bb>());
//		t.method1(new Goods<Cc>());
//		t.method1(new Goods<Dd>());
		
		// 2. case 2
		t.method2(new Goods<Aa>());
		t.method2(new Goods<Bb>());
		t.method2(new Goods<Cc>());
		t.method2(new Goods<Dd>());
		
		// 3. case 3
//		t.method3(new Goods<Aa>());
		t.method3(new Goods<Bb>());
		t.method3(new Goods<Cc>());
		t.method3(new Goods<Dd>());
		
		// 4. case 4
		t.method4(new Goods<Aa>());
		t.method4(new Goods<Bb>());
//		t.method4(new Goods<Cc>());
//		t.method4(new Goods<Dd>());

	}

}
