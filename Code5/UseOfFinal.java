import java.lang.instrument.Instrumentation;

// S O L I D
// S - SRP , D - DRY
// O - Open Close
// Class is Open for Extension and Close for Modification

//final class Parent
class Parent
{
	private int x;
	
	private final void show(){
		System.out.println("Parent Show...");
	}
}
class Child extends Parent
{
	//@Override
	void show(){
		System.out.println("Child Show..");
	}
}
public class UseOfFinal {

	public static void premain(String w, Instrumentation ins){
		Child child = new Child();
		long size = ins.getObjectSize(child);
		System.out.println("Child Size is "+size);
		
	}
	public static void main(String[] args) {
		System.out.println("Main Call");
		// TODO Auto-generated method stub
		Child child = new Child();
//		final int MAX_POWER  = 150;
//		int currentPower = 10;
//		if(currentPower<MAX_POWER){
//			currentPower++;
//		}
		

	}

}
