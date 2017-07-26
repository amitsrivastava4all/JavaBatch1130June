import java.io.Serializable;

class D implements Serializable{
	int e=100;
	int t = 1000;
}
class A implements Cloneable
{
	D obj = new D();
	int x,y;
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	void print(){
		System.out.println("X is "+x+" and Y is "+y+ " "+obj.e+" "+obj.t);
	}
}
public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.x = 100;
		obj.x++;
		obj.y = 200;
		obj.y++;
		A obj2 = (A)obj.clone();
		if(obj == obj2){
			System.out.println("Same Ref");
		}
		else{
			System.out.println("Not Same Ref");
		}
		obj2.obj.e = 99999;
		obj2.x = 999;
		obj.print();
		obj2.print();
		
			
		

	}

}
