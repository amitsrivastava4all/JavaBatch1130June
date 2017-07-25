import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

class A
{
	int x , y;
}
class B extends A
{
	int z ;
	int m;
	long t;
	private int ff;
	protected int bb;
	static int h;
	
	void print(){
		
	}
	void show(){
		
	}
}
public class RefWays {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		B obj = new B();
		Class cls2 = obj.getClass();  // Data + meta data
		System.out.println("Enter the Field Name to Change");
		String fieldName = new Scanner(System.in).next();
		Field f1  = cls2.getDeclaredField(fieldName);
		System.out.println("Enter the field value ");
		int fieldvalue  = new Scanner(System.in).nextInt();
		f1.setInt(obj, fieldvalue);
		System.out.println(cls2.getDeclaredFields().length);
		System.out.println(f1.get(obj));
		
		
		Class cls = B.class;  // Meta Data of a Class
		System.out.println("Method Count "+cls.getDeclaredMethods().length);
		for(Method m : cls.getDeclaredMethods())
		{
			System.out.println(m.getName());
		}
		System.out.println("Variable Count "+cls.getDeclaredFields().length);
		for(Field f : cls.getDeclaredFields()){
			if(Modifier.isPrivate(f.getModifiers())){
				System.out.println("Private "+f.getName());
			}
			else
			if(Modifier.isStatic(f.getModifiers())){	
				System.out.println("Static "+f.getName());
			}
			
		}
		System.out.println("Parent is "+cls.getSuperclass());
		System.out.println("Interfaces Count "+cls.getInterfaces().length);
		

	}

}
