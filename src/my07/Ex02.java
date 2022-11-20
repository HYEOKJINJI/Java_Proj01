package my07;
// 필드선언
class Student{
String stuName;		// 학생이름
int stuNum;			// 학번
String stuAddr; 	// 주소
String stuPhone;	// 전화번호
double weight; 		// 몸무게


// 생성자 오버로딩 
	Student (){
		
	}


//	기본 생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	Student (String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		
	}
// 필드의 값을 출력 하는 메소드 void print(){필드의 값을 출력}
	Student (String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	}
	void print() {
		System.out.println("학생의 이름 : " + stuName);
		System.out.println("학생의 학번 : " + stuNum);
		System.out.println("학생의 주소 : " + stuAddr);
		System.out.println("학생의 번호 : " + stuPhone);
		System.out.println("학생의 몸무게 : " + weight);
	}
	
}



public class Ex02 {

	public static void main(String[] args) {
		Student student = new Student();
		student.print();
		System.out.println();
		
		Student student1 = new Student ("지혁진", 12, "파주시 운정");
		student1.print();
		System.out.println();
			
		Student student2 = new Student ("지혁진", 12, "파주시 운정", "010-2273-0133", 65.79);
		student2.print();
		

	}	

}
