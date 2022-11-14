package my04.ex01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("=============================================");
		System.out.println(" 1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름 식별");
		System.out.println("=============================================");
		System.out.println("위의 보기중 궁금한 것의 숫자를 넣어주세요");
		int num1 = sc.nextInt();
		if (num1==1) {
			System.out.println("1. 학점의 합계/평균 \n수학 영어 국어 점수를 공백으로 띄어서 넣어주세요.");
			int math = sc.nextInt();
			int eng = sc.nextInt();
			int kor = sc.nextInt();
			int sum = math+eng+kor;
			double avg = sum / 3.0;
			System.out.println("학점의 합계는 "+sum+"점 이며 평균은 "+avg+"점 입니다.");
			
		}else if (num1==2) {
			System.out.println("2. 홀수/짝수 \n숫자를 넣어주세요.");
			int num2 = sc.nextInt();
			System.out.println((num2%2==0)? num2+"는(은) 짝수입니다." : num2+"는(은) 홀수입니다." );
		}else if (num1==3) {
			System.out.println("3. 같은 이름 식별 \n두 이름을 공백으로 분리하여 입력해 주세요");
			String aName = sc.next();
			String bName = sc.next();
			System.out.println(aName.equals(bName)? "두 이름은 같습니다." : "두 이름은 다릅니다.");
		}else {
			System.out.println("잘못 입력 하였습니다.\n1 ~ 3 사이의 숫자를 넣어주세요");
		}

	}

}
