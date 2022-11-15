package chapter05.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		
		do {System.out.println("========================================================================");
		System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
		System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가 하도록 값을 넣는데 4배수 만 빼고 저장 후 출력");
		System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3배수 만 저장하는데 그중 6배수인 경우 빼고 저장 후 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("========================================================================");
		System.out.println("번호를 입력해 주세요 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int i = 0;
		
		// 이게 잘 안되네요 ㅠㅠ.... 열심히 머리 쥐어 뜯었지만.. 
		if(num1==1) {
			System.out.println("7의 배수와 8의 배수 방의 크기를 지정해주세요.");
			num1 = sc.nextInt();
			int[] arr1 = new int [num1];
			for (int a = 1; a < arr1.length; a++) {
				if (a%7==0 || a%8==0) {
					arr1[i] = a;
					i++;
				}
			}
			for (int k : arr1) {
						System.out.print(k+ " ");
						
			}
			
		}else if (num1==2) {
			System.out.println("3의 배수만 저장하는데 그중 6의 배수만 빼고싶을때 방의 크기를 지정해주세요");
			num1=sc.nextInt();
			int [] arr1 = new int [num1];
			for (int a = 0, b = 1; a < arr1.length; a++, b++) {
				if (b%4==0) {
					continue;
					
				}
				arr1[a] = b;
				
			}
			for (int k : arr1) {
				System.out.print(k+ " ");
			}
		}else if (num1==3) {
			System.out.println("3의 배수만 저장하는데 그중 6의 배수만 빼고싶을때 방의 크기를 지정해주세요");
			num1=sc.nextInt();
			int [] arr1 = new int [num1];
			for (int a = 0, b = 3; a < arr1.length; a++, b+=3) {
				if (b%6==0) {
					continue;
					
				}
				arr1[a] = b;
				
			}
			System.out.println(Arrays.toString(arr1));
		}else if (num1==4) {
			System.out.println("4. 프로그램 종료");
			break;
			
		}
		}while (true);
	
		
	}
	

}
