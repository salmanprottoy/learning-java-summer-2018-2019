class Account{
	private String accountId;
	private String accountName;
	private double balance;

	public Account(String accountId,String accountName,double balance){
		this.accountId=accountId;
		this.accountName=accountName;
		this.balance=balance;
	}

	public void setAccountId(String accountId){
		this.accountId=accountId;
	}

	public String getAccountId(){
		return this.accountId;
	}
	public void setAccountName(String accountName){
		this.accountName=accountName;
	}

	public String getAccountName(){
		return this.accountName;
	}

	public void setAccountBalance(double balance){
		this.balance=balance;
	}

	public double getAccountBalance(){
		return this.balance;
	}

	public final void withdraw(double amount){
		//this.balance=this.balance-amount;
		this.balance-=amount;
	}

	public void deposit(double amount){
		this.balance+=amount;
	}
	public void transfer(Account rec,double amount){
		this.withdraw(amount);
		rec.deposit(amount);
	}

	public void showInfo(){
		System.out.println("Account Id:"+this.accountId+
			"\nAccount Name:"+this.accountName+"\nBalance:"+this.balance);
	}
}