package chapter09.ex03;

class Student{
	String stuName;			// 학생 이름
	static int stuNo;		// 학생 수 : 모든 객체에서 공유 되는 필드, 객체가 생성 될때마다 학생수가 늘어난다.
							// 객체를 생성시 하나씩 늘어 나도록 함.
	String stuAdd;			// 학생 주소
	
	// static 필드의 초기값 할당, 클래스 로딩시 제일먼저 작동
	static {
		stuNo =0;
	}
	Student(String stuName, String stuAdd){
		this.stuName = stuName;
		this.stuAdd = stuAdd;
		stuNo += 1;				// 학생수 모든 객체에서 공유해서 사용
			// stuNo 는 객체를 생성할 때 학생수가 늘어난다
	}
	// 필드의 값을 출력 하는 메소드
	void print () {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학생 주소 : " + stuAdd);
		System.out.println("학생 수 : " + stuNo);
	}
	
}

public class Student_Test {

	public static void main(String[] args) {
		// 1. 객체 생성
		Student s1 = new Student("홍길동", "서울 종로구");
		s1.print();
		System.out.println();
		
		Student s2 = new Student("이순신", "서울 강남구");
		s2.print();
		System.out.println();
		
		Student s3 = new Student("강감찬", "서울 성북구");
		s3.print();
		System.out.println();
		
		System.out.println("인스턴스 필드 : 다른 객체와 공유 하지 않음 ===============");
		System.out.println(s1.stuName);
		System.out.println(s2.stuName);
		System.out.println(s3.stuName);
		System.out.println();
		
		System.out.println("정적 필드 : 모든 객체와 공유 =======================");
		System.out.println(s1.stuNo);
		System.out.println(s2.stuNo);
		System.out.println(s3.stuNo);
	}

}
