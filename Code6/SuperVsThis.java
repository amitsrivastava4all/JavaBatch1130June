class Person
{
int age;
String name;
String companyName;
int x = 90;
	Person(){
		companyName = "XYZ";
		System.out.println("Person Default Cons Call");
	}
	Person(String name, int age){
		this();
		this.name = name;
		this.age = age;
		System.out.println("Person Param Cons Call");
	}
}
class Customer extends Person
{
	int x = 100;
	int id;
	double balance;
	int points;
	Customer(){
		super("Ram",21);
		// super();
		points = 10;
		
		System.out.println("Customer Default Cons Call");
	}
	Customer(int id , double balance){
		this();
		this.id = id;;
		this.balance = balance;
	}
	Customer(int id, double balance, int x){
		this(id, balance);
		int r = super.x + this.x + x;
		
		System.out.println("Customer Param Cons Call "+r);
	}
	
	void print(){
		System.out.println("Company Name "+companyName);
		System.out.println("NAme "+name);
		System.out.println("AGe "+age);
		System.out.println("Id "+id);
		System.out.println("Balance "+balance);
		System.out.println("Points "+points);
	}
}
public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1001,9000,1);
		customer.print();

	}

}
