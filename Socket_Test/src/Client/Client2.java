package Client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {

	public static void main(String arg[]) throws Exception 
		{
		 Socket socket2 = new Socket("localhost",3456);
		 System.out.println("I am connecting ....");
		 InputStream is = socket2.getInputStream();
		 OutputStream os = socket2.getOutputStream();
		 /*
		 int mynb = 5 ;
		 System.out.println("I sent   "+mynb+" to the server ");
		 os.write(mynb);
		 int res;
		 res =is.read(); 
		 System.out.println("I got  this "+res);*/
		 BufferedReader bf = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
		 String req= bf.readLine();
		 System.out.println("i recive this requet : " + req);
		 
		 System.out.println("==== Now i'm gonna to sent a String ....");
		 PrintWriter pw = new PrintWriter(os,true);
		 pw.println("this just a test");
		 System.out.println("it's done ....");

		 socket2.close();
		}
	

}
