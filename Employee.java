// S O L I D
// S - SRP 
// D - DRY
// OOPS - Encapsulation = Binding Member Variables + Member Methods into single unit
// e.g. class 
// Data Hiding 
// Good Encapsulation - private Member Variables + public Methods
public class Employee //extends Object {
{
  private int id;   // Member Variable of a class
  private String name;
  private double salary;
  private boolean att;
  private String branch;
  private String deptNo;
  private String phone;
  private String zipCode;
  private String email;
  
//  @Override
//  public int hashCode(){
//	  return name.length();
//  }
  public void takeInput(int id , String name , double salary , boolean att){
	  if(id>0 && salary>0){
	  this.id = id;
	  this.name = name;
	  this.salary = salary;
	  this.att = att;
	  }
	  else
	  {
		  System.out.println("Invalid Id or Salary , It Can't Be Negative...");
	  }
  }
  public void print(){
	  System.out.println("id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Att "+att);
		System.out.println("***************************");
  }
}
