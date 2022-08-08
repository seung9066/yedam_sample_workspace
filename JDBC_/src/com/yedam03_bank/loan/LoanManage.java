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
	
	public 
	
}
