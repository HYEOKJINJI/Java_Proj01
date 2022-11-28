package my12.ex01;

abstract class Calc2 {
	abstract void add (int a, int b);
	abstract void diff (int a, int b);
	abstract void mul (int a, int b);
	abstract void div (int a, int b);
}

class Calc_Impl2 extends Calc2 {
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}
	@Override
	void diff(int a, int b) {
		System.out.println(a-b);
	}
	@Override
	void mul(int a, int b) {
		System.out.println(a*b);
	}
	@Override
	void div(int a, int b) {
		System.out.println((double)a/(double)b);
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 4;
		
		
		Calc2 c = new Calc_Impl2();
		c.add(a, b);
		c.diff(a, b);
		c.mul(a, b);
		c.div(a, b);
		
		Calc2 c1 = new Calc2 () {
			@Override
			void add(int a, int b) {
				System.out.println(a+b);
			}
			@Override
			void diff(int a, int b) {
				System.out.println(a-b);
			}
			@Override
			void mul(int a, int b) {
				System.out.println(a*b);
			}
			@Override
			void div(int a, int b) {
				System.out.println((double)a/(double)b);
			}
		};
		c1.add(a, b);
		c1.diff(a, b);
		c1.mul(a, b);
		c1.div(a, b);
		
		
		


	}

}
