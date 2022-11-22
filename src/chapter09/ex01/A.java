package chapter09.ex01;

public class A {
	
	// 필드 이름 앞에 접근 제어자
	public int a = 1;			// 외부 패키지에서 접근이 가능
	protected int b = 2;		// 외부 패키지에서 접근이 가능하지만 단 상속 관계 일때만 가능 
	int c = 3;					// 같은 패키지에서 접근이 가능(default) 
	private int d = 4;			// 같은 파일 내에서만 접근이 가능
	
	public A () {}
	
	public void abc() {					// public : 다른 패키지에서 접근가능, 하위 다 가능
		System.out.println("public");
	}
	protected void bcd() {				// protected : 다른 패키지에서 접근 가능하지만 단 상속관계 일때만가능, 하위 다가능
		System.out.println("protected");
	}
	void cde() {						// default : 다른 패키지에서 접근 X, 같은 패키지 내에서만 가능
		System.out.println("default");
	}
	private void def() {				// private : 같은 파일 내에서만 접근 가능 
		System.out.println("private");
	}
	
	
}