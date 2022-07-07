package co.edu_03;

public class _03_class {
	public static void main(String[] args) {
		
		_03_class_friend f1 = new _03_class_friend("최승현", "010-3083-8066");
		f1.setemail("seoung9066@naver.com");
		f1.setbirth(951203);
		f1.setheight(180);
		f1.weight = 71.1;
		
		f1.showinfo();
		System.out.println();
		System.out.println(f1.getbirth()); // return 문이 있기 때문에 불러올 수 있음
		
	}

}
