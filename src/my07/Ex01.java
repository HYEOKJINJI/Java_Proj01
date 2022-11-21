package my07;

import my07.Student;

class Calc{
	
	// 두 정수의 값을 받아서 더해서 값을 던져줌
	int add(int a,int b) {
		System.out.print("add 의 값은 : ");
		return a+b;
	}
	
	// 배기 (diff)
	int diff (int a, int b) {
		System.out.print("diff 의 값은 : ");
		return a-b;
	}
	// 곱하기 (mul)
	int mul (int a, int b) {
		System.out.print("mul 의 값은 : ");
		return a*b;
	}
	
	// 나누기(div) : double
	double div (int a, double b) {
		System.out.print("div 의 값은 : ");
		return a/b;
	}
	
	
	// 면적(Rec) (가로 :x , 세로 :y)
	int rec (int a, int b) {
		System.out.print("rec 의 값은 : ");
		return a *b ;
	}
	
	
}











public class Ex01 {

		public static void main(String[] args) {
			Student student1 = new Student ();
			student1.print();
			
			System.out.println("=================");
			
			Student student2 = new Student ("지혁진", 12, "경기도 파주시");
			student2.print();
			
			System.out.println("=================");
			
			Student student3 = new Student ("지혁진", 12, "경기도 파주시","010-2273-0133", 65);
			student3.print();
			System.out.println("===========================");
			
			Calc calc = new Calc();
			
			
			int a =calc.add(6, 2);
			System.out.println(a);
			System.out.println();
			
			int b = calc.diff(6, 2);
			System.out.println(b);
			System.out.println();
			
			int c = calc.mul(6, 2);
			System.out.println(c);
			System.out.println();
			
			double d = calc.div(6, 2.0);
			System.out.println(d);
			System.out.println();
			
			int e = calc.rec(6, 2);
			System.out.println(e);
			System.out.println();

		}

	}
