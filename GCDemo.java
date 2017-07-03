class G
{
	String t;
	int w;
	G(String t, int w){
		this.t= t;
		this.w = w;
		System.out.println("Object Born...");
	}
	static G disp(){
		G obj = new G("",1);
		return obj;
	}
	static G refVar;
	@Override
	protected void finalize(){
		refVar = this;
		System.out.println("Good Bye World..."+this.w);
	}
}
public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G obj = new G("Hello",10);
		obj.w++;
		obj = null; // 1st way
		System.gc();
		
		
		
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
		obj = G.refVar;
		obj.w++;
		System.out.println("Now Value is "+obj.w);
		/*
		G obj2 = new G("Hello",20);
		G obj3 = new G("Ok",20);
		obj3 = obj2;  //2nd way
		
		if(10>2){
			G obj4 = new G("Hi",30);
		}
		*/
	}

}
