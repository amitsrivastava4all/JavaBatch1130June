
public class A {
	int x, y;
	{
		System.out.println("I Will First");
	}
	{
		// init block
		System.out.println(" I am a Pre Constructor Call "+x + " "+y);
	}
	A(){
		System.out.println(" i am a  cons Call "+x +" "  +y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(x + " "+y);
		A obj = new A();
		//System.out.println(obj.x +" "+obj.y);

	}

}
