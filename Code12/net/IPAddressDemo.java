import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.getHostName()+" "+inet.getHostAddress());
		System.out.println("Enter the Host Name");
		String hostname = new Scanner(System.in).next();
		InetAddress arr[] = InetAddress.getAllByName(hostname);
		for(InetAddress a : arr){
			System.out.println(a);
		}
		

	}

}
