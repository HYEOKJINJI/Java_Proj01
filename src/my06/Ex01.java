package my06;

class Man{
	// 필드
	
	// 1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력
	void add1 () {
		int sum = 0;
		System.out.println("1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력 합니다");
		for (int i=01; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println();
		System.out.println("합계는 : "+sum);
		System.out.println();
	}
	// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값을 출력
	void add2 () {
		int sum = 0;
		System.out.println("1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값을 출력 합니다");
		for (int i=1; i < 501; i++) {
			if (i%3==0 || i % 4==0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println();
		System.out.println("합계는 : " + sum);
		System.out.println();
	}

	// 1 ~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력
	void add3 () {
		int sum = 0;
		for (int i = 1; i < 1001; i ++) {
			if (i % 4 !=0) {
				System.out.print(i + " ");
				sum = sum + i;
			}

		}
		System.out.println();
		System.out.println("합계는 : " + sum);
	}
	
	
	
	
	
	
}
public class Ex01 {

	public static void main(String[] args) {
		Man man = new Man();
		man.add1();
		man.add2();
		man.add3();

		
		
	}

}
