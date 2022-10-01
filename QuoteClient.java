package cecs326.project1;

import java.net.*;
import java.io.*;

public class QuoteClient {
	public static void main(String args[]) {
		try {
			/* connect to the server via port 6017 on local host */
			Socket sock = new Socket(InetAddress.getLocalHost(), 6017);
		
			BufferedReader str = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			System.out.println(str.readLine());
		}
		catch (IOException ioe){
			System.err.println(ioe);
		}
	}
}
