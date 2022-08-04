package co1.prac_Interface_payment;



public class app {
	public static void main(String[] args) {
		
		Payment cardPay = new CardPayment(0.08);
		cardPay.showInfo();
		System.out.println("온라인 결제 금액 : " + cardPay.online(10000));
		System.out.println("오프라인 결제 금액 : " + cardPay.offline(10000));
		
		System.out.println();
		
		Payment simplePay = new SimplePayment(0.05);
		simplePay.showInfo();
		System.out.println("온라인 결제 금액 : " + simplePay.online(10000));
		System.out.println("오프라인 결제 금액 : " + simplePay.offline(10000));
	}
}
