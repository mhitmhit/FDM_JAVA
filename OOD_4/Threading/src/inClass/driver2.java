package inClass;

public class driver2 {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = new CounterRunnable();
		
		// Create multiple threads that will share the same resource
		Thread thread0 = new Thread(runnable);
		Thread thread1 = new Thread(runnable);
		
		
		
		
		Thread thread2 = new Thread(() ->{
				for (int x=0; x < 50 ; x++) {
					//System.out.println("                                   " +"count x is: " + x);
				}
				System.out.println(Thread.currentThread().getName() + " is finished counting");
			});
		
		
		
		thread0.start();
		thread1.start();
		thread2.start();
		
		thread0.join();
		thread1.join();
		thread2.join();
		
		System.out.println(Thread.currentThread().getName() + " finished counting");
		
	}
}
