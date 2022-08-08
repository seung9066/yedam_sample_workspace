package com.yedam05_coffee.app;

import java.util.Scanner;

import com.yedam05_coffee.coffee.CoffeeService;

public class Application {
	Scanner sc = new Scanner(System.in);
	
	CoffeeService cs = new CoffeeService();
	
	public Application() {
		start();
	}
	
	private void start() {
		while (true) {
			System.out.println("1. 메뉴 조회 | 2. 메뉴 상세 조회 | 3. 메뉴 등록 | 4. 판매 | 5. 메뉴 삭제 | 6. 매출 | 7. 종료");
			System.out.print("입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				cs.getcoffee();
			} else if (menu == 2) {
				cs.getDetailCoffee();
			} else if (menu == 3) {
				cs.insertCoffee();
			} else if (menu == 4) {
				cs.calCoffee();
			} else if (menu == 5) {
				cs.deleteCoffee();
			} else if (menu == 6) {
				cs.calCoffee1();
			} else if (menu == 7) {
				System.out.println("종료");
				break;
			}
		}
	}
	
}
