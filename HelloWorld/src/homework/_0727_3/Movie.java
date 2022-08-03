package homework._0727_3;

public class Movie extends Culture {
	private String ge;

	public Movie(String title, int countd, int counta, String ge) {
		super(title, countd, counta);
		this.ge = ge;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println("영화제목 : " + getTitle());
		System.out.println("감독 : " + getCountd());
		System.out.println("배우 : " + getCounta());
		System.out.println("영화총점 : " + getTotalScore());
		System.out.println("영화평점 : " + getGrade());
	}

}
