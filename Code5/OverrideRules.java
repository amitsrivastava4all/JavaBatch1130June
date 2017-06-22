class X
{
	int a,b,c;
}
class XPlus extends X
{
	int d, e;
}
class YY{
	int p,q,t;
}
class Parent2
{
	
	protected X show(){
		System.out.println("Parent2 Show...");
		X obj = new X();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		return obj;
	}
}
class Child2 extends Parent2
{
	@Override
	 public XPlus show(){
		System.out.println("Child2 Show...");
		XPlus obj = new XPlus();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		obj.d = 900;
		obj.e = 5454;
		return obj;
	}
}
public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
