package chapter10.ex10;

class Aa{		// equals() 가 정의 되어 잇지 않는 클래스
				// Object 클래스의 equals() 메소드는 Stack 의 참조 주소를 비교하도록 되어 있다.
	// 필드 1
	String name;
	
	// 생성자  
	Aa(String name){
		this.name = name;
	}
}
class Bb {		// Object 의 equals() 를 재정의 해서 Heap 의 값을 비교하도록 설정
	// 필드 1
	String name;
	
	// 생성자
	Bb(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {		// Object 타입으로 업캐스팅해서 들어옴.
		if (this.name == ((Bb)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}


public class Object_Method02 {

	public static void main(String[] args) {
		// Object 클래스의 equals() 메소드 : 기본적으로 == 참조 주소를 비교함.
		     // 객체의 Heap 의 값을 비교하는것이 아니라 Stack 메모리에 참조 주소값 비교
		// String 클래스는 equals() 메소드가 재정의 되어 있어서 Heap 의 값을 비교하도록 설정이 되어 있다.
		
		
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		
		// == : 참조 자료형에서는 stack 메모리의 참조 주소를 비교
		// equals() : == 
				// String 클래스는 equals() 메소드가 재정의 : Heap 의 값을 비교하도록 설정
		System.out.println(s1 == s2);		// Stack 의 참조 주소 비교 false
		System.out.println(s1.equals(s2));	// Heap 의 값을 비교  true
			// String 클래스는 Object 의 equals() 재정의 되어 있다.
		
		System.out.println("=====================================");
		Aa a1 = new Aa("안녕");
		Aa a2 = new Aa("안녕");
		System.out.println(a1 == a2); 			// stack 참조 주소 비교 false
		System.out.println(a1.equals(a2));		// stack 참조 주소 비교	false
		
		System.out.println("======================================");
		
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		System.out.println(b1==b2);				// stack 참조 주소 비교	false
		
		// equals() 메소드를 재정의 해서 Heap 값을 비교 하도록 설정.
		System.out.println(b1.equals(b2));		// Heap 영역의 name 필드의 값 비교 true

	}

}
