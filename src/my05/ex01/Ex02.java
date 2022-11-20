package my05.ex01;

public class Ex02 {

	public static void main(String[] args) {
		/*  <완료시간 6:00>  p.jangwoo@gmail.com
		  국어 영어 수학  과학   	   국어  영어 수학 과학      국어   영어  수학   과학	       국어   영어   수학  과학
	홍길동  70  88  77   99   이순신   80  68  87  79  김똘똘  60   86  87    30     홍길순    77      56      80     99

	메인 메소드 args 로 아래와 같은 값이 인풋 되었을 경우 <출력> 과 같이 출력해 보세요 
	args :  홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99

	<for 문을 사용해서 출력 하세요> 

	<출력> 
		     국어      영어      수학     과학        <합계>    <평균>
	============================================================
	홍길동     70      88       77        99	
	이순신     80      68       87        79 
	김똘똘     60      86       87        30
	홍길순     77      56       80        99
	============================================================
	<합계> 
	<평균> 	 
			 */
		int sum = 0;	 
		int allsum = 0;
		double avg = 0.0;
		double allavg = 0.0;
		int kor=0;
		int eng=0;
		int math=0;
		int sien=0;
		double kor1=0.0;
		double eng1=0.0;
		double math1=0.0;
		double sien1=0.0;
		
		System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>");
		System.out.println("=========================================================");
		for (int i = 0; i < args.length; i++) {
			if(i%5==0 && i != 0) {
				System.out.println();
			}
			System.out.print(args[i] + "\t");
			if (i % 5 == 0) {
				sum=0;
			}
			if (i%5!=0) {
				sum += Integer.parseInt(args[i]);
				avg = sum / 4.0;
			}
			if (i==4 || i==9 || i== 14|| i == 19) {
				System.out.print(sum+ "\t" + avg);
			}
			if (i==1 || i ==6|| i==11 || i==16) {
				kor += Integer.parseInt(args[i]);
				kor1 = kor / 4.0;
			}if (i==2 || i ==7|| i==12 || i==17) {
				eng += Integer.parseInt(args[i]);
				eng1 = eng / 4.0;
			}
			if (i==3 || i ==8|| i==13 || i==18) {
				math += Integer.parseInt(args[i]);
				math1 = math / 4.0;
			}
			if (i==4 || i ==9|| i==14 || i==19) {
				sien += Integer.parseInt(args[i]);
				sien1 = sien / 4.0;
			}
			if (i % 5!=0 && i!=0) {
				allsum += Integer.parseInt(args[i]);
				allavg = allsum / 16.0;
			}
		}
		System.out.println();
		System.out.println("=========================================================");
		System.out.println("<합계>" + "\t"+kor + "\t" + eng + "\t" + math + "\t" + sien + "\t" + allsum);
		System.out.println("<평균>" + "\t"+kor1 + "\t" + eng1 + "\t" + math1 + "\t" + sien1 + "\t" + allavg);
		

	}

}
