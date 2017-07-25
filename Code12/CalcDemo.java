import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class ScCalc{
	ScCalc(){
		System.out.println("ScCalc Cons Call");
	}
	public int power(int x, int y){
		return (int)Math.pow(x, y);
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
}
class Calculator{
	Calculator(){
		System.out.println("Calculator Cons call");
	}
	private int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
	
}
public class CalcDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Type ScCalc or Calculator");
		String className = scanner.next();
		System.out.println("Type add for Addition");
		System.out.println("Type subtract for Subtraction");
		System.out.println("Type multiply for multiplicaiton");
		System.out.println("Type divide for division");
		System.out.println("Type pow for Power");
		String methodName = scanner.next();
		Object object = Class.forName(className).newInstance();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class,int.class);
		method.setAccessible(true);
		Object result = method.invoke(object, 10,20);
		System.out.println("Result is "+result);
	}

}
