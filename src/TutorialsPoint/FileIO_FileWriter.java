package TutorialsPoint;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileIO_FileWriter {

		public static void main(String args[]){


			String flieName = "printwriter1.txt";

			PrintWriter pw = null;

			try {
				FileWriter fw = new FileWriter(flieName, true);
				
				
				pw = new PrintWriter(fw);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pw.println("Added.....\n");
			
			for (int i = 1; i<=10; i++)
			{
				pw.write("Hello there... I am line " + i + "\n");
				//System.out.println();
			}
			pw.close();

			System.out.println("Done");
		}

	}



