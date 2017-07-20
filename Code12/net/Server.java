import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		final int PORTNO = 7111;
		ServerSocket server = new ServerSocket(PORTNO);
		System.out.println("Server Up and Running....");
		Socket socket =  server.accept();  // Handshaking
		System.out.println("Client Join....");
		System.out.println("Enter the Message Send to the Client...");
		String message = new Scanner(System.in).nextLine();
		OutputStream out = socket.getOutputStream();
		DataOutputStream ds = new DataOutputStream(out);
		ds.writeUTF(message);
		//out.write(message.getBytes());
		ds.close();
		out.close();
		socket.close();

	}

}
