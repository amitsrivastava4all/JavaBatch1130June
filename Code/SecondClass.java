// Java OOPS Based (It start with Class)
// Class Name should be Start with Capital Letter
// Class Name Must be Start with Alpha and Can Follow Number
// U can use underscore and $ as special char
// dont use keyword name in class

strictfp class FirstClass{

public static void main(){
System.out.println(" I Will Not Call By JVM ");
}

// main is a entry point to every java prg
// public - access outside the package (JRE-->JVM access from outside)
// static - i will come in memory when class is loaded
// String is a predefine class
// String is a collection of chars, char []
// args is a variable name and it can be anything , [] it is an array type
// String args[] - it is a command line argument

 static public void main(String []arr){
 String message = "योग है ";
 //main();
 //System.out.println("Length is "+arr.length);
// System - It is a predefine class
// out - it is a predefine object of PrintStream class
// println- it is a method of PrintStream class
//int a =Integer.parseInt(arr[0]);  // 4 byte (Local Var Has to be Initalize Before use)
//int b =Integer.parseInt(arr[1]);
//int c =  a + b;
int sum = 0;
int r = 100;
int t = 200;
int number = 0;
//for(int i =0; i<arr.length; i++){
for(String s : arr){
try{
 number = Integer.parseInt(s);  // throw Exception (NumberFormatException)
}
catch(NumberFormatException e)
{
System.out.println("Only Number Allowed , U Enter Something Else , So it is Treated as 0 ");
number = 0;
}
sum = sum +  number; 
}
System.out.println(message+sum);

}

}