package com.yedam05_coffee.coffee;

import java.util.List;
import java.util.Scanner;

import com.yedam01.member_singletone.Member;
import com.yedam01.member_singletone.MemberManagement;

public class CoffeeService {
	Scanner sc = new Scanner(System.in);
	
	public void getcoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffee();
		for(Coffee coffee : list) {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu() + "가격 : " + coffee.getCoffeePrice());
		}
	}
	
	public void getDetailCoffee() {
		Coffee coffee = new Coffee();
		System.out.print("메뉴 입력 >> ");
		String name = sc.nextLine();
		coffee = CoffeeDAO.getInstance().getDetailCoffee(name);
		System.out.println("메뉴 : " + coffee.getCoffeeMenu() + " 가격 : " + coffee.getCoffeePrice() + " 설명 : " + coffee.getCoffeeExplain());
	}
	
	// 등록
	public void insertCoffee() {
		Coffee coffee = new Coffee();
		System.out.print("메뉴 >> ");
		String name = sc.nextLine();
		coffee.setCoffeeMenu(name);
		
		System.out.print("가격 >> ");
		int price = Integer.parseInt(sc.nextLine());
		coffee.setCoffeePrice(price);
		
		System.out.print("설명 >> ");
		String explain = sc.nextLine();
		coffee.setCoffeeExplain(explain);
		
		int result = CoffeeDAO.getInstance().insertCoffee(coffee);
		if(result == 1) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}
	
	// 판매
	public void calCoffee() {
		System.out.print("메뉴 >> ");
		String name = sc.nextLine();
	
		int result = CoffeeDAO.getInstance().coffeeSales(name);
		if (result == 1) {
			System.out.println("판매 완료");
		} else {
			System.out.println("판매 실패");
		}
		
	}
	
	// 삭제
	public void deleteCoffee() {
		System.out.print("삭제할 커피 메뉴 >> ");
		String menu = sc.nextLine();
		
		int result = CoffeeDAO.getInstance().deleteMenu(menu);
		
		if(result == 1) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}
	}
	
	public void calCoffee1() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffee();
		int sum = 0;
		for (Coffee coffee : list) {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu() + "판매갯수 : " + coffee.getCoffeeSales() + "판매 금액 : " + (coffee.getCoffeeSales()*coffee.getCoffeePrice()));
		}
		
	}
	
}
