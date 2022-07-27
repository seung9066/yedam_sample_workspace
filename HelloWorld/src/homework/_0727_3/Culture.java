package homework._0727_3;

public abstract class Culture {
	public String title;
	public int countd;
	public int counta;
	int countw;
	int TotalScore;

	public Culture(String title, int countd, int counta) {
		this.title = title;
		this.countd = countd;
		this.counta = counta;
	}

	public void setTotalScore(int score) {
		TotalScore += score;

	}

	public String getGrade() {
		int avg = 0;
		avg = TotalScore / countw;
		String star = "☆".repeat(avg);
		return star;
	}

	public abstract void getInformation();

}
