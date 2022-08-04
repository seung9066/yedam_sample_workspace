package co1.prac_Map_dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapApp {
	/*
	 * Map = key값과 value값을 가짐
	 * Map<k, v>
	 * 1. 홍길동, 아버지 2. 홍길동, 어머니 -> 아버지 값 사라짐(어머니로 덮어써짐) -> 중복된 key를 가질 수 없다.
	 */
	
	Scanner scan = new Scanner(System.in);
	
	HashMap<String, String> map = new HashMap<>();
	
	String select = "";
	
	public MapApp() {
		run();
	}
	
	private void run() {
		while(!select.equals("9")) {
			System.out.println("1. 단어 등록 | 2. 단어 전체 조회 | 3. 단어 검색 | 4. 단어 수정 | 5. 단어 삭제 | 9. 종료");
			System.out.print("입력 >> ");
			select = scan.nextLine();
			// 단어 등록
			if (select.equals("1")) {
				String word = "";
				while (true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					System.out.print("입력 >> ");
					word = scan.nextLine();
					if (word.toLowerCase().equals("q")) {
						break;
					}
					System.out.print("뜻 입력 >> ");
					String mean = scan.nextLine();
					map.put(word, mean);
				}			
			} 
			// 단어 전체 조회
			else if (select.equals("2")) {
				if (map.size() == 0) {
					System.out.println("저장된 단어가 없습니다.");
				} else {
					System.out.println("********** 단어장 **********");
					for (String key : map.keySet()) { // key값을 하나씩 가져옴
						String value = map.get(key); // key값의 value값을 하나씩 가져옴
						System.out.println(key + " : " + value);
					}
				}
			}
			// 단어 검색
			else if (select.equals("3")) {
				if (map.size() == 0) {
					System.out.println("저장된 단어가 없습니다.");
				} else {
					System.out.print("단어 입력 >> ");
					String key = scan.nextLine();
					if (map.containsKey(key)) { // key가 map에 존재하는가
						String value = map.get(key);
						System.out.println(key + " : " + value);
					} else {
						System.out.println("저장되지 않은 단어입니다.");
					}
				}
			}
			// 단어 수정
			else if (select.equals("4")) {
				if (map.size() == 0) {
					System.out.println("저장된 단어가 없습니다.");
				} else {
					System.out.print("수정할 단어 입력 >> ");
					String key = scan.nextLine();
					if (map.containsKey(key)) {
						System.out.print("수정할 뜻 >> ");
						String value = scan.nextLine();
						map.put(key, value);
					} else {
						System.out.println("저장되지 않은 단어입니다.");
					}
				}
			}
			// 단어 삭제
			else if (select.equals("5")) {
				if (map.size() == 0) {
					System.out.println("저장된 단어가 없습니다.");
				} else {
					System.out.println("1. 한건 삭제 | 2. 전체 삭제");
					System.out.print("입력 >> ");
					String menu = scan.nextLine();
					if (menu.equals("1")) {
						System.out.print("삭제할 단어 >> ");
						String key = scan.nextLine();
						map.remove(key); // 삭제를 하고
						if (!map.containsKey(key)) { // 삭제된 값이 map에 없으면
							System.out.println("삭제 완료!");
						} else {
							System.out.println("저장되지 않은 단어입니다.");
						}
					} else if (menu.equals("2")) {
						map.clear(); // map의 모든 데이터 삭제
						if (map.size() == 0) {
						System.out.println("전체 삭제 완료");
						} else {
							System.out.println("삭제되지 않았습니다.");
						}
					} else  {
						System.out.println("잘못된 번호 입력");
					}
				}
			} else if (select.equals("9")){
				System.out.println("프로그램 종료");
			} else {
				System.out.println("잘못된 번호 입력");
			}
		}
		
				
	}
	
}
