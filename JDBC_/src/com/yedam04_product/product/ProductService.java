package com.yedam04_product.product;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	Scanner sc = new Scanner(System.in);

	// 상품 조회(이름, 가격)
	public void getProduct() {
		List<Product> list = ProductDAO.getInstance().getProduct();
		for (Product product : list) {
			System.out.println("===================================");
			System.out.println("상품명 : " + product.getProductName() + "\n가격 : " + product.getProductPrice());
			System.out.println("===================================");
		}
	}

	// 상세 조회
	public void getDetailProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		for (Product product : list) {
			System.out.println("===================================");
			System.out.println("상품명 : " + product.getProductName() + "\n가격 : " + product.getProductPrice()
					+ "\n상품 설명 : " + product.getProductExplain() + "\n상품 ID : " + product.getProductId() + "\n상품 판매량 : "
					+ product.getProductSales() + "\n진열 점포 : " + product.getStores());
			System.out.println("===================================");
		}
	}

	// 점포별
	public void getStoreProduct() {
		System.out.print("점포 >> ");
		String store = sc.nextLine();
		List<Product> list = ProductDAO.getInstance().getStoreProduct(store);

		System.out.println("점포명 : " + list.get(0).getStores());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("===================================");
			System.out.println("상품명 : " + list.get(i).getProductName() + "\n가격 : " + list.get(i).getProductPrice()
					+ "\n상품 설명 : " + list.get(i).getProductExplain() + "\n상품 ID : " + list.get(i).getProductId() + "\n상품 판매량 : "
					+ list.get(i).getProductSales());
			System.out.println("===================================");
		}

	}
	
	// 등록
	public void insertProduct() {
		Product product = new Product();
		System.out.print("상품명 >> ");
		String productName = sc.nextLine();
		product.setProductName(productName);
		
		System.out.print("상품ID >> ");
		String productId = sc.nextLine();
		product.setProductId(productId);
		
		System.out.print("가격 >> ");
		int productPrice = Integer.parseInt(sc.nextLine());
		product.setProductPrice(productPrice);
		
		System.out.print("상품설명 >> ");
		String productExplain = sc.nextLine();
		product.setProductExplain(productExplain);
		
		System.out.print("판매량 >> ");
		int productSales = Integer.parseInt(sc.nextLine());
		product.setProductSales(productSales);
		
		System.out.print("진열점포 >> ");
		String productStore = sc.nextLine();
		product.setStores(productStore);
		
		int result = ProductDAO.getInstance().insertProduct(product);
		if(result == 1) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}
	
	// 삭제
	public void deleteProduct() {
		System.out.print("삭제할 상품 ID >>");
		String productId = sc.nextLine();
		
		int result = ProductDAO.getInstance().deleteProduct(productId);
		
		if (result == 1 ) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}
	}
	
	// 상품별 판매 갯수, 판매 금액
	public void calProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		int sum = 0;
		for(Product product : list) {
			System.out.println("===================================");
			System.out.println("상품명 : " + product.getProductName());
			System.out.println("상품 판매 개수 : " + product.getProductSales());
			System.out.println("판매 금액 : " + (product.getProductPrice()*product.getProductSales()));
			System.out.println("===================================");
			sum += product.getProductPrice()*product.getProductSales();
		}
		System.out.println("총 판매 금액 : " + sum + " 원");
	}
	
	
	
}
