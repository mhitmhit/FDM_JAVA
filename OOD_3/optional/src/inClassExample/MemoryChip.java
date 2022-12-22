package inClassExample;

public class MemoryChip {
	
	private String model;
	
	public MemoryChip(String model) {
		super();
		this.model = model;
	}	

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MemoryChip [model=" + model + "]";
	}
	
	public void accessData() {
		System.out.println("accessing data of memory chip");
	}
	
}
