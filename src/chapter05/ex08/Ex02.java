package chapter05.ex08;

public class Ex02 {

	public static void main(String[] args) {
		// main method 의 배열 변수 args 로 실수 값 넣어서 계산 하기
		// args		: 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		// 	for 문을 사용해서 처리
		//		합계 : <실수를 더한 합계>
		
		// double d = Double.parseDouble(args[1]);		// 문자열로 된 실수를 실수형으로 변환
		
		double sum = 0.0;
		for (int i = 1; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
			
			
		}
		
		System.out.println(sum);
		System.out.printf(args[0] + " : %4.3f", sum);
		
		

	}

}
