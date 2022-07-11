package co.edu_07_exception;

public class _05_Throws1 {
	public static void main(String[] args) {

		String[] str = { "100", "200", null, "ten" };
		try {
			subMethod(str);
		} catch (NumberFormatException e) {
			System.out.println("<예외 종류>");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("<예외 종류>");
			e1.printStackTrace();
		} catch (Exception e2) {
			System.out.println("<예외 종류>");
			e2.printStackTrace();
		} finally { // 예외가 발생하건 아니건 반드시 실행할 코드를 여기 넣음
			System.out.println("프로그램 정상 종료");
		}
		System.out.println("종료");
	}

	public static void subMethod(String[] strary) throws NumberFormatException, ArrayIndexOutOfBoundsException {
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(strary[i]); // 문자열을 받아서 숫자타입으로 변형하기
			System.out.println(num);
		}
	}
}
