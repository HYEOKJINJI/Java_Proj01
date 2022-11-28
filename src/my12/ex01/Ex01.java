package my12.ex01;

abstract class Calc {		// 사칙 연산을 계산 하는 계산기 클래스
	abstract int add(int a, int b);	// + 더하기
	abstract int diff(int a, int b);	// - 빼기
	abstract int mul(int a, int b);	// * 곱하기
	abstract double div(int a, int b); // / 나누기
}

class Calc_Impl extends Calc {		// Calc 를 구현한 클래스
	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	@Override
	int diff(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	@Override
	double div(int a, int b) {
		// TODO Auto-generated method stub
		return (double) a/ (double) b;
	}
	@Override
	int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}



public class Ex01 {

	public static void main(String[] args) {

		int a = 5;
		int b = 4;
		
		// 1. 구현한 클래스의 메소드 호출후 출력
		Calc c = new Calc_Impl();
		System.out.println(c.add(a, b));
		System.out.println(c.diff(a, b));
		System.out.println(c.div(a, b));
		System.out.println(c.mul(a, b));
		
		// 2. 익명 클래스로 메소드 호출후 출력
		Calc c1 = new Calc() {
			@Override
			int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			@Override
			int diff(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
			@Override
			double div(int a, int b) {
				// TODO Auto-generated method stub
				return (double)a/(double)b;
			}
			@Override
			int mul(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		System.out.println(c1.add(a, b));
		System.out.println(c1.diff(a, b));
		System.out.println(c1.div(a, b));
		System.out.println(c1.mul(a, b));
		
		
	}

}
