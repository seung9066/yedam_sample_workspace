package com.yedam04_product.app;

import java.util.Scanner;

import com.yedam04_product.product.ProductService;

public class Application {
	Scanner sc = new Scanner(System.in);
	ProductService ps = new ProductService();
	
	public Application() {
		start();
	}
	
	private void start() {
		while (true) {
			System.out.println("1. 상품 조회 | 2. 상품 상세 조회 | 3. 점포별 상품 조회 | 4. 상품 등록 | 5. 상품 삭제 | 6. 매출 | 9. 종료");
			System.out.print("입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				ps.getProduct();
			}else if (menu == 2) {
				ps.getDetailProduct();
			}else if (menu == 3) {
				ps.getStoreProduct();
			}else if (menu == 4) {
				ps.insertProduct();
			}else if (menu == 5) {
				ps.deleteProduct();
			}else if (menu == 6) {
				ps.calProduct();
			}else if (menu == 9) {
				System.out.println("종료...");
				break;
			}
		}
	}
}
