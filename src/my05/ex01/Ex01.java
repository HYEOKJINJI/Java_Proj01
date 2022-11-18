package my05.ex01;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// args : 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		//step 1
		System.out.println("====STEP 1 : args 배열로 들어오는 모든 내용 출력====");
		for (int i=0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// step 2
		System.out.println("=======STEP 2 : 기본 출력=======================");
		System.out.println();
		
		System.out.println("        국어     영어     수학      과학    <합계>    <평군>     ");
		System.out.println("=======================================================");
		for (int i = 0; i < args.length; i++) {	
			if ( i % 5 == 0) {	// 5로 나누웠을때 0일때 개행, 0일때는 제외
				if (i !=0) {
					System.out.println();
				}
			}
			System.out.print(args[i] + "\t");
			//System.out.println(sum1 + "\t");
			
		}
		System.out.println();
		System.out.println("=======================================================");
		System.out.println("<합계> : ");
		System.out.println("<평균> : ");
		
		System.out.println();
		System.out.println();
		
		// step 3
		System.out.println("===========STEP 3 : 합계 / 평균 계산후 출력=============");
		System.out.println();
		
		int sum1 = 0;
		double av1 = 1.0;
		
		// 아랫 라인의 합계 및 평균 변수 선언
		int korSum = 0;
		int engSum =0;
		int matheSum = 0;
		int sienceSum = 0;
		
		double korAvg = 1.0;
		double engAvg = 1.0;
		double mathAvg = 1.0;
		double sienceAvg = 1.0;
		
		// allSum, allAvg
		int allSum = 0;
		double allAvg ;
		
		
		
		
	}

}
