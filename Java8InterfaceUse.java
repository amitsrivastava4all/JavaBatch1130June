interface K1
{
	int X = 10; // public static final int X = 10;
	default void show(){
		System.out.println("K1 Show....");
	}
	void print();
}
interface K2 {
	int X = 20;
	default void show(){
		System.out.println("K2 Show...");
	}
}
interface K3 extends K1, K2
{
	@Override
	default void show(){
		K1.super.show();
		K2.super.show();
		
		System.out.println("K3 Show...");
	}
}


class K4 implements K3
{
	@Override
	public void print(){
		System.out.println("K4 Print...");
	}
}

public class Java8InterfaceUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K4 obj = new K4();
		obj.show();
		obj.print();

	}

}
