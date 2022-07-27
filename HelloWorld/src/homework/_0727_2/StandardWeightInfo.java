package homework._0727_2;

public class StandardWeightInfo extends Human{
	

	public double getStandardWeight() {
		double S = 0;
		S = ((getHeight() - 100)*0.9);
		return S;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f, 표준체중 %.1f 입니다.",getName(),getHeight(),getWeight(),getStandardWeight());
	}
	
}
