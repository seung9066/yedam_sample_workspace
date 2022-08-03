package homework._0727_3;

public class Performance extends Culture {
	private String ge;

	public Performance(String title, int countd, int counta, String ge) {
		super(title, countd, counta);
		this.ge = ge;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println("공연제목 : " + getTitle());
		System.out.println("감독 : " + getCountd());
		System.out.println("배우 : " + getCounta());
		System.out.println("공연총점 : " + getTotalScore());
		System.out.println("공연평점 : " + getGrade());
	}
}
