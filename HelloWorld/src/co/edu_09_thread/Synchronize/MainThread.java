package co.edu_09_thread.Synchronize;

/*
 * 객체를 공유하다보니 100, 50이 아닌 둘 다 50으로 출력됨
 * 따라서 synchronized를 이용
 */


public class MainThread {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); // user1은 calculator의 메모리 값을 100으로 바꿔주는 역할
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start(); // user2는 calculator의 메모리 값을 50으로 바꿔주는 역할
	}

}
