package chapter07.ex05;

class Student{
	// 필드 선언
	String stuName;		// 학생이름 : 학생이름 없음
	int stuNo;			// 학번 	 : 0
	String stuPhone;	// 핸드폰 번호 : 00-0000-0000
	String stuAddr;		// 주소  		: 서울
	int stuAge;			// 나이 : 0
	double stuWeight;	// 몸무게 : 0.0
	
	Student(){			// 기본 생성자에서 초기값 할당 : this()메소드를 사용해서 각 필드의 값을 적용
		stuName = "학생이름 없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
	}
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	Student(String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	Student(String stuName, int stuNo, String stuPhone){
		this(stuName, stuNo);
		this.stuPhone = stuPhone;
	}
	Student(String stuName, int stuNo, String stuPhone, String stuAddr){
		this(stuName, stuNo, stuPhone);
		this.stuAddr = stuAddr;
	}
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge){
		this(stuName, stuNo, stuPhone, stuAddr);
		this.stuAge = stuAge;
	}
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge, double stuWeight){
		this(stuName, stuNo, stuPhone, stuAddr, stuAge);
		this.stuWeight = stuWeight;
	}
	
	void print() {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학생 학번 : " + stuNo);
		System.out.println("학생 번호 : " + stuPhone);
		System.out.println("학생 주소 : " + stuAddr);
		System.out.println("학생 나이 : " + stuAge);
		System.out.println("학생 무게 : " + stuWeight);
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 
		Student stu1 = new Student();
		stu1.print();
		System.out.println();
		
		Student stu2 = new Student("지혁진");
		stu2.print();
		System.out.println();
		
		Student stu3 = new Student("지혁진", 12);
		stu3.print();
		System.out.println();
		
		Student stu4 = new Student("지혁진", 12, "010-2273-0133");
		stu4.print();
		System.out.println();
		
		Student stu5 = new Student("지혁진", 12, "010-2273-0133", "파주 운정");
		stu5.print();
		System.out.println();
		
		Student stu6 = new Student("지혁진", 12, "010-2273-0133", "파주 운정", 30);
		stu6.print();
		System.out.println();
		
		Student stu7 = new Student("지혁진", 12, "010-2273-0133", "파주 운정", 30, 65.7);
		stu7.print();
		System.out.println();

	}

}
