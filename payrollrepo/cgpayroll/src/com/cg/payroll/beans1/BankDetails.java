package com.cg.payroll.beans1;

public class BankDetails {

	 private int accountNo,IFSCode;
	private String bankName;
	public BankDetails() {
	
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getIFSCode() {
		return IFSCode;
	}
	public void setIFSCode(int iFSCode) {
		IFSCode = iFSCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public BankDetails(int accountNo, int iFSCode, String bankName) {
		super();
		this.accountNo = accountNo;
		IFSCode = iFSCode;
		this.bankName = bankName;
	}
	
	
	
}
