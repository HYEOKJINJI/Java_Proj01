package my10.ex08;

class Animal {
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
}
class Man extends Animal{
	@Override
	void run() {
		System.out.println("남자는 달립니다.");
	}
}
class Woman extends Animal{
	@Override
	void run() {
		System.out.println("여자는 달립니다.");
	}
}
class Lion extends Animal{
	@Override
	void run() {
		System.out.println("사자는 달립니다.");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
}
class Cat extends Animal{
	@Override
	void run() {
		System.out.println("고양이는 달립니다.");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("강아지는 달립니다.");
	}
}
class DogChild extends Dog{
	@Override
	void run() {
		System.out.println("아기 강아지는 달립니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// Animal : 부모 클래스, run() 정의
		// 자식 클래스 : Man, Woman, Lion, Tiger, Cat, Dog, DogChild 
		// 		- 부모의 run 메소드를 재정의 
		// arr[] 배열에 Animal 타입으로 저장 후 For, Enhanced For 문으로 출력, run 메소드 출력
		
		Animal a = new Animal();
		a.run();
		
		Animal m = new Man();
		m.run();
		
		Animal w = new Woman();
		w.run();
		
		Animal l = new Lion();
		l.run();
		
		Animal t = new Tiger();
		t.run();
		
		Animal c = new Cat();
		c.run();
		
		Animal d = new Dog();
		d.run();
		
		Animal dc = new DogChild();
		dc.run();
		
		Animal[] arr = new Animal[] {a, m, w, l, t, c, d, dc};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].run();
		}
		
		for (Animal k : arr) {
			k.run();
		}
		
		
		

	}

}
