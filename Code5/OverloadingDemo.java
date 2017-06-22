import java.util.LinkedList;

/*
 * 1. No of Arguments Can be Change
 * 2. Type of Arguments can be Change
 * 3. Order of Arguments Can be Change
 */
class FlipKart{
	protected double search(double price){
		return 0.0;
	}
	public int  search(double price, String brand){
		return 0;
	}
	private String search(String brand, double price){
		return "";
	}
	void search(String brand){
		
	}
}
class ChildFlipKart extends FlipKart{
	void search(double price,String brand, String feedBack){
		
	}
}


class TypePromotion{
//	void show(long ...x){
//		long sum = 0;
//		for(long i : x){
//		sum+=i;	
//		}
//		System.out.println("Sum is "+sum);
//		//System.out.println("long var args....");
//	}
//	void show(int ...x){
//		System.out.println("int var args....");
//	}
//	void show(Long x){
//		System.out.println("Wrapper Class Long....");
//	}
//	void show(Integer x){
//		System.out.println("Wrapper Class Integer....");
//	}
//	void show(double x){
//		System.out.println("double....");
//	}
	void show(float x){
		System.out.println("float....");
	}
//	void show(long x){
//		System.out.println("long....");
//	}
	void show(short x){
		System.out.println("short....");
	}
//	void show(int x){
//		System.out.println("int....");
//	}
	void show(byte x){
		System.out.println("byte....");
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
//		int g = 1000; // Value Type
//		Integer g1 = 1000;  // Boxing
//		//Integer g1= new Integer(1000); // Boxing  // Ref Type
//		g1++; // UnBoxing --> Boxing
//		LinkedList<Integer> l = new LinkedList<>();
//		l.add(g1);
//		l.add(g);
//		int y1 = l.get(0);
		//Integer v = new Integer(g);
		//int k = v.intValue(); // UnBoxing
		//l.add(v); 
		// D.S Object Support
//		ChildFlipKart obj = new ChildFlipKart();
//		obj.search(9999);
		TypePromotion obj =  new TypePromotion();
		obj.show(10L);
		//obj.show((long)10);
//		obj.show();
//		obj.show(10);
//		obj.show(10,20);
//		obj.show(10,20,30);

	}

}




