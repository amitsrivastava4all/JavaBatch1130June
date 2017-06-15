// S O L I D
// S - SRP 
// D - DRY
// OOPS - Encapsulation = Binding Member Variables + Member Methods into single unit
// e.g. class 
// Data Hiding 
// Good Encapsulation - private Member Variables + public Methods
/*
 
 */
/**
 * this is an employee class, this represent the emp things 
 * @author amit
 * @since 15th June 2017
 * @version 1.0
 */
public class Employee //extends Object {
{
  private int id;   // Instance Variable of a class
  private String name;
  private double salary;
  private boolean att;
  /**
   * this is a branch field contains branch info
   */
  private String branch;
  private String deptNo;
  private String phone;
  private String zipCode;
  private String email;
  private String deptName;
  private String city;
  private String state;
  private String streetAddress;
  private String pinCode;
  
  /*
   * Every Class By Default has Default Constructor
   * What is Constructor?
   * Constructor is same name as class name, and it is used to initalize
   * the instance variables
   * Constructor return nothing
   */
  public String getDataFromDB(){
	  return "Delhi";
  }
  
  public Employee(){
	  branch = getDataFromDB();
	 
	  
  }
  // Setter/ Getter
  
  
  public Employee(int id , String name, double salary){
	  this();
	  this.id = id;
	  this.name = name;
	  this.salary = salary;
	  //this.branch = "Delhi";
  }
  
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public boolean isAtt() {
	return att;
}

public void setAtt(boolean att) {
	this.att = att;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public String getDeptNo() {
	return deptNo;
}

public void setDeptNo(String deptNo) {
	this.deptNo = deptNo;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getZipCode() {
	return zipCode;
}

public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getStreetAddress() {
	return streetAddress;
}

public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
}

public String getPinCode() {
	return pinCode;
}

public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}



public int getId() {
	return id;
}

public double getHRA(){
	return salary * 0.30;
}

public double getDA(){
	return salary * 0.20;
}

public double getTA(){
	return salary * 0.10;
}

public double getPF(){
	return salary * 0.05;
}
/**
 * this is getNS , it is used to compute Net Salary 
 * the formula i used salary + hra + da + ta 
 * @return
 */
public double getNS(){
	return salary + getHRA() + getDA() + getTA() - getPF();
}

//  @Override
//  public int hashCode(){
//	  return name.length();
//  }
//  public void takeInput(int id , String name , double salary , boolean att){
//	  if(id>0 && salary>0){
//	  this.id = id;
//	  this.name = name;
//	  this.salary = salary;
//	  this.att = att;
//	  }
//	  else
//	  {
//		  System.out.println("Invalid Id or Salary , It Can't Be Negative...");
//	  }
//  }
  public String print(String delimeter){
	  CommonUtil cu = new CommonUtil();
	 return "Id "+id +delimeter+" Name "+cu.getProperCase(name)+delimeter+" Salary "+salary+delimeter + " Net Salary "+getNS();
  }
}
