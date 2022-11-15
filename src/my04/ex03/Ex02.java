package my04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		// < 문제 > 2중 for문을 사용해서	1단 ~ 19단 
		// 3의 배수단과
		
		// 1. 1 ~ 19 단까지 출력
		for (int i=1; i<20; i++) {
			System.out.println("\n"+i+"단 입니다");
			for (int k=1; k<20; k++) {
				System.out.printf("%d * %d = %d\t",i,k,i*k);
			}System.out.println();
		}
		
		
		System.out.println("============================");
		// 2. 3의 배수단 출력 
		
		for (int i=3; i<20; i+=3) {
			System.out.println("\n"+i+"단 입니다");
			for (int k=1; k<20; k++) {
				System.out.printf("%d * %d = %d\t",i,k,i*k);
			}
			System.out.println();
		}
	}

}
