abstract class Account{
	public String accountName;
	public String accountId;
	public double balance;

	public Account(String accountName,String accountId,double balance)
	{	
		this.accountName=accountName;
		this.accountId=accountId;
		this.balance=balance;
	}
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
	public void transfer(Account rcv,double amount){
		balance-=amount;
		rcv.deposit(amount);
	}
	public void showAccountInfo(){
		System.out.println("Name: "+getAccountName());
		System.out.println("Id: "+getAccountId());
		System.out.println("Balance: "+getBalance());
		System.out.println("\n");
	}
	public void deposit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		balance-=amount;
	}

}