package chapter04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		// < 문제 > 2중 for문을 사용해서	1단 ~ 19단 
		// 3의 배수단과
		
		// 1. 1 ~ 19 단까지 출력
		for (int i=0; i<20; i++) {	// 19번 루프
			// 단을 출력
			System.out.println(i+"단 출력");
			for (int j=1; j<20; j++) {	// i 일때 19번 루프
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
		
		System.out.println("==========3의 배수단 출력=============");
		
		// 2. 3의 배수단 출력 
		for (int i=3; i<21; i+=3 ) {
			System.out.println(i+"단 출력입니다.");
			for (int j=1; j<20; j++) {
				System.out.println(i+" * "+j +"="+ i*j);
			}System.out.println("");
		}

	}

}
