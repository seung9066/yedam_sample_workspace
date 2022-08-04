package co1.prac_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int selectnum = 0;

		// scan.nextLine() = String + CRLF(enter) -> enter키 기준 인식 -> int a = nextint()하면
		// 5 + enter

		while (selectnum != 9) {
			System.out.println("1. 단어 입력 | 2. 대소문자 변환 | 3. 단어 길이 | 4. 단어 자르기 | 5. 단어 자르기 2 | 9. 종료");
			System.out.print("입력 >> ");
			selectnum = Integer.parseInt(scan.nextLine());
			switch (selectnum) {
			case 1:
				while (true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					String word = scan.nextLine();
					if (word.equals("q")) {
						break;
					}
					list.add(word);
				}
				for (String str : list) {
					System.out.print(str + " ");
				}
				break;
			case 2:
				if (list == null || list.size() == 0) {
					System.out.println("등록된 단어가 없습니다.");
					return;
				}
				System.out.println("1. 대문자 | 2. 소문자");
				int select = Integer.parseInt(scan.nextLine());
				if (select == 1) {
					for (String str : list) {
						System.out.print(str.toUpperCase() + " ");
					}
					System.out.println();
				} else if (select == 2) {
					for (String str : list) {
						System.out.print(str.toLowerCase() + " ");
					}
					System.out.println();
				}
				break;
			case 3:
				StringBuilder sb = new StringBuilder();

				for (int i = 0; i < list.size(); i++) {
					sb.append(list.get(i));
				}

				System.out.println("입력한 문자의 총 길이 : " + sb.length());
				break;
			case 4:
				System.out.println("자르고 싶은 단어의 인덱스 입력");
				int i = 0;
				for (String str : list) {
					System.out.println(i + "번째 단어 : " + str);
					i++;
				}

				System.out.print("입력 >> ");
				int index = Integer.parseInt(scan.nextLine());
				String word = list.get(index);
				System.out.println(word.substring(Math.round(word.length() / 2))); // 단어의 가운데부터 끝까지 자르기 / Math.round = 소수점 없애기 위해 반올림
				break;
			case 5:
				System.out.print("단어 입력 >> ");
				String str = scan.nextLine();
				System.out.println("입력한 단어 : " + str);
				System.out.print("구분자 입력 >> ");
				String splits = scan.nextLine();
				String[] token = str.split(splits);
				for (String str2 : token) {
					System.out.println(str2);
				}
				break;
			}
		}

	}

}
