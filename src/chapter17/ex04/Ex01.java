package chapter17.ex04;

import java.util.ArrayList;

// Car 객체를 3개 생성해서 ArrayList 에 저장 후 객체를 출력시 필드의 값을 출력 하도록 함.
// for, Enhanced For, 컬랙션 자체 출력
class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	Car(){}
	Car(String company, String carModel, String color, int maxSpeed){
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	
	
}



public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Car> arl1 = new ArrayList();
		Car c1 = new Car ("현대", "싼타페", "그레이", 200);
		Car c2 = new Car ("기아", "스포티지", "블랙", 190);
		Car c3 = new Car ("현대", "쏘나타", "화이트", 180);
		
		arl1.add(c1);
		arl1.add(c2);
		arl1.add(c3);
		
		System.out.println("for 문=======================");
		for (int i = 0; i < arl1.size(); i++) {
			Car car = arl1.get(i);
			System.out.println(car);
		}
		
		System.out.println();
		System.out.println("Enhanced For ==============");
		for (Car k : arl1) {
			System.out.println(k);
		}
		System.out.println();
		System.out.println("컬렉션 자체 출력============");
		System.out.println(arl1);

	}

}
