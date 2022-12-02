package chapter16.ex10;

// 제너릭 클래스 / 제너릭 메소드 를 사용해서 두 점의 좌표값으로 넓이를 구하는 프로그램 작성 

// 점의 좌표를 처리하는 클래스 생성. <제너릭 클래스>
class Point<X, Y>{
	X x;
	Y y ;
	
	// 생성자를 통해서 t , v 값 입력
	Point (){}		// 기본 생성자
	public Point(X x, Y y) {	// x : x 좌표, y : y 좌표
		this.x = x;
		this.y = y;
	}
	
	// getter 만 생성
	public X getT() {
		return x;
	}
	public Y getV() {
		return y;
	}
	
}

// 제너릭 메소드 : 일반 클래스 내에 제너릭 메소드
class GenericMethod {
	
	// makeRectAngle() 메소드를 호출 시 
	public static <X, V> double makeRectAngle(Point<X, V> p1, Point<X,V> p2) {
		// 두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌.
		return (((double) p2.getT()- (double) p1.getT()) * ((double) p2.getV() - (double) p1.getV()));
	}
}



public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두점의 좌표를 저장하는 p1, p2 
		Point p1 = new Point(5.0, 10.0);
		Point p2 = new Point(50.0, 100.0);
		
		// makeRectAngle (p1,p2)  <== 두점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴
		System.out.println(GenericMethod.makeRectAngle(p1, p2));

	}

}
