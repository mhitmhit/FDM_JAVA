package walkThroughExercise;

public class demo_Racing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		
		Thread thread1 = new Thread(() -> {
			for (int count = 1; count <= 1000000; count ++) {
				counter.increment();
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int count = 1; count <= 1000000; count ++) {
				counter.decrement();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(counter.getCount());

	}

}
