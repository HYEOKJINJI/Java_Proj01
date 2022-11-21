package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 
		
		// 두 배열의 각 방의 내용을 더해서 출력하는 매소드 생성
		
		// 배열 a : 4의 배수를 1 ~ 300 까지
		int[] a = new int[300/4];
		for (int i = 0, j = 4; i < a.length; i++, j+=4) {
			a[i] = j;
		}
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 배열 b : 5의 배수를 1 ~ 300 까지
		int[] b = new int[300/5];
		for (int i = 0, j = 5; i < b.length; i++, j+=5) {
			b[i] = j;
		}
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 두 배열의 각 방의 값을 더해서 출력
		arraySum(a,b);
		
		
	}
	
		// 두개의 배열을 인풋 받아서 각 방의 값을 대허새 출력

	public static void arraySum(int[]a, int[]b) {
		int [] c = new int [a.length];		// c : 두 배열을 인풋 받고 같은 방번호일때 값을 더해서 넣는
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (i >= b.length) {
					c[i] = a[i];
				}
				if (i==j) {
					c[i] = a[i] + b[j];
				}
			}
		}

	System.out.println(Arrays.toString(c));
	}
	
	

}
