package co1.prac_Interface_payment;

public interface Payment {
	// 상수필드
	public static final double ONLINE_PAYMENT_RATIO = 0.05;
	public static final double OFFLINE_PAYMENT_RATIO = 0.03;
		
	// 추상 메소드
	// interface에서는 abstract를 생략해도 추상화 됨
	public int online(int price);
	public int offline(int price);
	public void showInfo();
	
}
