import java.io.DataInputStream;
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
		DataInputStream ds = new DataInputStream(is);
		String data = ds.readUTF();
		System.out.println("Data is "+data);
		/*int singleByte = is.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = is.read();
		}*/
		ds.close();
		is.close();
		
		socket.close();

	}

}
