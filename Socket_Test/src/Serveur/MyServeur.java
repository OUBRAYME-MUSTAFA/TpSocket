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
	
	
		BufferedReader br = new BufferedReader( new InputStreamReader(is));
		System.out.println("waiting for some characters .......");
		String s =  br.readLine();
		System.out.println("it's done and i got this "+s);
		socket1.close();
	}
	
}
