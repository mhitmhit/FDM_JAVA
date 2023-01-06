package walkThroughExercise;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {

	private int count;
	private ReentrantLock reentrantLock = new ReentrantLock();
	private ReentrantReadWriteLock reetrantReadWriteLock = new ReentrantReadWriteLock();
	
	public ReentrantLock getReentrantLock() {
		return reentrantLock;
	}
	
	public ReentrantReadWriteLock getReentrantReadWriteLock() {
		return reetrantReadWriteLock;
	}
	
	public void increment() {
		count ++;
	}
	
	public void decrement() {
		count --;
	}
	
	public int getCount() {
		return count;
	}

}

