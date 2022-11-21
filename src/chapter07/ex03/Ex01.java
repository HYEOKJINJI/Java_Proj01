package chapter07.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
		   	values[0] : 값이 정수 1이 들어올때 "파워레벨 1 ~ 9 입니다."
		   	values[1] : 값이 정수 1 ~ 9 이 들어올때 "스피드 레벨 1 ~ 9 입니다."
		 */
		arrayFlexible (2,9);
		
		
	}

	public static void arrayFlexible(int...values) {
		for (int i = 0 ; i < values.length;i++) {
			if(i == 0) {
				System.out.println("파워레벨 " + values[i] + " 입니다.");
			}
			if (i == 1) {
					System.out.println("스피드레벨 " + values[i] + " 입니다.");

			}
		}
	}
	
	
	
}
