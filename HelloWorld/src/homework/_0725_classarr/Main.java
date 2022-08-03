package homework._0725_classarr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Product[] pro = null;
		Scanner sc = new Scanner(System.in);
		int menuNo = Integer.parseInt(sc.nextLine());
		boolean run = true;
		
		while (run) {
			System.out.println("=====================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=====================================================");
			System.out.print("선택> ");

			switch (menuNo) {
			case 1:
				System.out.println("상품 수 입력> ");
				int count = Integer.parseInt(sc.nextLine());
				pro = new Product[count];
				break;
			case 2:
				for (int i = 0; i < pro.length; i++) {
					// pro[i]번째의 객체를 가지고 옴. Product pro = new Product();

					// 기본 생성자만 있을때
					pro[i] = new Product();

					System.out.println("상품입력> ");
					String name = sc.nextLine();
					pro[i].setName(name);

					System.out.println("상품 가격 입력> ");
					int price = Integer.parseInt(sc.nextLine());
					pro[i].setPrice(price);

					System.out.println("상품 수량 입력> ");
					int amount = Integer.parseInt(sc.nextLine());
					pro[i].setAmount(amount);

				}
				break;
			case 3:
				// 배열 타입으로 만들어진 변수
				// Product 객체
				for (Product product : pro) {
					System.out.println("상품명 : " + product.getName() + "상품 가격 : " + product.getPrice());
				}
				break;
			case 4:
				// 최고 가격을 가진 상품
				// 최고 가격을 제외한 상품 가격의 합

				int maxPro = 0; // 최고 가격을 비교하기 위한 변수
				int idx = 0; // 최고 가격을 가진 배열 인덱스
				int sum = 0; // 총 합계 변수
				for (int i = 0; i < pro.length; i++) {

					if (pro[i].getPrice() > maxPro) {
						maxPro = pro[i].getPrice();
					}
					sum += pro[i].getPrice();
				}
				sum -= maxPro;
				System.out.println("최고 가격을 뺀 상품 가격의 합: " + sum);

				break;

			case 5:
				System.out.println("프로그램 종료...");
				break;
			}
			
			run = false;

		}
	}
}
