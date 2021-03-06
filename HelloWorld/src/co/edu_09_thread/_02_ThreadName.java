package co.edu_09_thread;

/*
 * Thread 상속 받아서 1) ThreadA, 2) ThreadB 클래스를 만듬
 */

class ThreadA extends Thread {
	public ThreadA() {
		setName("Thread-A");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread명 : " + getName());
		}
	}
}

class ThreadB extends Thread {
	public ThreadB() {
		setName("Thread-B");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread명 : " + getName());
		}
	}
}

public class _02_ThreadName {
	public static void main(String[] args) {
		Thread threadA = new ThreadA();
		threadA.start();
		
		Thread threadB = new ThreadB();
		threadB.start();
	}

}
