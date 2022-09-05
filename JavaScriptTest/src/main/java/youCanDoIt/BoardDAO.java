package youCanDoIt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO extends DAO {
	private static BoardDAO mm = new BoardDAO();

	private BoardDAO() {

	}

	public static BoardDAO getInstance() {
		return mm;
	}
	
	
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		String sql = "select * from tbl_board";
		conn();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Board bo = new Board();
				bo.setBno(rs.getInt("bno"));
				bo.setTitle(rs.getString("title"));
				bo.setContent(rs.getString("content"));
				bo.setWriter(rs.getString("writer"));
				bo.setCreationDate(rs.getString("creation_date"));
				list.add(bo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public boolean deleteBoard(int bno) {
		try {
			conn();
			String sql = "delete tbl_board where bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconnect();
		}
		return false;
	}

	public Board insertBoard(Board board) {
		int result = 0;
		String sql1 = "select seq_board.nextval, to_char(sysdate, 'YYYY-MM-DD') from dual";
		int val =0;
		String da = "";
		try {
			conn();
			pstmt = conn.prepareStatement(sql1);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				val = rs.getInt(1);
				da = rs.getString(2);
			}
			
			String sql = "insert into tbl_board values(?,?,?,?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, val);
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, board.getWriter());
			pstmt.setString(5, da);
			
			result = pstmt.executeUpdate();
			
			board.setBno(val);
			board.setCreationDate(da);
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return board;
	}
}
