package chapter13.ex05.a;
// 1. 인터페이스를 구현한 클래스를 생성 후 출력. <== 빈번하게 사용 되는 경우

interface A{
	void cry();
	void fly();
}
class B{
	
	A a = new C();
	void abc() {
		a.cry();
		a.fly();
	}
	
	// 이너 클래스 : 외부 파일에 별도로 생성하지 않고 클래스 내부에 생성 후 바로 사용.
	class C implements A{
		@Override
		public void cry() {
			System.out.println("독수리는 웁니다.");
		}
		@Override
		public void fly() {
				System.out.println("독수리는 날라 다닙니다.");
		}
		
	}
}
// B 클래스의 abc() 메소드 호출시 C 클래스의 구현된 메소드 출력



public class Anonymous_Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.abc();
		

	}

}
