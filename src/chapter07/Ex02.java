package chapter07;

class Student {
	
	// 필드선언
	String stuName;		// 학생이름
	int stuNum;			// 학번
	String stuAddr; 	// 주소
	String stuPhone;	// 전화번호
	double weight; 		// 몸무게
	
	
	// 생성자 오버로딩 
	Student (){}
	
	
	//	기본 생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	Student(String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
	}
	
	Student(String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	}
	
	// 필드의 값을 출력 하는 메소드 void print(){필드의 값을 출력}
	void print () {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학생 학번 : " + stuNum);
		System.out.println("학생 주소 : " + stuAddr);
		System.out.println("학생 폰번호 : " + stuPhone);
		System.out.println("학생 몸무게 : " + weight);
	}
	
	
}









public class Ex02 {

	public static void main(String[] args) {
		Student student1 = new Student ();
		student1.print();
		
		System.out.println("=================");
		
		Student student2 = new Student ("지혁진", 12, "경기도 파주시");
		student2.print();
		
		System.out.println("=================");
		
		Student student3 = new Student ("지혁진", 12, "경기도 파주시","010-2273-0133", 65);
		student3.print();

	}

}
