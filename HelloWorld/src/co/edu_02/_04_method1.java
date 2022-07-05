package co.edu_02;

public class _04_method1 {

	public static void showInfo(String name, int age) {
		System.out.printf("반갑습니다. %s입니다. 나이는 %d입니다.\n", name, age);
	}
	
	public static void printstar(int times, String shape){
		for (int i=1; i<=times; i++) {
		System.out.print(shape);
		}
		System.out.println();
	}
	
	public static void print(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		showInfo("최승현", 28);
		showInfo("가나다", 22);
		printstar(5, "★");
		printstar(6, "☆");
		print(3, "I hate java, ");

	}

}
