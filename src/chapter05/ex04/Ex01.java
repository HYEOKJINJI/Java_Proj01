package chapter05.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		int arr1[];	// 배열의 변수
		int n;		// 선택자
		int idx;	// 배열의 방갯수
		
		
		do {	System.out.println("========================================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가 하도록 값을 넣는데 4배수 만 빼고 저장 후 출력");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3배수 만 저장하는데 그중 6배수인 경우 빼고 저장 후 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("========================================================================");
			System.out.println("번호를 입력해 주세요 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			Scanner sc = new Scanner (System.in);
			n = sc.nextInt();
			if (n == 1) {
				System.out.println("1번 선택 : 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
				int i =0;
				idx = sc.nextInt();
				arr1 = new int [idx];
				for (int a = 1; ; a++) {
					if (a%7==0 || a%8==0) {
						arr1[i] = a;
						i++;
					}if (i==idx) {
						break;
					}
				}for (i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}System.out.println();
				
			}else if (n == 2) {
				System.out.println("2번 선택 : 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가 하도록 값을 넣는데 4배수 만 빼고 저장 후 출력");
				int i=0;
				idx = sc.nextInt();
				arr1 = new int [idx];
				for (int a = 1; ;a++) {
					if (a%4==0) {
						continue;
					}if(i==idx) {
						break;
					}arr1[i] = a;
					i++;
					
					
				}for (i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.println();
				
			}else if (n == 3) {
				System.out.println("3번 선택 : 인풋 값을 받아서 방의 크기를 지정하고 3배수 만 저장하는데 그중 6배수인 경우 빼고 저장 후 출력");
				int i = 0;
				idx = sc.nextInt();
				arr1 = new int [idx];
				for (int a = 1; ; a++) {
					if (a%3==0) {
						arr1[i] = a;
						i++;
						if(a%6!=0) {
							continue;
						}
					}
				}/////////////////////////////////////////////////////////////
				
			}else if (n == 4) {
				System.out.println("4번선택 : 프로그램을 종료합니다.");
				sc.close();
				break;
				
			}else {
				System.out.println("잘못 입력 되었습니다. 1 ~ 4 번 까지의 숫자를 다시 입력해주세요>>>");
			}


		}while(true);
		
	}
	
	

}
