class Logic{
	static void myrun(){
		for(int i = 1; i<=5; i++){
			System.out.println("I is "+i+" "+Thread.currentThread().getName());
		}
		}
	}

class Job implements Runnable{
	int r;
	Logic logic = new Logic();
	@Override
	public  void run(){
		System.out.println("this is not Synch .. "+Thread.currentThread().getName());
		synchronized (Logic.class) {
			
		Logic.myrun();
		//synchronized(logic){
			//logic.myrun();
		}
		/*for(int i = 1; i<=5; i++,r++){
			System.out.println("R is "+r+"I is "+i+" "+Thread.currentThread().getName());
		}
		}*/
		System.out.println("this is not Synch2 .. "+Thread.currentThread().getName());
	}
}
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job = new Job();
		Thread worker = new Thread(job,"ram");
		worker.start();
		
		//Job job2 = new Job();
		Thread worker2 = new Thread(job,"shyam");
		worker2.start();
		System.out.println("Main Thread Start "+Thread.currentThread().getName());
		for(int j = 1; j<=5; j++){
			System.out.println("J is "+j+" "+Thread.currentThread().getName());
		}
		StringBuilder sb = new StringBuilder();
		synchronized (sb) {
			sb.append("Hello");
		}
	}

}
