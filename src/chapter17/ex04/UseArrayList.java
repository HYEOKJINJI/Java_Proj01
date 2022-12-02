package chapter17.ex04;

import java.util.ArrayList;
import java.util.Arrays;

class Student {
	String name;
	int stuID;
	
	Student(){}
	// 생성자를 사용해서 값을 인풋 받아 메모리에 할당
	Student(String name, int stuID){
		this.name = name;
		this.stuID = stuID;
	}
	
	// toString() 재정의 : 객체 자체를 출력 할 때 객체 주소가 출력 되지 않고 메모리의 값을 출력
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
}


public class UseArrayList {

	public static void main(String[] args) {
		
		// ArrayList 에 저장될 객체는 Student 객체가 저장됨
		ArrayList<Student> a1 = new ArrayList();
		
		// Student 객체를 생성
		Student s1 = new Student("홍길동", 1111);
		Student s2 = new Student("이순신", 2222);
		Student s3 = new Student("강감찬", 3333);
		
		// Student 객체를 ArrayList 컬렉션에 저장
		a1.add(s1);a1.add(s2);a1.add(s3);
		
		// 컬렉션의 내용을 순환 하면서 출력
		System.out.println("for ===============");
		// for
		for (int i = 0; i < a1.size(); i++) {
			Student ss1 = a1.get(i);
			System.out.println(ss1);
		}
		System.out.println("Enhanced for ===========================");
		// Enhanced For
		for(Student k : a1) {
			System.out.println(k);
		}
		System.out.println("=============================");
		// 모든 컬렉션은 컬렉션 객체를 출력 할 때 컬렉션의 들어간 값을 출력.
		System.out.println(a1);
		System.out.println(a1.toString());
		
	}

}
