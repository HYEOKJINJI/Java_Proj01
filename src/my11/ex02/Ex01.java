package my11.ex02;

class Student{
	// 필드
	String name;
	
	// 합계와 평균을 출력 하는 메소드
	void sum_avg() {
	}
}
class Student_Sub extends Student{
	// 자식의 필드
	int kor; 	// 국어점수
	int eng; 	// 영어점수
	int math; 	// 수학점수
	
	
	// 부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math 합계와 평균을 출력 하는 메소드
	public Student_Sub(String name, int kor, int eng, int math) {
		super();
		int sum = kor + eng + math;
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.printf("%s 학생의 합계는 : %d 이고, 평균은 %4.2f 입니다.",name, sum, sum/3.0);
		System.out.println();
	}
	@Override
	public String toString() {
		return "Student_Sub [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속, 업캐스팅, 다운캐스팅, 객체를 배열에 넣어서 배열에 저장된 값을 출력
		// 생성자를 사용해서 객체 생성시 필드의 값을 할당하고 
		Student s1 = new Student_Sub("홍길동", 70, 88, 77);
		Student s2 = new Student_Sub("이순신", 80, 68, 87);
		Student s3 = new Student_Sub("김똘똘", 60, 86, 87);
		Student s4 = new Student_Sub("홍길순", 70, 56, 80);
		Student s5 = new Student_Sub("강감찬", 55, 66, 77);

		// 홍길동	70	88	77 
		
		// 이순신	80	68	87
		
		// 김똘돌	60	86	87
		
		// 홍길순	70	56	80	
		
		// 강감찬 55	66	77
		
		// Student 배열 변수 arr 변수에 모든 객체를 저장해서 
		Student[] arr = new Student[] {s1, s2, s3,s4,s5};
		// 배열의 값을 for 문으로 출력 할때 
		int[] sum = new int [3];
		for(int i = 0; i < arr.length; i++) {
			arr[i].sum_avg();
			
			sum[0] += ((Student_Sub)arr[i]).kor;
			sum[1] += ((Student_Sub)arr[i]).eng;
			sum[2] += ((Student_Sub)arr[i]).math;
			
			if (i==arr.length-1) {
				System.out.printf("5명의 국어의 총 합계는 %d 이고, 평균은 %4.2f 입니다.", sum[0],sum[0]/5.0);
				System.out.println();
				System.out.printf("5명의 영어의 총 합계는 %d 이고, 평균은 %4.2f 입니다.", sum[1],sum[1]/5.0);
				System.out.println();
				System.out.printf("5명의 국어의 총 합계는 %d 이고, 평균은 %4.2f 입니다.", sum[2],sum[2]/5.0);
			}
			
		}
		
		
		
		
		
		
		
		
		
		// 오버라이딩된 메소드 출력 < 그 학생의 국어, 영어, 수학 의 합계, 평균
		
		
		
		// 5명의 학생의 국어에 대한 합계, 평균
		// 5명의 학생의 영어에 대한 합계, 평균
		// 5명의 학생의 수학에 대한 합계, 평균
		
		
		

	}

}
