package homework._0727_2;

public class ObesityInfo extends StandardWeightInfo{
	
	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	
	public double getObesity() {
		double O = 0;
		O = (getWeight() - getStandardWeight())/getStandardWeight()*100;
		return O;
	}
	
	@Override
	public void getInformation() {
		
			if (getObesity() >= 25) {
				System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f 비만입니다.", getName(), getHeight(), getWeight());
			} else if (getObesity() < 0) {
				System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f 저체중입니다.", getName(), getHeight(),getWeight());
			} else {
				System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f 표준입니다.", getName(), getHeight(),getWeight());
			}	
		
	}



	

	
	

}
