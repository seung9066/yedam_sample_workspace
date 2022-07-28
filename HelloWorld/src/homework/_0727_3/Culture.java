package homework._0727_3;

public abstract class Culture {
	public String title;
	public int countd;
	public int counta;
	int countw;
	int TotalScore;

	public Culture() {

	}

	public Culture(String title, int countd, int counta) {
		this.title = title;
		this.countd = countd;
		this.counta = counta;
	}

	public void setTotalScore(int score) {
		countw ++;
		TotalScore += score;

	}

	public String getGrade() {
		int avg = 0;
		avg = TotalScore / countw;
		String star = "☆".repeat(avg);
		return star;
	}

	public String getTitle() {
		return title;
	}

	public int getCountd() {
		return countd;
	}

	public int getCounta() {
		return counta;
	}

	public int getCountw() {
		return countw;
	}

	public int getTotalScore() {
		return TotalScore;
	}
	
	public abstract void getInformation();
}