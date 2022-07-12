package co.edu_09_thread;

public class _01_Thread {
	public static void main(String[] args) {
		
		// Thread의 생성자 매개값 (Runnable 구현객체)
		Thread beep = new Thread(new _01_BeepTask());
		
		// Thread 클래스 상속 받은 하위클래스 생성자
		beep = new _01_BeepWorkerThread();
		beep.start();
		
		// 콘솔 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}