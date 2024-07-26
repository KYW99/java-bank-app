package bank.app;
/*
 * 날짜 : 2024/07/26
 * 이름 : 원기연
 * 내용 : java 수행평가
 */

public class Account{
	String ano;
	String owner;
	int balance;
	
	public Account(String ano, String owner, int balance){	
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
	}
	
	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
