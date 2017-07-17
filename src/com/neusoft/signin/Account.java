package com.neusoft.signin;

public class Account {
	private String accountNo;
	private String password;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String account) {
		this.accountNo = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Account(String accountNo, String password) {
		super();
		this.accountNo = accountNo;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [account=" + accountNo + ", password=" + password + "]";
	}
}
