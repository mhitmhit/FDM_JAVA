package walkThroughExercise;

public class Counter_Synchonized_Methods {

	private int count;
	
	public synchronized void increment() {
		count ++;
	}
	public synchronized void decrement() {
		count --;
	}
	public int getCount() {
		return count;
	}
}

