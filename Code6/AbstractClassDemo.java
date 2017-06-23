//class L1
//{
//	private L1(){
//		
//	}
//}
//class L2 extends L1
//{
//	
//}
abstract  class Loan
{
	void applyForLoan(){
		System.out.println("Loan Apply...");
	}
	abstract void duration();
	abstract void loanPercentage();
}
class HomeLoan extends Loan
{

	@Override
	void duration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void loanPercentage() {
		// TODO Auto-generated method stub
		
	}
	
}
class AutoLoan extends Loan{

	@Override
	void duration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void loanPercentage() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loan loan = new Loan();
		Loan loan = new HomeLoan();
		//HomeLoan loan = new HomeLoan();
		loan.applyForLoan();
	}

}
