package TutorialsPoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO_Scanner {
		
		public static void main(String[] args)  {
		
			File fileName = new File ("/Users/Dr.Mokter/EclipseMacProjects/JavaCodes/src/people.txt");
			
			Scanner scan = null;
			
			try {
				scan = new Scanner (fileName);
				
				while(scan.hasNext()){
					System.out.println(scan.nextLine());
				}
			} 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		System.out.println("Done...");
		
		}
		

	}
