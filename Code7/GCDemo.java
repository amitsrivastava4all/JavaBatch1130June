class G
{
	String t;
	int w;
	G(String t, int w){
		this.t= t;
		this.w = w;
		System.out.println("Object Born...");
	}
}
public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G obj = new G("Hello",10);
		obj = null; // 1st way
		
		
		G obj2 = new G("Hello",20);
		G obj3 = new G("Ok",20);
		obj3 = obj2;  //2nd way
		
		if(10>2){
			G obj4 = new G("Hi",30);
		}
		
	}

}
