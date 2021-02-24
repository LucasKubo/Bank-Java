package entities;

public class BankAccount {
	private int accountNumber;
	private String holder;
	private double balance;
	
	public BankAccount (int numberAccount, String holder) {
		this.accountNumber = numberAccount;
		this.holder = holder;
	}
	
	//sobrecarga no construtor
	public BankAccount (int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	//Getters e setters - apenas para os que serão necessários ter acesso
	public int getNumberAccount() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	//Métodos da conta
	public void withdraw (double value) {  //método para sacar dinheiro
		this.balance -= (value+5);
	}
	
	public void deposit(double value) { //método para depositar dinheiro
		this.balance += value;
	}
	
	public String toString() {
		return "Account " + 
				accountNumber + ","+
				" Holder: " + holder + ","+
				" Balance: $ " + String.format("%.2f\n", balance);	
	}
}
