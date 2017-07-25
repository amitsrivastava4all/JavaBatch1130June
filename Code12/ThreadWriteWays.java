//1st way
class Jobber implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}



public class ThreadWriteWays {

	public static void main(String[] args) {
		Jobber job = new Jobber();
		Thread worker = new Thread(job);
		//worker.setDaemon(true);
		worker.start();
		
		//2nd Way Anonymous Way
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("T1 Thread is Call...");
			}
		});
		t1.start();
		
		// 3rd Way
		Thread t2 = new Thread(()->System.out.println("Lambda Style..."));
		t2.start();
	}

}
