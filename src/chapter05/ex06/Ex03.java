package chapter05.ex06;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 2차 정방향 배열
		
		// 1. 2차원 배열의 선언
		int[][] arr1= new int [5][100];		// 5 : 행의 갯수 , 100 : 열의 갯수
		System.out.println(arr1.length);	// 5 :  arr1.length : 행의 갯수
		System.out.println(arr1[0].length); // 100 : arr1[0].length : 0번행의 열의 갯수
		
		// 2. 2차원 배열의 값 넣기 : 이중 for 문 사용 (for 안에 for) 값을 넣기
		// 행을 정의 : i <== 행의 방번호(index), arr1.length <== 행의 갯수
		int a = 0;
		for (int i=0; i < arr1.length; i++) {
			// 열을 정의 : j <== 열의 방번호(index), arr1[i],length <== 지정된 i 행의 열의 갯수
			for (int j = 0 ; j < arr1[i].length;j++, a++) {
				arr1[i][j] = a + 1;
			}
		}
		// 3. 배열의 값을 출력 하기 (for-for)		
		System.out.println("for-for==================");
		for (int i = 0; i < arr1.length; i++) {			// 행을 루프
			for (int j = 0; j < arr1[i].length; j++) {	// 열을 루프
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		// 4. Enhanced For 문을 사용해서 값 출력
		System.out.println("Enhanced for =====================");
		for (int[] k : arr1) {		// arr1 의 루프를 돌면서 행을 꺼내와서 k 변수에 할당
			for (int b : k) {		// 일차원 배열의 각방의 값을 끄집어 와서 b 변수에 할당
				System.out.print(b + " ");
				
			}
			System.out.println();
		}
		// 5. Arrays.toString() < == (일차원 배열의 값을 출력) 문을 사용해서 값 출력
				// arr1 : 이차원 배열
		System.out.println("Arrays.toString()===================");
		for (int[] k : arr1) {
			System.out.println(Arrays.toString(k));
		}
		
		
		


	}

}
