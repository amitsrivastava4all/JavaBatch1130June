import java.util.ResourceBundle;

class FasterProducer implements ShowAll,ShowSome
{
	public void withDraw(){
		System.out.println("Faster Show Me");
		this.display();
	}
	public void computeROI(){
		System.out.println("Faster Dont Show Me");
	}
	void display(){
		System.out.println("this is display");
	}
}
class Producer implements ShowAll,ShowSome
{
	public void withDraw(){
		System.out.println("Show Me");
	}
	public void computeROI(){
		System.out.println("Dont Show Me");
	}
}
interface ShowSome{
	void withDraw();
}
interface ShowAll{
	void withDraw();
	void computeROI();
}

class Factory{
	static ShowSome callProducer(){
		// Step - 1 Read the Property File
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String value = rb.getString("classname");
		Object object = null;
		try {
			object = Class.forName(value).newInstance(); // Upcasted Object
		} catch (Exception e){
			
		}
		
		//ShowSome s = new FasterProducer();
		return (ShowSome)object; //Downcasted
	}
//	static ShowAll callAllProducer(){
//		ShowAll s = new FasterProducer();
//		return s;
//	}
}

class Consumer
{
	void caller(){
		ShowSome p = Factory.callProducer();
		//ShowSome p = new FasterProducer();
		//p.computeROI();
		p.withDraw();
	}
}
class Consumer2{
	void caller2(){
		ShowSome p = Factory.callProducer();
		//ShowAll p = Factory.callAllProducer();
		//ShowAll p = new FasterProducer();
		//p.computeROI();
		p.withDraw();
	}
}
public class LoosleyCoupledApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer c = new Consumer();
		c.caller();
		Consumer2 cc = new Consumer2();
		cc.caller2();

	}

}
