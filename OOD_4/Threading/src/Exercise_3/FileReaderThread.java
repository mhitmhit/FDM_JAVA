package Exercise_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderThread extends Thread{
	
	private AverageCalculator averageCalculator;
	private String fileName;
	
	public FileReaderThread(AverageCalculator avgC, String fn) {
		averageCalculator = avgC;
		fileName = fn;
	}
	
	@Override
	public void run() {
		System.out.println("starting "+ Thread.currentThread().getName());
		File file = new File(fileName);
		FileReader fReader = null;
		BufferedReader bReader = null;
		String[] stringList;
		try {
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			while(bReader.ready()) {
				String line = bReader.readLine();
				stringList = line.split(",");
				for (String s:stringList) {
					averageCalculator.addToTotal(Integer.valueOf(s));	
				}
			}
		}catch(Exception e) {
			System.out.println("issue reading from file");
		}
		System.out.println("ending "+ Thread.currentThread().getName());
	}
	
	
	
}
