package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3 개의 예외를 하나의 try ~ catch 불락에 넣고, 
				// 각 각 에 대해서 catch 블락
				// 3개의 예외를 한꺼번에 처리
		System.out.println("=====1===================");
		try {
			System.out.println(3/0);
			
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
		}catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("2번 방까지만 존재 합니다. 5번방은 없습니다.");
		}catch(NumberFormatException eee) {
			System.out.println("문자를 숫자로 변환하지 못합니다.");
		}finally {
			System.out.println("첫 프로그램 종료");
		}
		
		System.out.println("========2===================");
		try {
			System.out.println(3/0);
			
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20ㅁ");
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("3개의 예외를 한꺼번에 처리했습니다.");
			
			System.out.println(e.getMessage());		// 예외의 간단한 정보룰 출력
			e.printStackTrace();					// 예외의 세부적인 정보를 출력
		}finally {	
			System.out.println("두번째 프로그램 종료");
		}
		System.out.println("=====3.==================");
		try {
			System.out.println(3/0);
		}catch(ArithmeticException e) {
			System.out.println("3. 0으로 나눌 수 없습니다.");
		}
		try {
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3. 배열의 방을 넘겼습니다.");
		}
		try {	
			int num = Integer.parseInt("20A");
		}catch(NumberFormatException e) {
			System.out.println("3. 숫자를 변경 할 수 없습니다.");
		}
		
		
	}

}
