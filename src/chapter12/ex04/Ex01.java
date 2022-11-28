package chapter12.ex04;

interface Animal{

}

interface Animal1 extends Animal{
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}


// Cat, Tiger  < == cry(), run()
class Cat implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("고양이는 야옹 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("고양이는 달립니다.");
	}
}
class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("호랑이는 어흥 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");
	}
}

// Dog, Lion <== run(), eat()
class Dog implements Animal2, Animal3{
	@Override
	public void eat() {
		System.out.println("강아지는 사료를 먹습니다.");
	}
	@Override
	public void run() {
		System.out.println("강아지는 달립니다.");
	}
}
class Lion implements Animal2, Animal3{
	@Override
	public void eat() {
		System.out.println("사자는 고기를 먹습니다.");
	}
	@Override
	public void run() {
		System.out.println("사자는 달립니다.");
	}
}
// Eagle <== run(), eat(), cry
class Eagle implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {
		System.out.println("독수리는 끼요옷 웁니다.");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 아무거나 먹습니다.");
	}
	@Override
	public void run() {
		System.out.println("독수리는 날라 다닙니다.");
	}
}




public class Ex01 {

	public static void main(String[] args) {
		// 배열에 넣어서 어버라이딩된 메소드 출력
		// instanceof 를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
		// instanceof 를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 run(), eat()
		// instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry(), run() , eat()
		Animal1 c1 = new Cat();	//고양이
		Animal2 c2 = new Cat();
		Animal1 t1 = new Cat();	// 호랑이
		Animal2 t2 = new Cat();
		Animal3 d1 = new Dog();	// 강아지
		Animal2 d2 = new Dog();
		Animal3 l1 = new Lion(); // 사자
		Animal2 l2 = new Lion();
		Animal1 e1  = new Eagle();	// 독수리
		Animal2 e2  = new Eagle();
		Animal3 e3  = new Eagle();
		
		// 다운 캐스팅


		// 배열 저장
		Animal[] arr = new Animal[] {c1};
		// for 문 메소드 출력
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.println(arr[i]);
			}
		}
		
		
		
		
		

		
		
		
		
		

	}

}
