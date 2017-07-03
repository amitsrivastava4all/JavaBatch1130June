import java.util.LinkedList;

class D
{
	int w;
	String t;
	D(int w , String t){
		this.w = w;
		this.t= t;
	}
}
public class LoadOnHeap {

	public static void main(String[] args) throws Exception {
		System.out.println("Program Start...");
		LinkedList l = new LinkedList();
		while(true){
			D obj = new D(10,"Hello");
			l.add(obj);
			Thread.sleep(50);
		}
	}

}
