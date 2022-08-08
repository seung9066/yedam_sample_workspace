package com.yedam03_bank.loan;

import java.util.ArrayList;
import java.util.List;

import com.yedam03_bank.common.DAO;

public class LoanManage extends DAO {
	private static LoanManage lm = null;
	
	private LoanManage() {
		
	}
	
	public static LoanManage getInstance() {
		if(lm == null) {
			lm = new LoanManage();
		}
		return lm;
	}
	
	public int insertLoan(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "insert into loan values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getLoanId());
			pstmt.setString(2, loan.getMemberId());
			pstmt.setDate(4, loan.getLoanDate());
			pstmt.setString(3, loan.getState());
			pstmt.setInt(5, loan.getLoanMoney());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public int updateLoan(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set state = ? where loan_id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getState());
			pstmt.setString(2, loan.getLoanId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public int updateMoney(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set loan_money = loan_money - ? where loan_id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loan.getLoanMoney());
			pstmt.setString(2, loan.getLoanId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}

	// join
	public List<Loan> getLoanInfo(String memberId) {
		List<Loan> list = new ArrayList<Loan>();
		Loan loan = null;
		try {
			conn();
			String sql = "select b.member_name member_name, l.loan_id loan_id, l.loan_money loan_money, l.loan_date loan_date\r\n"
					+ "from bankmember b join loan l\r\n"
					+ "on b.member_id = l.member_id\r\n"
					+ "where b.member_id = '?'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				loan = new Loan();
				loan.setMemberName(rs.getString("member_name"));
				loan.setLoanId(rs.getString("loan_id"));
				loan.setLoanMoney(rs.getInt("loan_money"));
				loan.setLoanDate(rs.getDate("loan_date"));
				list.add(loan);
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return list;
	}
	
}
