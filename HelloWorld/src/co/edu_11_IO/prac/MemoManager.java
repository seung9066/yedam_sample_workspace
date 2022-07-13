package co.edu_11_IO.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 등록, 조회, 삭제, 목록

public class MemoManager {

	List<Memo> memoStorage = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat");

	// 싱글톤
	private static MemoManager instance = new MemoManager();

	private MemoManager() {
		// 파일 정보를 읽어 ArrayList에 담기
		readFromFile();
	}

	public static MemoManager getInstance() { // 인스턴스 할당시 MemoManager.getInstance를 통해 해야함
		return instance;
	}
	
	// 파일 -> 컬렉션
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file); // 가져와서
			ObjectInputStream ois = new ObjectInputStream(fis); // 변환해서

			memoStorage = (List<Memo>) ois.readObject(); // 담는다
	        ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 등록
	public void inputData() {
		
		System.out.print("메모 번호 >> ");
		int no = Integer.parseInt(scan.nextLine());
		System.out.print("작정날짜 >> ");
		String date = scan.nextLine();
		System.out.print("내용 >> ");
		String content = scan.nextLine();

		memoStorage.add(new Memo(no, date, content));
	}

	// 날짜별 조회
	public void search() {
		System.out.print("날짜 입력 >> ");
		String memodate = scan.nextLine();
		boolean isExist = false;
		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoStorage.get(i).getDate().equals(memodate)) {
				System.out.println(memoStorage.get(i).toString());
				isExist = true;
			}
		}
		if (!isExist) {
			System.out.println("해당 날짜에 메모가 없습니다.");
		}
	}

	// 삭제
	public void deleteData() {
		System.out.print("삭제할 번호 >> ");
		int delno = Integer.parseInt(scan.nextLine());
		boolean isExist = false;
		/*
		 * 반복자를 이용한 방법 
		 * Iterator<Memo> iter = memoStorage.iterator();
		 * while(iter.hasNext()) {
		 * Memo memo = iter.next(); if (memo.getNo() == delno) {
		 * iter.remove(); System.out.println("삭제 완료"); return; 
		 * 		} 
		 * }
		 * System.out.println("없는 번호");
		 */
		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoStorage.get(i).getNo() == delno) {
				memoStorage.remove(i);
				System.out.println("삭제 완료");
				isExist = true;
			}
		}
		if (!isExist) {
			System.out.println("없는 번호");
		}
	}
	// 목록
	public void list() {
		for(int i = 0; i < memoStorage.size(); i++) {
			System.out.print(memoStorage.get(i).getNo() + " / ");
		}
		System.out.println();
	}
	
	// 종료 및 파일저장
	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 객체처리 보조스트림 ObjectOutput(Input)Stream : ArrayList -> byte 변경
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(memoStorage); // 객체타입을 바이트타입으로 저장
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
