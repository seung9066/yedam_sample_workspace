package account;

import common.DAO;
import workout.Workout;

public class AccountDAO extends DAO {
	public static AccountDAO accountDao = null;

	private AccountDAO() {

	}

	public static AccountDAO getInstance() {
		return accountDao == null ? accountDao = new AccountDAO() : accountDao;
	}

	// 회원가입
	public int createAccount(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "insert into account values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getPw());
			pstmt.setString(3, account.getName());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}

	// 중복 아이디 방지
	public String compare(String account) {
		String id = "";
		try {
			conn();
			String sql = "select id from account where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				id = rs.getString("id");
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return id;
	}

	// 로그인
	public Account login(String id) {
		Account account = null;
		try {
			conn();
			String sql = "select * from account where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				account = new Account();
				account.setId(rs.getString("id"));
				account.setPw(rs.getString("pw"));
				account.setName(rs.getString("name"));
			} else {
				System.out.println("존재하지 않는 아이디 입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return account;
	}

	// 회원조회
	public int logincheck(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "select * from account where id = ? and pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getPw());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}

	// 탈퇴
	public int deleteAccount(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "delete from account where id = ? and pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getPw());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}
	
	// 탈퇴시 게시글 삭제
	public int deleteAcCt(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from workout where name = (select name from account where id = ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}
}
