package chapter05.ex09;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		/*
	  국어 영어 수학 과학		  국어 영어 수학 과학		  국어 영어 수학 과학		  국어 영어 수학 과학
홍길동  70  88  77 99  이순신  80 68  87 79  김똘똘  60 86  87 30  홍길순 77  56  80  99

메인 메소드 args 로 아래와 같은 값이 인풋 되었을 경우 <출력> 과 같이 출력해 보세요

args : 홍길동 70 88 77 99  이순신 80 68 87 79  김똘똘 60 86 87 30  홍길순 77 56 80 99

<for 문을 사용해서 출력 하세요>

<출력>
	국어		영어		수학		과학		<합계>	<평균>
==================================================
홍길동 70     88      77      99   
이순신 80     68      87      79		 
김똘똘 60     86      87      30
홍길순 77     56      80      99
================================================== 
<합계>
<평균>		 
		 */

		String a = args[0];
		String b = args[5];
		String c = args[10];
		String d = args[15];
		double avg1=0.0;
		double avg2=0.0;
		double avg3=0.0;
		double avg4=0.0;
		double avg5=0.0;
		double avg6=0.0;
		double avg7=0.0;
		double avg8=0.0;
		
		
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		int sum6=0;
		int sum7=0;
		int sum8=0;
		
		for (int i = 1; i < args.length; i++) {
			if (i < 5) {
				sum1+=Integer.parseInt(args[i]);
				avg1 = sum1/4.0;

			}
			
		}
		for (int i = 6; i < args.length; i++) {
			if (i <10) {
				sum2 +=Integer.parseInt(args[i]);
				avg2 = sum2/4.0;
			}
		}
		for (int i = 11; i < args.length; i++) {
			if (i <15) {
				sum3 +=Integer.parseInt(args[i]);
				avg3 = sum3/4.0;
			}
		}
		for (int i = 16; i < args.length; i++) {
			if (i <20) {
				sum4 +=Integer.parseInt(args[i]);
				avg4 = sum4/4.0;
			}
		}
		for (int i = 1; i < args.length; i++) {
			if (i==1 || i==6 || i== 11 || i==16) {
				sum5 +=Integer.parseInt(args[i]);
				avg5 = sum5/4.0;
			}
		}
		for (int i = 2; i < args.length; i++) {
			if (i==2 || i==7 || i== 12 || i==17) {
				sum6 +=Integer.parseInt(args[i]);
				avg6 = sum6/4.0;
			}
		}
		for (int i = 3; i < args.length; i++) {
			if (i==3 || i==8 || i== 13 || i==18) {
				sum7 +=Integer.parseInt(args[i]);
				avg7 = sum7/4.0;
			}
		}
		for (int i = 4; i < args.length; i++) {
			if (i==4 || i==9 || i== 14 || i==19) {
				sum8 +=Integer.parseInt(args[i]);
				avg8 = sum8/4.0;
			}
		}
		
		int sum9=sum1+sum2+sum3+sum4;
		double sum10 = avg1 + avg2 + avg3 + avg4;
		double avg10 = sum9 / 4.0;
		double avg9= sum10 / 4.0;
		
		
		
		

		System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>");
		System.out.println("===================================================");
		System.out.println(a +"\t"+ args[1] +"\t"+ args[2] + "\t" + args[3] + "\t" + args [4] + "\t" + sum1 + "\t" + avg1);
		System.out.println(b +"\t"+ args[6] +"\t"+ args[7] + "\t" + args[8] + "\t" + args [9] + "\t" + sum2 + "\t" + avg2);
		System.out.println(c +"\t"+ args[11] +"\t"+ args[12] + "\t" + args[13] + "\t" + args [14] + "\t" + sum3 + "\t" + avg3);
		System.out.println(d +"\t"+ args[16] +"\t"+ args[17] + "\t" + args[18] + "\t" + args [19] + "\t" + sum4 + "\t" + avg4);
		System.out.println("===================================================");
		System.out.println("<합계>\t" + sum5 + "\t" + sum6 + "\t" + sum7 + "\t" + sum8 +"\t"+ sum9 + "\t" + sum10);
		System.out.printf("<평균>\t" + avg5 + "\t" + avg6 + "\t" + avg7 + "\t" + avg8 + "\t"+ avg10 + "\t" + avg9 );
		
		
		
		
		

	}

}
