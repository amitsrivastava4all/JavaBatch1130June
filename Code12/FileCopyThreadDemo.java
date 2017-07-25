import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileCopyJob  implements Runnable{
	private String source;
	private String dest;
	FileCopyJob(String source, String dest){
		this.source = source;
		this.dest = dest;
	}
	@Override
	public void run(){
		try{
			System.out.println(Thread.currentThread().getName()+" is Start....");
		FileInputStream fs= new FileInputStream(source);
		BufferedInputStream bs = new BufferedInputStream(fs);
		FileOutputStream fo = new FileOutputStream(dest);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		int singleByte = bs.read();
		
		while(singleByte!=-1){
			//Thread.sleep(1000);
			bo.write((char)singleByte);
			singleByte = bs.read();
		}
		bo.close();
		bs.close();
		fo.close();
		fs.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+" is End....");
	}
}
public class FileCopyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCopyJob job1 = new FileCopyJob("/Users/amit/Documents/FileOutput/x.png", "/Users/amit/Documents/FileOutput/xcopy.png");
		FileCopyJob job2 = new FileCopyJob("/Users/amit/Documents/FileOutput/y.png", "/Users/amit/Documents/FileOutput/ycopy.png");
		Thread worker1 = new Thread(job1,"XCOPY THREAD");
		Thread worker2 = new Thread(job2,"YCOPY THREAD");
		//worker1.setPriority(Thread.MAX_PRIORITY);
		//worker2.setPriority(Thread.MIN_PRIORITY);
		worker1.start();
		worker2.start();
		System.out.println("MAIN THREAD IS RUNNING............................"+Thread.currentThread().getName());
	}

}
