package co.edu_03;

public class _05_class_student {

	// 필드
	private String sno;
	private String name;
	private int score;

	// 생성자 : 기본생성자
	public _05_class_student() {
		
	}
	
	// 생성자 오버로딩(같은 이름의 생성자 여러개 만드는 것)
	public _05_class_student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}

	// getter, setter
	public String getSno() { // 값을 반환
		return sno;
	}

	public void setSno(String sno) { // 값을 대입
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// 전체 정보를 보여주는 showinfo
	public void showinfo() {
		System.out.printf("학번 : %s | 이름 : %s | 점수 : %d\n", sno, name, score);
	}

}
