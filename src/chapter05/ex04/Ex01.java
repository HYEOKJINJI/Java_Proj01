package chapter05.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("========================================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가 하도록 값을 넣는데 4배수 만 빼고 저장 후 출력");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3배수 만 저장하는데 그중 6배수인 경우 빼고 저장 후 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("========================================================================");
			System.out.println("1 ~ 4 번호를 선택해서 입력해 주세요 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			int n = sc.nextInt();
			int i = 0;
			if (n==1) {
				System.out.println("1번선택 : 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
				int idx = sc.nextInt();
				int[] arr1 = new int [idx];
				for(int a=1; ; a++) {
					if (a%7==0 || a%8==0) {
						arr1[i] = a;
						i++;
						
					}
					if (i == idx) {
						break;
					}
				}
				for (i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.println();
			}else if(n==2) {
				System.out.println("2번 선택 : 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가 하도록 값을 넣는데 4배수 만 빼고 저장 후 출력");
				int idx = sc.nextInt();
				int[] arr1 = new int [idx];
				for (int a=1; ; a++) {
					
					if (a%4==0) {
						continue;
					}
					arr1[i] = a;
					i++;
					if(i==idx) {
						break;
					}
				}
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.println();
			}else if (n==3) {
				System.out.println("3번 선택 : 인풋 값을 받아서 방의 크기를 지정하고 3배수 만 저장하는데 그중 6배수인 경우 빼고 저장 후 출력");
				int idx = sc.nextInt();
				int[] arr1 = new int [idx];
				for (int a = 1; ; a++) {
					if (a%3==0) {
						if (a%6==0) {
							continue;
						}
						arr1[i] = a;
						i++;
						if (i==idx) {
							break;
						}
					}
				}
				for(int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.println();
			}else if (n==4) {
				sc.close();
				break;
			}else {
				System.out.println("잘못 입력 1 ~ 4 번 재 입력 해주세요 >>");
			}
			
			
			
		}
	}
	

}
