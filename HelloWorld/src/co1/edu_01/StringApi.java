package co1.edu_01;

public class StringApi {
	public static void main(String[] args) {
		
		// 100번지
		String a = "aaa";
		// 101번지
		a = a + "bbb";
		// 두 메모리를 차지함
		
		// 메모리 관리 효율에 좋음
		StringBuilder sb = new StringBuilder();
		
		// 100번지
		sb.append("aaa");
		// 100번지
		sb.append("bb");
		
		
		// == 주소값 비교
		// .equals 데이터 비교
	}
}
