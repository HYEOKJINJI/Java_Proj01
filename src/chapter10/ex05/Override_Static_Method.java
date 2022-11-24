package chapter10.ex05;

class Aaa {
	static void print () {
		System.out.println("Aaa 클래스의 static 메소드 입니다.");
	}
}
class Bbb extends Aaa{
	static void print () {
		System.out.println("Bbb 클래스의 static 메소드 입니다.");
	}
}

public class Override_Static_Method {

	public static void main(String[] args) {
		// static method : 오버라이딩이 안됨
			// 클래스 영역에 메소드가 저장, 객체의 Heap 영역은 클래스의 주소(위치값) 가진다. 
		
		// 1. 객체 생성 없이 클래스 이름으로 접근.
		Aaa.print();
		Bbb.print();
		System.out.println("==================");
		
		// 2. 객체 생성후 출력
		Aaa a = new Aaa();		// Aaa
		Bbb b = new Bbb();		// Bbb
		Aaa ab = new Bbb();		// Aaa		오버라이딩이 안됨.
		a.print();
		b.print();
		ab.print();
		
	}

}
