class T1{
	int x=100;
}
class T2 extends T1{
	int x = 200;
}
class T3 extends T2{
	int x = 300;
	T3(){
		int x = 400;
		int z = ((T1)this).x + ((T2)this).x + this.x + x;
		System.out.println(z);
		
	}
}
public class MultiLevelHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T3 obj = new T3();
		

	}

}
