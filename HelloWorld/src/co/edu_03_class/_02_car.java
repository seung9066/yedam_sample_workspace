package co.edu_03_class;

/*
 * 자동차(object) = class
 */

public class _02_car {

	// 속성 = 필드(field)
	String model;
	int price;
	int maxspeed;
	int speed;
	double weight;
	double width;

	// 생성자(constructor)(객체 생성시 필드 초기값 지정)
	public _02_car() {
		System.out.println("생성자 호출");
		maxspeed = 200;
	}

	// 생성자(객체 생성시 필드 초기값 지정)
	public _02_car(String model, int maxspeed) {
		this.model = model;
		this.maxspeed = maxspeed;
	}

	// 동작 = 메소드
	public void setspeed(int speed) {
		this.speed = speed; // 우선순위는 method의 speed > 필드의 speed 따라서 this.를 통해 필드를 지정
	}

	public void showspeed() {
		System.out.println("현재 속도는 " + speed + "km/h 입니다.");
	}

	public void run() {
		System.out.println(model + "가 달립니다.");
	}

	public void start() {
		System.out.println(model + "가 출발합니다.");
	}

	public void stop() {
		System.out.println(model + "가 정지합니다.");
	}

}
