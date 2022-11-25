package chapter11.ex02;

class Student{
	// 필드
	String name;
	
	
	Student (){}
	
	// 합계와 평균을 출력 하는 메소드
	void sum_avg() {
		System.out.println("합계와 평균을 구하는 메소드 입니다.");
	}
}
class Student_Sub extends Student{
	// 자식의 필드
	
	int kor; 	// 국어점수
	int eng; 	// 영어점수
	int math; 	// 수학점수
	
	// 부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math 합계와 평균을 출력 하는 메소드
	Student_Sub(){}
	
	public Student_Sub(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	int sum = kor + eng + math;
	double avg = sum/3.0;
	
	
	
	
	@Override
	void sum_avg() {
		System.out.println(name+" 합계는 : " + (kor+eng+math )+ "평균은 : " + (kor+eng+math)/3.0 + " 입니다." );
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
		
		Student s1 = new Student_Sub ("홍길동", 70, 88, 77);
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
		Student[] arr = new Student_Sub[5];
		// 배열의 값을 for 문으로 출력 할때 
		for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				arr[i]=s1;
			}
			if(i == 1) {
				arr[i] = s2;
			}
			if(i == 2) {
				arr[i] = s3;
			}	
			if(i == 3) {
				arr[i] = s4;
			}
			if(i == 4) {
				arr[i] = s5;
			}
			arr[i].sum_avg();
		}
		// 오버라이딩된 메소드 출력 < 그 학생의 국어, 영어, 수학 의 합계, 평균
		
		
		Student_Sub b1 = (Student_Sub)s1;
		Student_Sub b2 = (Student_Sub)s2;
		Student_Sub b3 = (Student_Sub)s3;
		Student_Sub b4 = (Student_Sub)s4;
		Student_Sub b5 = (Student_Sub)s5;
		// 5명의 학생의 국어에 대한 합계, 평균
		// 5명의 학생의 영어에 대한 합계, 평균
		// 5명의 학생의 수학에 대한 합계, 평균
		
		int korsum = b1.kor + b2.kor + b3.kor + b4.kor + b5.kor;
		int engsum = b1.eng + b2.eng + b3.eng + b4.eng + b5.eng;
		int mathsum = b1.math + b2.math + b3.math + b4.math + b5.math;
		double koravg = korsum / 5.0;
		double engavg = engsum / 5.0;
		double mathavg = mathsum / 5.0;
	
		System.out.println("국어의 합계는 " +korsum + "평균은 " + koravg);
		System.out.println("영어의 합계는 " +engsum + "평균은 " + engavg);
		System.out.println("수학의 합계는 " +mathsum + "평균은 " + mathavg);
		

	}

}
