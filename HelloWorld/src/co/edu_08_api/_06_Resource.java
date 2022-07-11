package co.edu_08_api;

public class _06_Resource {
	public static void main(String[] args) {
		Class cls = _05_Class.class;
		String path = cls.getResource("sample.txt").getPath(); // 파일 주소 불러오기
		System.out.println("경로 : " + path);
	}
}
