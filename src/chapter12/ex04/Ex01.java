package chapter12.ex04;

interface Animal{}
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
		System.out.println("고양이는 야옹 하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("고양이는 달립니다.");
	}
	
}
class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");
	}
	
}
// Dog, Lion <== run(), eat()
class Dog implements Animal2,Animal3{
	@Override
	public void run() {
		System.out.println("강아지는 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("강아지는 사료를 먹습니다.");
	}
}
class Lion implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("사자는 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("사자는 고기를 먹습니다.");
	}
}
// Eagle <== run(), eat(), cry
class Eagle implements Animal1,Animal2,Animal3{
	@Override
	public void cry() {
		System.out.println("독수리는 끼요옷 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("독수리는 날라서 다닙니다.");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 아무거나 잘 먹습니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// 배열에 넣어서 어버라이딩된 메소드 출력
		// instanceof 를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
		// instanceof 를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 run(), eat()
		// instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry(), run() , eat()
		Animal a1 = new Cat();
		Animal a2 = new Tiger();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		Animal a5 = new Eagle();
		
		Animal[] arr = new Animal[] {a1,a2,a3,a4,a5};
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Cat || arr[i] instanceof Tiger) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
			}
			if(arr[i] instanceof Dog || arr[i] instanceof Lion) {
				((Animal2)arr[i]).run();
				((Animal3)arr[i]).eat();
			}
			if(arr[i] instanceof Eagle) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
				((Animal3)arr[i]).eat();
			}
		}
		
	}
}
