// SAM
class Parent4
{
	void show(){
		System.out.println("this is show of parent");
	}
	void print(){
		System.out.println("this is print of parent");
	}
}
@FunctionalInterface
interface Calc
{
	int compute(int x, int y);
	
}
interface Calculator{
	public int add(int x, int y);
	public int subtract(int x, int y);
	
}
//class MyCalc implements Calc
//{
//	@Override
//	public int compute(int x, int y){
//		return x + y;
//	}
//}
public class InterfaceUse {

	public static void main(String[] args) {
		Calculator c = new Calculator() {
			
			@Override
			public int subtract(int x, int y) {
				// TODO Auto-generated method stub
				 return x - y;
			}
			
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
		System.out.println(c.add(10, 20));
		System.out.println(c.subtract(10, 20));
		if(10>2){
		Calc obj = new Calc(){  //class _____ implements Calc
			@Override
			public int compute(int x , int y){
				return x * y;
			}
		};
		System.out.println(obj.compute(1000, 200));
		// Java 8 Lambda Expression
		Calc obj3 = (a,b)->a+b;	
		
		System.out.println(obj3.compute(10, 20));
		Calc obj4 = (a,b)->{
			System.out.println("A is "+a+" and B is "+b);
			int c1 = a * b;
			return c1;
		};
		System.out.println(obj4.compute(10, 5));
		}
		// TODO Auto-generated method stub
		/*MyCalc obj = new MyCalc();
		System.out.println(obj.compute(100, 200));
		MyCalc obj2 = new MyCalc();
		System.out.println(obj2.compute(1000, 200));
		*/
		Parent4 pp = new Parent4(){
			@Override
			void show(){
				super.show();
				System.out.println("this is child show...");
				this.display();
			}
			void display(){
				System.out.println("this is child display");
			}
		};
		pp.show();
		pp.print();
		//pp.display();
		
	}

}
