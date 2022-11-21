package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성, 메소드 호출 : Main method 에서 호출
		
		// sum1, sum2 객체 생성 없이 바로 호출 : static 메소드
		
		// sum1
		System.out.println("===static 사용 정수 3개 인풋===");
		System.out.println(sum1(5,9,10));
		System.out.println();
		
		// sum2
		System.out.println("=====static 사용 실수 3개 인풋=======");
		System.out.println(sum2(20, 19.7, 30.9));
		System.out.println();
		
		// sum3 : 인스턴스 메소드 : static 키가 붙어있지 않으므로 객체화 해야 호출이 가능
		System.out.println("static 사용 안하고 출력");
		Ex01 ex01 = new Ex01();
		String ab = ex01.sum3("자동차", 2, 30000000);
		System.out.println(ab);
		
		
		
		

	}
	
	// 정수 값 3개를 인풋 받아 더한값을 리턴하는 메소드(static)
	public static int sum1 (int m, int n, int o) {
		return m+n+o;
	}
	
	// 실수 값 3개를 인풋 받아 더한값을 리턴하는 메소드(static)
	public static double sum2 (int m, double n, double o) {
		return m+n+o;
	}
	
	// 문자열을 연결해서 출력 하는 메소드(인스턴스 메소드 : static 을 사용하지 않는 메소드)
		// "제품이름", "제품수량", "제품가격"
		// 객체를 생성해서 
	public String sum3 (String m, int n, int o) {
		return m+" "+n+" "+o;
	}
	
	
	

}
