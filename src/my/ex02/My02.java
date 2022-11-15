package my.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class My02 {

	public static void main(String[] args) {
		// <문제>
		
		System.out.println("========================================================================");
		System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
		System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가 하도록 값을 넣는데 4배수 만 빼고 저장 후 출력");
		System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3배수 만 저장하는데 그중 6배수인 경우 빼고 저장 후 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("========================================================================");
		System.out.println("번호를 입력해 주세요 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int i = 0;
		int b=0;
		if(num1==1) {
	         System.out.println("7의 배수와 8의 배수 방의 크기를 지정해주세요.");
	         num1 = sc.nextInt();
	         int[] arr1 = new int [num1];
	         for (int a = 0; a < arr1.length; ) {
	   boolean flag = true;
	            while(flag){
	      if (b%7==0 || b%8==0) {
	                  arr1[a] = b;
	      a++;
	      flag=false;
	                  }
	      b++;
	 
	         
	            } System.out.println(Arrays.toString(arr1));
	            }    
	         
	    }   
	         
	}
	

}
