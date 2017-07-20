import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		final String SERVER_IP  = "localhost";
		final int PORTNO = 7111;
		Socket socket = new Socket(SERVER_IP,PORTNO);
		System.out.println("Client Up and Running...");
		InputStream is = socket.getInputStream();
		int singleByte = is.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		socket.close();

	}

}
