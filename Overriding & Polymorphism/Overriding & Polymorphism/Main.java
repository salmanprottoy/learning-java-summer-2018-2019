class Main{
	public static void main(String[] args) {
		// Account a1=new Account("1001A","Shakib",2000);
		// Account b1=new Account("9009B","Tamim",3000);
		// a1.transfer(b1,500);
		// a1.showInfo();
		// b1.showInfo();

		Account a1=new SavingsAccount("1001A","Shakib",2000,500);
		a1.withdraw(1300);
		a1.showInfo();

		a1=new CreditAccount("7777B","Tamim",2000,-500);
		a1.withdraw(2300);
		a1.showInfo();
	}
}