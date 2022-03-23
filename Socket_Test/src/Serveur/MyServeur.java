package Serveur;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServeur{

	public static void main(String arg[]) throws Exception 
	{   
		ServerSocket  serveur = new ServerSocket(6534);
		System.out.println("waiting for someone connecting .......");
		Socket socket1  = serveur.accept();
		InputStream is  = socket1.getInputStream();
		OutputStream os = socket1.getOutputStream();
		//***********************this for one octet
		/*System.out.println("waiting for an input ");
		int nb = is.read();
		System.out.println("Done I recive  "+nb);
		int res = nb *2;
		System.out.println("And i sent   "+res);
		os.write(res);*/
		//***********************this for more octet
		BufferedReader br = new BufferedReader( new InputStreamReader(is));
		System.out.println("waiting for some characters .......");
		String s =  br.readLine();
		System.out.println("itdone and i got this "+s);
		socket1.close();
	}
	
}
