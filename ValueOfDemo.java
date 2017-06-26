
public class ValueOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ValueOf , Locale, abstract static, intern, trim
		String temp = "       Hello         ".trim();
		String temp2 = "Hello".intern();
		String test3 = new String("Hello").intern();
		
		
		if(test3==temp){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		
		int x = 100;
		String t = String.valueOf(x);
		String r = "100";
		int b ;
		b = Integer.parseInt(r);
		Integer bb = new Integer(1000);
		
		

	}

}
