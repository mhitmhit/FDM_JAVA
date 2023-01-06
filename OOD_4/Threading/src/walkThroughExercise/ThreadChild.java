package walkThroughExercise;

public class ThreadChild extends Thread {
	
	public void run() {
		
		//System.out.println("starting " + getName());
		
		for (int count = 1; count <= 100; count ++) {
			//System.out.println(getName()+": "+ count);
		}
		
		System.out.println("ending "+getName());
	}

}
