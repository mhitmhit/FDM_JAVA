package inClass;

public class driver {

	public static void main(String[] args) {
		
		Runnable runnable = new CounterRunnable();
		
		// Create multiple threads that will share the same resource
		Thread thread0 = new Thread(runnable);
		Thread thread1 = new Thread(runnable);
		
		thread1.start();
		thread0.start();
		
		System.out.println("-----> " + Thread.currentThread().getName() + " Thread has finished");
		
	}

}
