package com.yedam03_bank.account;

import com.yedam03_bank.common.DAO;

public class AccountManage extends DAO {

	private static AccountManage am = new AccountManage();

	private AccountManage() {

	}

	public static AccountManage getInstance() {
		return am;
	}

	// 계좌 개설
	public int insertAccount(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "insert into account (account_id, member_id) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getAccountId());
			pstmt.setString(2, account.getMemberId());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 입출금
	public int updateMoney(Account account, int cmd) {
		int result = 0;
		try {
			conn();

			// 현재 잔고 가져오기
			String sql1 = "select balance from account where account_id = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, account.getAccountId());
			rs = pstmt.executeQuery();

			int balance = 0;

			if (rs.next()) {
				balance = rs.getInt("balance");
			}

			// 잔고 계산
			if (cmd == 1) { // 입금
				account.setBalance(balance + account.getBalance());

				String sql = "update account set balance = ? where account_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, account.getBalance());
				pstmt.setString(2, account.getAccountId());
				result = pstmt.executeUpdate();
			} else if (cmd == 2) { // 출금
				if (balance >= account.getBalance()) {
					account.setBalance(balance - account.getBalance());

					String sql = "update account set balance = ? where account_id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, account.getBalance());
					pstmt.setString(2, account.getAccountId());
					result = pstmt.executeUpdate();
				} else {
					System.out.println("잔고가 부족합니다.\n 현재 잔고 : " + balance + " 원");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 계좌 해지
	public int delAccount(String accountId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from account where account_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountId);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}

		return result;
	}

	// 계좌 이체
	public void transferMoney(String toAccount, String fromAccount, int balance) {
		int result = 0;
		try {
			conn();
			String sql1 = "update account set balance = balance - ? where account_id = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, balance);
			pstmt.setString(2, fromAccount);
			result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("이체 중");
				
				String sql = "update account set balance = balance + ? where account_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, toAccount);
				
				int result2 = pstmt.executeUpdate();
				if (result2 == 1) {
					System.out.println("계좌 이체 완료");
				} else {
					System.out.println("계좌 이체 실패");
				}
			} else {
				System.out.println("이체 실패");
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}

	}

}
