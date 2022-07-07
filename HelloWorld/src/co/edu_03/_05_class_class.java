package co.edu_03;

public class _05_class_class {
	
	// 필드
	private String tname;
	private String bname;
	private _05_student[] students;
	
	// 생성자
	public _05_class_class() {
		
	}
	
	public _05_class_class(String tname) {
		this.tname = tname;
	}
	
	public _05_class_class(String tname, String bname) {
		this.tname = tname;
		this.bname = bname;
	}
	
	public _05_class_class(String tname, String bname, int studentnum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new _05_student[studentnum];
	}
	
	// 메소드

	public String getTname() { // 선생님 이름 알려줌
		return tname;
	}

	public void setTname(String tname) { // 선생님 이름을 지정
		this.tname = tname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void getStudents() {
		System.out.println("선생님 : " + tname + "\n반 : " + bname);
		for(int i = 0; i < students.length; i ++) {
			if (students[i] != null) {
				students[i].showinfo();
			}
		}
	}

	public void addStudents(_05_student student) {
		for(int i = 0; i < students.length; i ++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
	
	// 점수가 가장 높은 학생
	public _05_student topStudent() {
		int max = 0;
		_05_student student = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getScore() > max) {
				max = students[i].getScore();
				student = students[i];
			}
		}
		return student;
	}
	
	public double getAvg() {
		int sum = 0;
		int a = 0;
		double avg = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				sum += students[i].getScore();
				a++;
			}
		}
		avg = (double) sum / a;
		return avg;
	}

}
