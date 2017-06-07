// Java OOPS Based (It start with Class)
// Class Name should be Start with Capital Letter
// Class Name Must be Start with Alpha and Can Follow Number
// U can use underscore and $ as special char
// dont use keyword name in class

class FirstClass{
// main is a entry point to every java prg
// public - access outside the package (JRE-->JVM access from outside)
// static - i will come in memory when class is loaded
// String is a predefine class
// String is a collection of chars, char []
// args is a variable name and it can be anything , [] it is an array type
// String args[] - it is a command line argument

public static void main(String args[]){
// System - It is a predefine class
// out - it is a predefine object of PrintStream class
// println- it is a method of PrintStream class
int a =100;  // 4 byte (Local Var Has to be Initalize Before use)
int b =200;
int c =  a + b;

System.out.println("Sum is  "+c);

}

}