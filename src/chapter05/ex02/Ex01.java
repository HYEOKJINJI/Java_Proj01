package chapter05.ex02;		// 꼭 연습하기....

public class Ex01 {

	public static void main(String[] args) {
		// <문제> arr1 배열 변수에 정수 1000 개의 방을 생성
		//	for 문을 사용해서 각 방에 3의 배수의 값을 저장
		//	for 문을 사용해서 출력
		int[] arr1 = new int [1000];
		
		for (int i=0,j=3; i<1000; i++,j+=3) {
			arr1[i] = j;

		}
		for (int i=0; i<1000; i++) {
			
			
			System.out.print(arr1[i]+" ");
		}
		
		
		
	}

}
