package chapter11.ex01;

class Aaa{
	int m;
	final int n;
	
	Aaa(){
		n = 10;
	}
	
	Aaa(int n){
		this.n = n;
	}
	
	void run() {
		System.out.println("Aaa 클래스의 run() 메소드 입니다.");
	}
}
final class Bbb extends Aaa{		// 상속이 불가한 클래스.
	
}
// class Ccc extends Bbb{}		// 오류 발생 부모 클래스인 Bbb 클래스 앞에 final 이 붙어있어 상속이 불가함.


public class Final_Class {

	public static void main(String[] args) {
		// 

	}

}
