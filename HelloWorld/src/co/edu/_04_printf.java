package co.edu;

public class _04_printf {
	public static void main(String[] args) {
		/* println = 라인을 바꾼다를 포함. 따라서 printf 이기에 줄 바꿈이 되지 않는다. 따라서 \n을 넣으면 줄바꿈이 된다.
		 * %d 정수형
		 * %s 문자형
		 * %f 실수형
		 * %c 문자열
		 * %n 줄 바꿈
		 * %b boolean
		 */
		System.out.printf("저의 이름은 %s이고 나이는 %d 입니다.\n", "홍길동", 14);
		
		String name = "최승현";
		int age = 28;
		double wei = 70.1;
		System.out.printf("나의 이름은 %s이고\n나이는 %d 이고 \n몸무게는 %.1f 입니다. \n", name, age, wei);
		
	}

}
