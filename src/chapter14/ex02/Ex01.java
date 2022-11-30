package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		//	try ~ catch ~ finally 구문을 사용해서 예외 처리
		
		int [] arr = new int [] {1,2,3,4};
		
		// 실행 시 예외 발생 : ArrayIndexOutOfBoundsException
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e){ 
			System.out.println("오류가 발생 되었습니다.");
		}finally {
			System.out.println("반드시 실행되는 블락");
		}
		System.out.println("프로그램 종료");

	}

}
