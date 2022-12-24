package Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("problem 1------------");
		File poemFile = new File("poem.txt");
		FileReader fReader = null;
		BufferedReader bReader = null;
		
		int counter =0;
		
		try {
			fReader = new FileReader(poemFile);
			bReader = new BufferedReader(fReader);
			while(bReader.ready()) {
				final String line = bReader.readLine();
				for (int i=0; i <line.length(); i++) {
					if (line.toLowerCase().charAt(i) == 'e') {
						counter++;
					}
				}
				System.out.println(line + " " + counter);
				counter =0;
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
