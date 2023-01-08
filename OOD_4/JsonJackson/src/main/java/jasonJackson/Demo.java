package jasonJackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

	public static void main(String[] args) {
		
		
		// serializing
		
		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File("trainee.json");
		File file2 = new File("trainee2.json");
		Trainee trainee = new Trainee(1000, "john doe");
		
		try {	
			// basic way to write
			mapper.writeValue(file, trainee);
			// pretty writing
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, trainee);
		
		
		} catch (StreamWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		// deserializing
		
		try {
			Trainee traineeFromFile = mapper.readValue(file2, Trainee.class);
			System.out.println(traineeFromFile);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}// end of main

}
