package chapter02.ex02;

public class NamingVariable {

	public static void main(String[] args) {
		// 시험 문제에 나올수도있..
		// 변수에는 값을 대입해서 변화되는 값을 할당 할 수 있다.
		// 변수 이름 지정하기
		// 	- 변수명은 소문자로 시작( 권고 ), 클래스명은 대문자로 시작( 필수 )
		//  - 변수명으로 한글을 사용할 수 있다. ( 권장하지 않는다 )
		//	- 변수명으로 특수문자는 _,$ 만 사용 가능
		//	- 변수명으로 숫자는 사용가능하나 변수명 첫자리에 숫자가 오면 오류
		//	- 변수명으로 자바에서 사용하는 예약어( package, class, public .... ) 
		
		// 자료형  변수명
		boolean aBcD;	// boolean : true, false 에 넣을 수 있다.
		aBcD = true;
		aBcD = false;
		// aBcD = 10;	오류 발생
		byte 가나다라;	// 1byte 의 데이터만 저장 
		short _abcd;	// _, $ 를 사용할 수 있다.
		boolean $_abcd;
		// boolean %abcde; // _, % 이외의 특수문자는 변수명으로 사용할 수 없다.
		//char 3abcd; 	// 변수명에
		char a3bcd;		
		long abcd3;
		//double private;		// 자바에서 사용되는 예약어는 변수명으로 사용할 수 없다. 
		
		//int my work;	// 변수명으로는 공백이 올 수 없다.
		int myWork;		// 변수명은 처음자는 소문자, 이어서 여러단어를 적용할 때 첫자 대문자
		String myClassName;	// 권장사항
		
		// 상수 : 값을 넣으면 그 값을 변화하지 못하도록 설정 
			// - 변수자료형 앞에 final 키가 붙으면 상수
			// - 상수 명은 전체를 대문자로 지정( 권장 )
		
		double PI = 3.141592;		// 변수 : PI 변수에 값을 변화 시켜줄 수 있다.
		System.out.println(PI);	// 3.141592
		PI = 123.456;
		System.out.println(PI);	// 123.456
		
		final double PI2 = 3.141592;	// 상수 : 값을 넣으면 수정 할 수 없다.
		System.out.println(PI2);
		// PI2 = 123.456;		// 상수 이므로 다른 ㄱ밧을 넣을 수 없다.
		final int MY_DATA = 10;
		final float my_Data;	// 권고 사항 위배
		

	}

}
