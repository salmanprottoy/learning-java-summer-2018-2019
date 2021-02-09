class SavingsAccount extends CheckingAccount{

	SavingsAccount(String accountName,String accountId,double balance){
		super(accountName,accountId,balance);
	}
	public void interestRate(){
		if(this.balance>1000)
		{
			System.out.println(("Interst is: "+this.balance*.06));
		}
		else
		{
			System.out.println("Interst is: "+(this.balance*.03));
		}
	}
	public double checkBalance(){
		return this.balance;
	}

	public void deposit(double amount){
		this.balance+=amount;
	}
	public void withdraw(double amount){
		if(this.balance>500){
			this.balance-=amount;
		}
		else{
			System.out.println("Unsuccessful withdraw!");
		}
	}
	public void showAccountInfo(){
		System.out.println("Name: "+getAccountName());
		System.out.println("Id: "+getAccountId());
		System.out.println("Balance: "+getBalance());
		interestRate();
		System.out.println("\n");
	}
}
