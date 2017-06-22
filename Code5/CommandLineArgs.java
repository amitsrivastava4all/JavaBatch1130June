
public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(String i :args){
			sum = sum + Integer.parseInt(i);
		}
		System.out.println("Sum is "+sum);

	}

}
