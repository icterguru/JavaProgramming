package TutorialsPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// https://www.udemy.com/mcprogramming-advanced-java/#/lecture/890512

public class Socket_ClientSide {

	private Socket clientSocket;
	private BufferedReader input;
	private PrintStream output;

	private Scanner scan  = new Scanner(System.in);

	public static void main(String[] args) {
		Socket_ClientSide client = new Socket_ClientSide(); 

		client.run();	

		System.out.println("Client side done....");
	}

	public void run(){
		try {
			clientSocket = new Socket("localhost", 9999);

			output = new PrintStream(clientSocket.getOutputStream());
			
			output.println("Hello Server (I'm you client,  What's up??");

			input = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));

			while (clientSocket.isConnected())
			{

				String msg = input.readLine();
				System.out.println(msg);

				String reply = scan.nextLine();
				output.println(reply);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
