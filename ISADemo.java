class Account
{
	int id;
	String name;
	double balance;
	void openAccount(){
		System.out.println("Account Open...");
	}
	void accountStatus(){
		System.out.println("Account Active");
	}
	void withDraw(){
		System.out.println("Account Money WithDraw");
	}
	void deposit(){
		System.out.println("Account Money Deposit..");
	}
}
class SavingAccount extends Account
{
	@Override
	void withDraw(){
		super.withDraw();
		System.out.println("WithDraw with Limit of 50K");
	}
	void roi(){
		System.out.println("4% ROI in Saving Account...");
	}
}
class CurrentAccount extends Account
{
	void odLimit(){
		System.out.println("OD Limit 2 Lakh....");
	}
}
public class ISADemo {
	
	void caller(Account account){
		account.accountStatus();
		account.deposit();
		account.withDraw();
		//account.roi();
		if(account instanceof SavingAccount){
			//double rr = 100.0;
			//int hh = (int) rr; 
			SavingAccount sa = (SavingAccount)account;  // Downcasting
			sa.roi();
		}
		else
		if(account instanceof CurrentAccount){
			((CurrentAccount)account).odLimit();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ee = (int)90.20;
		//Upcasting
		ISADemo obj = new ISADemo();
		obj.caller(new SavingAccount());
		obj.caller(new CurrentAccount());
//		Account account = new SavingAccount();
//		account.accountStatus();
//		account.deposit();
//		account.withDraw();
//		//account.roi();
//		
//		account = new CurrentAccount();
//		account.accountStatus();
//		account.deposit();
//		account.withDraw();
		//account.odLimit();
		/*
		SavingAccount sa = new SavingAccount();
		sa.accountStatus();
		sa.deposit();
		//sa.withDraw();
		sa.withDraw();
		sa.roi();
		
		System.out.println("*********************");
		CurrentAccount ca = new CurrentAccount();
		ca.accountStatus();
		ca.deposit();
		ca.withDraw();
		ca.odLimit();*/

	}

}






