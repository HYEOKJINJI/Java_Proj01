package my05.ex04;

import java.util.Arrays;

public class Chapter05ex06ex02 {

	public static void main(String[] args) {
		int [][] arr1 = new int [4][100];
		for (int i =0; i <arr1.length; i++) {
			if (i ==0) {
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 2 ==0) {
						arr1[i][j] = a;
						j++;
					}
				}
			}else if (i==1) {
				for (int j=0 , a= 1; j <arr1[i].length; a++) {
					if (a%5==0) {
						arr1[i][j] =a;
						j++;
					}
				}
			}else if (i==2) {
				for (int j =0, a =1; j < arr1[i].length; a++) {
					if (a%3==0 || a%8==0) {
						arr1[i][j] = a;
						j++;
					}
				}
			}else if (i==3) {
				for (int j=0, a=1; j <arr1[i].length; a++) {
					if (a%7==0) {
						continue;
					}arr1[i][j] =a;
					j++;
				}
				
			}
			for (int[] arr2 : arr1) {
				System.out.println(Arrays.toString(arr2));
			}
			
			
		}
		

	}

}
