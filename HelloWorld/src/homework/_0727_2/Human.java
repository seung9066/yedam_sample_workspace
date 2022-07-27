package homework._0727_2;

public class Human {
	public String name;
	public double height;
	public double weight;
	
	public Human() {
		
	}
	
	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.println(name + height + weight);
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}
