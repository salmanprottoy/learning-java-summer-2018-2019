class SavingsAccount extends Account{
	private double limit;
	public SavingsAccount(String accountId,String accountName,double balance,double limit){
		super(accountId,accountName,balance);
		this.limit=limit;
	}

	public void withdraw(double amount){
		if(amount<0){
			System.out.println("Withdrawal amount can not be negative!!");
		}
		else if(this.getAccountBalance()-amount<this.limit){
			System.out.println("Invalid amount!! \nminimum balance should be more than "+this.limit);
		}
		else{
			//this.setAccountBalance(this.getAccountBalance-amount);
			super.withdraw(amount);
		}
	}
}