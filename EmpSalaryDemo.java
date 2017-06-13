import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EmpSalaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the EmpId ");
		int empId = scanner.nextInt();
		System.out.println("Enter the Employee Name");
		scanner.nextLine(); // Eat the \n coming from above
		String name = scanner.nextLine();
		String names[] = name.split(" ");
		String properName = "";
		for(String n: names){
			properName  += String.valueOf(n.charAt(0)).toUpperCase() 
			+ n.substring(1).toLowerCase()+" ";
		}
//		name= String.valueOf(name.charAt(0)).toUpperCase() 
//				+ name.substring(1).toLowerCase();
//		System.out.println(name);
		System.out.println(properName);
		//char e = name.charAt(0);  // name[0]
		//String singleChar = String.valueOf(e);
		//singleChar  = singleChar.toUpperCase();
		
		System.out.println("Enter the Basic Salary");
		double salary = scanner.nextDouble();
		Locale locale = new Locale("hi","IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedSalary = nf.format(salary);
		System.out.println("Salary "+formattedSalary);
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String formattedDate = df.format(date);
		System.out.println(formattedDate);
		
		scanner.close();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the DEPT");
//		String deptName = sc.next();
		
		

	}

}
