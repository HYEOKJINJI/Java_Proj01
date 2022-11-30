package chapter13.ex09;

interface Car {
	void run();
	void stop();
	void start();
}

class CarPlay {
	void abc(Car c1) {
		c1.run();
		c1.stop();
		c1.start();
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarPlay c1 = new CarPlay();
		
		c1	.abc(new Car() {
			@Override
			public void run() {
				System.out.println("자동차는 달립니다.");
			}
			@Override
			public void start() {
				System.out.println("자동차는 출발 했습니다.");
			}
			@Override
			public void stop() {
				System.out.println("자동차는 멈췄습니다.");
			}
		});
		
		

	}

}
