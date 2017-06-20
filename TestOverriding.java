class P1
{
	int x = 100;
	void show(){
		System.out.println("P1 Show..");
	}
	void print(){
	System.out.println("p1 print..");	
	}
}
class C1 extends P1
{
	int x = 200;
	@Override
	void show(){
		System.out.println("C1 Show..."+this.x);
	}
	void disp(){
		System.out.println("C1 Disp");
	}
}

public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 obj = new C1();
		System.out.println(obj.x );
		obj.show();
		//obj.disp();
		obj.print();
	}

}
