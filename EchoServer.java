package project1;
import java.net.*;
import java.io.*;

public class EchoServer{

	public static void main(String[] args){
		try {
			ServerSocket sock = new ServerSocket(6017);			
			
			/* now listen for connections */
			while (true) {
				Socket client = sock.accept();
				
				PrintWriter out = new PrintWriter(client.getOutputStream(), true);
				
				/* write the Date to the socket */
				out.println(new java.util.Date().toString());

				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

				String input;
				
				while((input = in.readLine()) != null) {
					out.println(input);
				}
				/* close the socket and resume listening for connections */
				client.close();
				sock.close();
				in.close();
				}
			}
	}
}