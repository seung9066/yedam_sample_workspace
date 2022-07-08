package co.edu_06_interfaces;

public class _02_Mysql implements _02_Dao{

	@Override
	public void insert() {
		System.out.println("Mysql 입력합니다.");
	}

	@Override
	public void update() {
		System.out.println("Mysql 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("Mysql 삭제합니다.");
	}
	

}
