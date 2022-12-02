package chapter16.ex07;

abstract class Fluit {
	abstract void print(); 	// 추상 메소드, 객체의 필드 정보를 출력
}
class Apple extends Fluit {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	void print() {
		System.out.println(name + "의 가격은 : " + price + "원 입니다.");
	}
}
class Banana extends Fluit {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	void print() {
		System.out.println(name + "의 가격은 : " + price + "원 입니다.");
	}
}
class Pencil {
	
}

// 제너릭 클래스 : Fluit 만 저장 할 수 있는 제너릭 클래스 
class GenericClass <T extends Fluit>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass <Apple> f1 = new GenericClass();
		f1.setT(new Apple());
		f1.getT().setName("사과");
		f1.getT().setPrice(1000);
		f1.getT().print();
		
		GenericClass <Banana> f2 = new GenericClass();
		f2.setT(new Banana ());
		f2.getT().setName("바나나");
		f2.getT().setPrice(2000);
		f2.getT().print();
		
//		GenericClass <Pencil>> f3 = new GenericClass(); // 오류 발생 
		
		

	}

}
