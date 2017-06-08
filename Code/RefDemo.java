class RefDemo
{
public static void main(String args[]){
int x = 100;
int y = 100;
if(x==y){
}
String a = new String("amit");
String b = new String("amit");
//b = a;
if(a.equals(b)){
System.out.println("Same value");
}
else
{
System.out.println("not Same value ");
}
if(a==b){
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}
}
}