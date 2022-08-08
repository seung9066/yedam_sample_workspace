package com.yedam05_coffee.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam05_coffee.common.DAO;

public class CoffeeDAO extends DAO {
	public static CoffeeDAO coffeeDao = null;

	private CoffeeDAO() {

	}

	public static CoffeeDAO getInstance() {
		return coffeeDao == null ? coffeeDao = new CoffeeDAO() : coffeeDao;
	}

	// 메뉴 조회
	public List<Coffee> getCoffee() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "select coffee_menu, coffee_price from coffee";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return list;
	}

	// 판매
	public int coffeeSales (String name) {
		int result = 0;
		try {
			conn();
			String sql = "update coffee set coffee_sales = coffee_sales+1 where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			result = pstmt.executeUpdate();
//			if (rs.next()) {
//				System.out.println("판매 완료");
//			} else {
//				System.out.println("판매 실패");
//			}
//			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
		
	}
	
	// 상세 조회
	public Coffee getDetailCoffee(String name) {
		Coffee coffee = null;
		try {
			conn();
			String sql = "select * from coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return coffee;
	}

	// 등록
	public int insertCoffee(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "insert into coffee(coffee_menu, coffee_price, coffee_explain) values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}

	
	// 삭제
	public int deleteMenu(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "delete from coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally	 {
			disconn();
		}
		return result;
	}
	
	
}
