package inClass;

public class CounterRunnable implements Runnable {

	@Override
	public void run() {
		
		int upperLimit = 100;
		
		for (int i=1; i < upperLimit; i++) {
			//System.out.println("                                   " +Thread.currentThread().getName() + " count is " + i);
		}
		
		System.out.println(Thread.currentThread().getName() + " finished counting");

	}

}
