package co.edu_03;

public class _05_class {
	public static void main(String[] args) {
		_05_class_student kim = new _05_class_student(); // 기본생성자
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);
		
		System.out.println("이름 : " + kim.getName());
		
		kim.showinfo();
		
		_05_class_student lee = new _05_class_student("22-002", "이수현", 90); // 생성자 오버로딩
		lee.showinfo();
		
		_05_class_student choi = new _05_class_student("22-003", "최승현", 85);
		
		_05_class_class class_ = new _05_class_class("김덕배", "1-1", 27);
		System.out.println("선생님 : " + class_.getTname());
		
		class_.addStudents(kim);
		class_.addStudents(lee);
		class_.addStudents(choi);
		// 학생 리스트 보기
		class_.getStudents();
		// 최고점 학생 정보 보기
		System.out.println("<최고 점수 학생>");
		class_.topStudent().showinfo();
		System.out.println("<최고 점수 학생>");
		_05_class_student topstudent = class_.topStudent();
		topstudent.showinfo();
		
		System.out.println("평점 : " + class_.getAvg());
		
	}

}
