package co.edu_03;

public class _01_class {
	public static void main(String[] args) {
		
		_01_class_student s1 = new _01_class_student(); // new를 통해 초기화를 시켜줘야한다.
		s1.name = "최승현";
		s1.age = 19;
		s1.score = 80;
		s1.height = 180.1;

		_01_class_student s2 = new _01_class_student();
		s2.name = "박민수";
		s2.age = 20;
		s2.score = 85;
		s2.height = 178.2;

		_01_class_student s3 = new _01_class_student();
		s3.name = "박춘배";
		s3.age = 21;
		s3.score = 79;
		s3.height = 168.9;

		_01_class_student[] students = { s1, s2, s3 };

		for (int i = 0; i < students.length; i++) {
			System.out.print("이름 : " + students[i].name);
			System.out.print(" | 나이 : " + students[i].age);
			System.out.print(" | 점수 : " + students[i].score);
			System.out.println(" | 키 : " + students[i].height);
		}
		
		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals("박민수")) { // "a"의 이름을 가진 학생의
				System.out.println("나이 : " + students[i].age); // 나이를 알려달라
			}
		}

	}
}
