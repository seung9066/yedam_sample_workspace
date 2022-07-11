package co.edu_08_api;

public class _00_prac {
	public static void main(String[] args) {
		System.out.println("=========================================");
		// 자바 문자열 포함
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트", "자 바" };
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].indexOf("자바") != -1) {
				System.out.println(str[i] + " : 자바 관련");
				count++;
			} else {
				System.out.println(str[i] + " : 자바 관련 x");
			}
		}
		System.out.println("자바관련 : " + count + "개");
		System.out.println("=========================================");

		// 파일의 확장자, 파일명
		String path = "c:/images/hello.png";
		int fromInd = path.lastIndexOf("/");
		int toInd = path.indexOf(".");
		System.out.println("파일명 : " + path.substring((fromInd + 1), toInd));
		System.out.println("확장자 : " + path.substring(toInd + 1));

		/*
		 * Class cls = _05_Class.class; String path =
		 * cls.getResource("hello.png").getPath(); System.out.println("경로 : " + path
		 * .replace(
		 * "/C:/Users/admin/git/yedam_sample_workspace/HelloWorld/bin/co/edu_08_api/",
		 * "c:/images/"));
		 */

		System.out.println("=========================================");
		// tel에 031-2103-3478
		String tel = "";
		String[] tels = { " 031", " 210 3", "34 78" };
		String tels1 = tels[1].substring(0, 4) + tels[1].substring(5);
		String tels2 = tels[2].substring(0, 2) + tels[2].substring(3);
		tel = tels[0].trim() + "-" + tels1.trim() + "-" + tels2.trim();
		System.out.println(tel);

		System.out.println("=========================================");
		// 남여 구분
		String[] ssn = { "970403-1231234", "010503 3456123", "980123/2412345", "0202023217891" };

		for (int i = 0; i < ssn.length; i++) {
			System.out.printf(i + "번째 : ");
			checkGender(ssn[i]);
		}
		System.out.println("=========================================");
	}

	public static void checkGender(String ssn) {
		char sex = ssn.charAt(7);

		if (ssn.length() == 13) {
			sex = ssn.charAt(6);
		}
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
