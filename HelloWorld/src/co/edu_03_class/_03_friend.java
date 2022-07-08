package co.edu_03_class;

/*
 * 이름, 연락처, email, 생일, 키, 몸무게
 */
public class _03_friend {

	// 필드
	private String name; // private = 접근제한자 / method나 생성자를 거치지 않고 _01_classprac0.java에서 직접적으로 f1.name =
							// "";을
							// 통해 담는것이 불가능
	private String phone;
	private String email;
	private int birth;
	private double height;
	double weight;

	public _03_friend(String name, String phone) { // public을 private로 바꿀 수 있긴 함
		this.name = name;
		this.phone = phone;
	}
	
	public String getname() { // setname은 설정하기 위한 것으로 가져오려면 다시 private에 걸리기 때문에 return을 작성해줌
		return name;
	}
	
	public String phone() {
		return phone;
	}
	
	public void setemail(String email) { // 우클릭 -> source -> generate getters 들어가면 private 규칙 자동 변환해줌
		this.email = email;
	}
	
	public String getemail() {
		return email;
	}

	public void setbirth(int birth) {
		this.birth = birth;
	}
	
	public int getbirth() {
		return birth;
	}

	public void setheight(double height) {
		if (height < 0) {
			System.out.println("-------------------------");
			System.out.println("잘못된 키의 값이 입력되었습니다.");

			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public double getheight() {
		return height;
	}

	public void showinfo() {
		System.out.println("이름 : " + name + " | 연락처 : " + phone);
		System.out.printf("email : %s\n생일 : %d\n키 : %f\n몸무게 : %f", email, birth, height, weight);

	}

}
