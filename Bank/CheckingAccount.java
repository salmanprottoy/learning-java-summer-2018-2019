class CheckingAccount extends Account{
	
	CheckingAccount(String accountName,String accountId,double balance){
		super(accountName,accountId,balance);
	}
	public void payByCheque(Account rcv,double amount){
		balance-=amount;
		rcv.deposit(amount);
	}
	public double checkBalance(){
		return this.balance;
	}
	
	public void deposit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		if(this.balance>500){
			balance-=amount;
		}
	}

    public void showAccountInfo(){
		System.out.println("Name: "+getAccountName());
		System.out.println("Id: "+getAccountId());
		System.out.println("Balance: "+getBalance());
		System.out.println("\n");
	}

}