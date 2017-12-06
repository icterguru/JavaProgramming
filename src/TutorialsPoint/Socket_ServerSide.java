package TutorialsPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// https://www.udemy.com/mcprogramming-advanced-java/#/lecture/890512

public class Socket_ServerSide {

	private ServerSocket serverSocket;
	private Socket acceptSocket;
	private PrintStream output;
	private BufferedReader input;

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Socket_ServerSide server = new Socket_ServerSide(); 

		server.run();	

		System.out.println("Server Side Done....");
	}

	public void run(){
		try {
			serverSocket = new ServerSocket(9999);
			acceptSocket = serverSocket.accept();

			output = new PrintStream(acceptSocket.getOutputStream());
			input = new BufferedReader (new InputStreamReader (acceptSocket.getInputStream()));

			output.println("Hello Client (I'm the Server) What's up?");

			while (acceptSocket.isConnected())
			{

				String msg = input.readLine();
				System.out.println(msg);
				
				String reply = scan.nextLine();
				output.println(reply);
				
				//if(msg != null){ output.println("Welcome to the Server side..."); }
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
