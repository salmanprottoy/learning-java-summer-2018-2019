class Account{
private String accountName;
private String accountId;
private double balance;

public void setAccountName(String accountName){
	this.accountName=accountName;
}
public void setAccountId(String accountId){
	this.accountId=accountId;
}
public void setBalance(double balance){
	this.balance=balance;
}
public String getAccountName(){
	return this.accountName;
}
public String getAccountId(){
	return this.accountId;
}
public double getBalance(){
	return this.balance;
}
public void showAccountInfo(){
	System.out.println(getAccountName());
	System.out.println(getAccountId());
	System.out.println(getBalance());
}
public void deposit(double amount){
	balance=balance+amount;
}
public void withdraw(double amount){
	balance=balance-amount;
}
}