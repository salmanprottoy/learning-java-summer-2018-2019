class CreditAccount extends Account{
	private double negativeLimit;
	public CreditAccount(String accountId,String accountName,double balance,double limit){
		super(accountId,accountName,balance);
		this.negativeLimit=limit;
	}

	public void withdraw(double amount){
		if(amount<0){
			System.out.println("Withdrawal amount can not be negative!!");
		}
		else if(this.getAccountBalance()-amount<this.negativeLimit){
			System.out.println("Invalid amount!! \nminimum limit should be "+this.negativeLimit);
		}
		else{
			//this.setAccountBalance(this.getAccountBalance-amount);
			super.withdraw(amount);
		}
	}
}