package MutableAndImmutable_Exercise;

import java.util.ArrayList;

public class Trainer {

	private String name;
	private ArrayList<String> streamsTaught = new ArrayList<String>();
	
	public Trainer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getAllStreams() {
		return streamsTaught;
	}
	
	public void addStream(String stream) {
		streamsTaught.add(stream);
	}

}
