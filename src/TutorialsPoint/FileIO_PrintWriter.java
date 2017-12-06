package TutorialsPoint;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileIO_PrintWriter {

	public static void main(String args[]){


		String flieName = "printwriter1.txt";

		PrintWriter writer = null;

		try {
			writer = new PrintWriter(flieName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 1; i<=10; i++)
		{
			writer.write("Hello there... I am line " + i + "\n");
			//System.out.println();
		}
		writer.close();

		System.out.println("Done");
	}

}



