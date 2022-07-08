package co.edu_03_class;

public class _02_main {
	public static void main(String[] args) {
		
		// 힙메모리에 인스턴스 생성
		_02_car c1 = new _02_car(); // c1 = 참조변수
		c1.model = "소나타";
		c1.speed = 60; // class
		c1.setspeed(50); // method
		System.out.println("최고속도 : "+c1.maxspeed); // maxspeed를 지정하지 않아도 생성자 호출 시점에 이미 들어감 _01_class2_car.java의 첫번째 생성자
		c1.start();
		c1.run();
		c1.showspeed();
		c1.stop();
		
		System.out.println();
		
		_02_car c3 = new _02_car("아반떼", 180); // _01_class2_car.java의 두번째 생성자를 통해 자동으로 지정됨
		System.out.println(c3.model +"\n최고 속도 : "+ c3.maxspeed);
		
		System.out.println();
		
		_02_car c2 = new _02_car();
		c2.model = "k5";
		c2.speed = 180;
		c2.setspeed(170);
		c2.start();
		c2.run();
		c2.showspeed();
		c2.stop();
		

	}

}
