package TutorialsPoint;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class FileIO_BufferedReader {

		public static void main(String args[]){
			
			
			BufferedReader br = null;
			//String flieName = "example.txt";
			FileReader fr;
			String line;
			
			try {
				//fr = new FileReader("example.txt");
				//br = new BufferedReader(fr);	
				br = new BufferedReader (new FileReader("/Users/Dr.Mokter/EclipseMacProjects/JavaCodes/src/example.txt"));
	
					while ((line = br.readLine()) != null)
					{
						System.out.println(line);
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
			System.out.println("Done");
		}
}

	