package chapter14.ex01;

class C {}					// 부모 클래스
class B extends C {}		// 자식 클래스

public class UnCheckedException {

	public static void main(String[] args) {
		// 실행 예외 : 컴파일 단계에서 체크 하지 않는다. 실행 시 예외가 발생됨.
			// UnCheckdeException, RunTimeException
		
		// 1. ArithmeticException : 정수를 0으로 나누었을 때 발생 하는 Exception
			// 모든 프로그램에서 숫자를 0으로 나누면 오류 발생
//		System.out.println(3/0);
		
		// 2. ClassCastException : 다운 캐스팅 시 타입이 존재하지 않는 경우 발생 
		C a = new C ();		// 부모 클래스를 객체화
//		B b = (B)a;			// a 객체는 B 타입을 포함 하지 않는다.실행 시 문제 발생
		
		// 3. ArrayIndexOutOfBoundException : 배열의 방 번호를 넘겼을 때 발생하는 예외
		int[] arr = new int [] {1,2,3};
//		System.out.println(arr[3]);		// 배열의 방 번호를 넘김.
		
		// 4. NumberFormatException : 문자 타입의 값을 정수(int), 실수(double) 변환 예외
//		int num = Integer.parseInt("10!");
//		double num2 = Double.parseDouble("10.22!");
//		System.out.println(num2);
		
		// 제일 많이 발생 되는 예외
		// 5. NullPointException : 참조 주소의 값이 null 인데, 메소드를 호출하는 경우
		String str = null;
//		System.out.println(str.charAt(2));		// 문자열이 저장된 경우, 2번방의 문자열을 출력
		
		

	}

}
