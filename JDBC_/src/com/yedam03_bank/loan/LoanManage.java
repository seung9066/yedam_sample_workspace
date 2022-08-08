package com.yedam03_bank.loan;

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
			String sql = "insert into loan values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getLoanId());
			pstmt.setString(2, loan.getMemberId());
			pstmt.setDate(3, loan.getLoanDate());
			pstmt.setString(4, loan.getState());
			
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
}
