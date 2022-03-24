package Client;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String arg[]) throws Exception 
	{
		
	 Socket socket2 = new Socket("localhost",6534);
	 System.out.println("I am connecting ....");
	 PrintWriter    pw = new PrintWriter   (socket2.getOutputStream(),true);
	 
	 Scanner scanner = new Scanner(System.in);
		System.out.print("write something : ");
		String nb = scanner.next();
	 System.out.println("I sent   '"+nb+"' to the server ");
	 pw.println(nb);

	 


	 socket2.close();
	}
}
