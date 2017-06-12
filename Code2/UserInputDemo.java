import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		//String name = scanner.nextLine();
		String name = scanner.next();
		System.out.println("Your Name is "+name);
		System.out.println("Enter the Age ");
		int age = scanner.nextInt();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Age is "+age+" Salary "+salary);
		//System.in;  // in it is a predefine object , InputStream class
	}

}
