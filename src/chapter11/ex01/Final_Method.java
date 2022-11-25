package chapter11.ex01;

class Aa{
	
	// 생략된 생성자
	Aa (){
		
	}
	
	void print () {
		System.out.println("Aa 클래스의 print() 메소드 입니다.");
	}
	
	// 자식 클래스에서 재정의 불가 (오버라이딩 불가) : 아주 중요한 메소드
	final void run () {
		System.out.println("Aa 클래스의 run() 메소드 입니다.");
	}
}
class Bb extends Aa{
	@Override
	void print () {
		System.out.println("Bb 클래스의 print() 메소드 입니다.");
	}
	
	// 생략된 생성자 출력
	Bb () {
		super();
	}
	
//	@Override
//	void run () {}		오류 발생 부모 클래스인 Aa 클래스 run 메소드가 final 이 붙어있으므로 오버라이딩이 불가.
}


public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aa a1 = new Bb();
		a1.print();
		

	}

}
