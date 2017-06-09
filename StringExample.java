class StringExample{
public static void main(String args[]){
String a = "Hello User".intern(); // String Literal Way  (1 or 0 Object)
String c = "Hello User".intern();

Runtime r = Runtime.getRuntime();
System.out.println("Tot Mem "+r.totalMemory());
System.out.println("Free Mem "+r.freeMemory());
System.out.println("Used Mem "+(r.totalMemory()-r.freeMemory()));
for(int i = 1; i<=100000; i++){
String x = "Hello";
}
System.out.println("Tot Mem "+r.totalMemory());
System.out.println("Free Mem "+r.freeMemory());
System.out.println("Used Mem "+(r.totalMemory()-r.freeMemory()));
if(a==c)
{
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}
String b = new String("Hello User").intern();  // new object way 2 or 1 Objects
if(a==b){
System.out.println("Same Ref of a and b ");
}
else
{
System.out.println("Not Same Ref of a and b ");
}
//System.out.println("Main Call ");
//main(null);
}
}