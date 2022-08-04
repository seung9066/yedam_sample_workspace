package co1.prac_Interface_payment;

public class SimplePayment implements Payment {
	
	public double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	@Override
	public int online(int price) {
		int pay = (int)(price - (price*(simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO)));
		return pay;
	}

	@Override
	public int offline(int price) {
		int pay = (int)(price - (price*(simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO)));
		return pay;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보 ***");
		System.out.println("온라인 결제시 총 할인율 : " + (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}

}
