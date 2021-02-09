class AccountMain{
public static void main(String[] args){
	Account data=new Account();
	data.setAccountName("Salman");
	data.setAccountId("18-36902-1");
	data.setBalance(5000);
	data.showAccountInfo();
	data.deposit(1000);
	data.showAccountInfo();
	data.withdraw(1000);
	data.showAccountInfo();

}
}