package walkThroughExercise;

public class demo_ReentrantLock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Counter counter = new Counter();
		
		Thread thread1 = new Thread(() -> {
			for (int count = 1; count <= 1000000; count++) {
				counter.getReentrantLock().lock(); // get the lock
				try {
					counter.increment();
				} finally {
					counter.getReentrantLock().unlock(); // release the lock
				}	
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int count = 1; count <= 1000001; count++) {
				counter.getReentrantLock().lock(); // get the lock
				try {
					counter.decrement();
				} finally {
					counter.getReentrantLock().unlock(); // release the lock
				}	
			}
		});
		
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
		
		System.out.println(counter.getCount());
		
	}

}
