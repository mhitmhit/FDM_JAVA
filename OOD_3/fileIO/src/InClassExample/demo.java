package InClassExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo {

	public static void main(String[] args) {
		
		
		// file writer
		
		
		File myFile = null;
		FileWriter fWriter = null;
		BufferedWriter bWriter = null;
		try {
			myFile = new File("filename.txt");
			myFile.createNewFile();
			fWriter = new FileWriter(myFile);
			bWriter = new BufferedWriter(fWriter);
			
			bWriter.write("I tripped on my shoelace\r\n" + 
					"And I fell up-\r\n" + 
					"Up to the rooftops,\r\n" + 
					"Up over the Town,\r\n" + 
					"Up past the tree tops,\r\n" + 
					"Up over the mountains,\r\n" + 
					"Up where the colors\r\n" + 
					"Blend into the the sounds.\r\n" + 
					"But it got me so dizzy\r\n" + 
					"When I looked around.\r\n" + 
					"I got sick to my stomach \r\n" + 
					"And then I threw down.\r\n" + 
					"\r\n" + 
					" \r\n" + 
					"\r\n" + 
					"-Shel Silverstein");
			System.out.println("written into the file successfully ------");
		} catch (IOException e) {
			System.out.println("file creation failed");
		} finally {
			try {
				bWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// file Reader
		
		
		File poemFile = new File("poem.txt");
		FileReader fReader = null;
		BufferedReader bReader = null;
		
		try {
			fReader = new FileReader(poemFile);
			bReader = new BufferedReader(fReader);
			while(bReader.ready()) {
				final String line = bReader.readLine();
				System.out.println(line);
			}	
		} catch (Exception e) {
			
		} finally {
			try {
				bReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
