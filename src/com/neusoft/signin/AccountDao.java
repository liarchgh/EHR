package com.neusoft.signin;

public interface AccountDao {
//	public void insertAccount(Account acc);
//	public void deleteAccount(String accountNo);
//	public void updateAccount(Account acc);
	public Account selectAccount(String accountNo);
}
