package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 	스캐너로 배열의 방 번호를 인풋 받습니다.
		// 배열 변수 : arr1, 2의 배수를 저장 후 출력, enhanced for 문 사용 추력
		// 배열 변수 : arr2, 3의 배수를 인풋 받아서 출력, for 문 사용해서 출력
		// 		arr1.length		arr2.length
		Scanner sc = new Scanner(System.in);
		System.out.println("방의 갯수를 넣어주세요");
		int idx;
		idx = sc.nextInt();
		int[] arr1 = new int [idx];
		int[] arr2 = new int [idx];
		
		for (int i = 0, j = 2; i < arr1.length; i++, j+=2) {
			arr1[i] = j;
		}
		for (int i = 0, j = 3; i < arr2.length; i++, j+=3) {
			arr2[i] = j;
		}
		for (int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.println();
			
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		
		sc.close();
		
	}
		
}