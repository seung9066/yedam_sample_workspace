package workout;

import java.util.ArrayList;
import java.util.List;

import account.Account;
import account.AccountService;
import common.DAO;

public class WorkoutDAO extends DAO {
	private static WorkoutDAO workoutDao = null;

	private WorkoutDAO() {

	}

	public static WorkoutDAO getInstance() {
		return workoutDao == null ? workoutDao = new WorkoutDAO() : workoutDao;
	}

	// 아이디 확인
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

	// 글 작성
	public int insertContent(Workout workout) {
		int result = 0;
		int result1 = 0;
		try {
			conn();
			String sql1 = "select date_ from workout where name = ? and date_ = to_char(sysdate, 'YYYY-MM-DD')";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, AccountService.accountinfo.getName());
			result1 = pstmt.executeUpdate();

			if (result1 == 1) {
				System.out.println("오늘은 이미 등록하셨습니다");
			} else {
				String sql = "insert into workout values ("
						+ "to_char(sysdate, 'YYYY-MM-DD'), (select name from account where id = ?), ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, AccountService.accountinfo.getId());
				pstmt.setInt(2, workout.getPoint());
				pstmt.setString(3, workout.getSports());
				pstmt.setString(4, workout.getMemo());

				result = pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}

	// 수정
	public void edit(String sports, String memo) {
		int result = 0;
		try {
			conn();
			if (sports.equals("")) {
				String sql = "update workout set memo = ? where name = ? and date_ = to_char(sysdate, 'YYYY-MM-DD')";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, memo);
				pstmt.setString(2, AccountService.accountinfo.getName());

				result = pstmt.executeUpdate();
				if (result == 1) {
					System.out.println("메모 수정 완료");
				} else {
					System.out.println("수정 실패");
				}
			} else if (memo.equals("")) {
				String sql = "update workout set sports = ? where name = ? and date_ = to_char(sysdate, 'YYYY-MM-DD')";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, sports);
				pstmt.setString(2, AccountService.accountinfo.getName());

				result = pstmt.executeUpdate();
				if (result == 1) {
					System.out.println("종목 수정 완료");
				} else {
					System.out.println("수정 실패");
				}
			} else {
				String sql = "update workout set sports = ?, memo = ? where name = ? and date_ = to_char(sysdate, 'YYYY-MM-DD')";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, sports);
				pstmt.setString(2, memo);
				pstmt.setString(3, AccountService.accountinfo.getName());

				result = pstmt.executeUpdate();
				if (result == 1) {
					System.out.println("종목/메모 수정 완료");
				} else {
					System.out.println("수정 실패");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
	}

	// 삭제
	public int delete(String date) {
		int result = 0;
		try {
			conn();
			String sql = "delete from workout where date_ = ? and name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, date);
			pstmt.setString(2, AccountService.accountinfo.getName());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}

	// 조회
	public List<Workout> find() {
		List<Workout> list = new ArrayList<>();
		Workout workout = null;
		try {
			conn();
			String sql = "select date_, name, point, sports, memo from workout";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				workout = new Workout();
				workout.setDate_(rs.getString("date_").substring(0, 10));
				workout.setName(rs.getString("name"));
				workout.setPoint(rs.getInt("point"));
				workout.setSports(rs.getString("sports"));
				workout.setMemo(rs.getString("memo"));
				list.add(workout);
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return list;
	}

	// 본인 작성 날짜만 표출
	public List<Workout> findme() {
		List<Workout> list = new ArrayList<>();
		Workout workout = null;
		try {
			conn();
			String sql = "select date_ from workout where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, AccountService.accountinfo.getName());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				workout = new Workout();
				workout.setDate_(rs.getString("date_").substring(0, 10));
				list.add(workout);

			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return list;
	}
}
