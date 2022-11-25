package my10.ex10;

class C {
	String stuID;
	String name;
	int age;
	
	// c1.equals(c2) // stuID 필드를 재정의 해서, true, false
	@Override
	public boolean equals(Object obj) {
		if (this.stuID == ((C)obj).stuID ) {
			return true;
		}else {
			return false;
		}
	} 
		
	// 생성자, 기본생성자1, 생성자2
	C () {}
	public C(String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}
	// toString() 메소드 재정의 : 필드의 값을 출력, 객체
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C ("1111", "지혁진", 30);
		C c2 = new C ("1111", "지동진", 40);
		C c3 = new C ("2222", "문영순", 50);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
	}

}
