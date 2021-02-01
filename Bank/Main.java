class Main{
	
	public static void main(String []args){
	Account a=new CheckingAccount("Salman","18-36902-1",7000);
	
	Account b=new SavingsAccount("Prottoy","18-36087-1",900);
	
	a.showAccountInfo();
	b.showAccountInfo();
	a.withdraw(500);
	a.showAccountInfo();
	a.transfer(b,500);
	a.showAccountInfo();
	b.showAccountInfo();
	b.transfer(a,500);
	a.showAccountInfo();
	b.showAccountInfo();
	b.deposit(2300);
	b.showAccountInfo();
}}