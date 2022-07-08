package co.edu_06_interfaces;

public class _02_Oracle implements _02_Dao{

	@Override
	public void insert() {
		timerShow("Oracle 입력합니다.");
	}

	@Override
	public void update() {
		timerShow("Oracle 수정합니다.");
	}

	@Override
	public void delete() {
		timerShow("Oracle 삭제합니다.");
	}
	
	private void timerShow(String msg) {
		String[] message = msg.split(""); // 문자열을 문자하나하나 잘라서 배열에 담는다.
		for (int i = 0; i < message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(10); // (100) = 0.1초마다 문장을 하나씩 찍어준다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
