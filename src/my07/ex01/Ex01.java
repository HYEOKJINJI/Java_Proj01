package my07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성, 메소드 호출 : Main method 에서 호출
		
		// sum1, sum2 객체 생성 없이 바로 호출 : static 메소드
		
		// sum1
		sum1(1,2,3);
		System.out.println();
		
		// sum2
		sum2(1.0,2.0,3.0);
		System.out.println();
		
		// sum3 : 인스턴스 메소드 : static 키가 붙어있지 않으므로 객체화 해야 호출이 가능
		Ex01 ex01 = new Ex01();
		String a = ex01.sum3("모니터", 2, 600000);
		System.out.println(a);
		
		
		
		

	}
	
	// 정수 값 3개를 인풋 받아 더한값을 리턴하는 메소드(static)
	public static void sum1(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	// 실수 값 3개를 인풋 받아 더한값을 리턴하는 메소드(static)
	public static void sum2 (double a,double b,double c) {
		System.out.println(a+b+c);
	}
	
	// 문자열을 연결해서 출력 하는 메소드(인스턴스 메소드 : static 을 사용하지 않는 메소드)
		// "제품이름", "제품수량", "제품가격"
		// 객체를 생성해서 
	public String sum3 (String a, int b, int c) {
		return a + " " + b + " " + c;
	}
	

}
