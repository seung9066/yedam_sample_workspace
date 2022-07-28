package homework._0727_3;

public class app {
	public static void main(String[] args) {
		
		Culture M = new Movie("추격자", 7, 5, "스릴러");
		M.setTotalScore(5);
		M.setTotalScore(3);
		M.setTotalScore(4);
		
		Culture P = new Performance("지킬앤하이드", 9, 10, "뮤지컬");
		P.setTotalScore(5);
		P.setTotalScore(5);
		P.setTotalScore(5);
		P.setTotalScore(5);
		
		M.getInformation();
		System.out.println("======================");
		P.getInformation();
	}

}
