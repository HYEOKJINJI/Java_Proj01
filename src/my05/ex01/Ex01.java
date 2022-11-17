package my05.ex01;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i < args.length; i++) {
			String a = String.valueOf(args[i]);
			if (i%5==0) {
				continue;
			}
		}
		System.out.println(Arrays.toString(args));
		
		
	}

}
