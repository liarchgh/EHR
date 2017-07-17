package com.neusoft.signin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neusoft.demo.dao.ls.DBUtil;

public class AccountDaoImpl implements AccountDao{
	
//	public static void main(String[] args) {
//		String username = "lisu";
//		AccountDao checkAcc = new AccountDaoImpl();
//		Account acc = checkAcc.selectAccount(username);
//		System.out.println(acc.getPassword());
//	}

	@Override
	public Account selectAccount(String accountNo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select username, passwords from users where username = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, accountNo);
			rs = ps.executeQuery();
			if(rs.next()){
				return new Account(rs.getString(1), rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
