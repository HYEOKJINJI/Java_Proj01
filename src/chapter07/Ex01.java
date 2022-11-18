package chapter07;

class Calc{
	
	
	// 두 정수의 값을 받아서 더해서 값을 던져줌
	int add(int a, int b) {
		System.out.print("add 의 값은 ");
		return a + b;
		
	}
	
	// 배기 (diff)
	int diff (int a, int b) {
		System.out.print("diff 의 값은 ");
		return a-b;
	}
	
	// 곱하기 (mul)
	int mul(int a, int b) {
		System.out.print("mul 의 값은 ");
		return a*b;
	}
	
	// 나누기(div) : double
	double div (int a, double b) {
		System.out.print("div 의 값은 ");
		return a / b;
	}
	
	// 면적(Rec) (가로 :x , 세로 :y)
	double rec (double a, double b) {
		System.out.print("rec 의 값은 ");
		return a * b;
	}
	
	
	
}










public class Ex01 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int a = calc.add(15, 20);
		System.out.println(a);
		
		
		int b = calc.diff(20, 15);
		
		System.out.println(b);
		
		int c = calc.mul(30,40);
		
		System.out.println(c);
		
		double d = calc.div(40, 30);
		
		System.out.println(d);
		
		double e = calc.rec(20.1, 10.9);
		
		System.out.println(e);

	}

}
