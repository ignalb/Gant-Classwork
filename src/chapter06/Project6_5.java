package chapter06;

public class Project6_5 {

	public static void main(String[] args){
		BankAccount account1 = new BankAccount("Karel The Dog", 20);
		BankAccount account2 = new BankAccount("Bill Gates", 11.5e9);
		
		System.out.println(account1);
		System.out.println(account2);
		
		account2.withdraw(1e6);
		account1.deposit(1e6);
		
		System.out.println("\n" + account1);
		System.out.println(account2);
	}
}

class BankAccount {
	private String name;
	private double balance;
	
	public BankAccount(String name, double init){
		this.name = name;
		balance = init;
	}
	
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
	
	public void withdraw(double amount){
		balance -= amount;
	}
	public void deposit(double amount){
		balance += amount;
	}
	
	public String toString(){
		return String.format("%-16s : $%.2f", name, balance);
	}
}