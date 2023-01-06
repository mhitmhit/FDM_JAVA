package walkThroughExercise;

public class demo_Join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Counter counter = new Counter();
		
		Thread thread1 = new Thread(
				() -> {
					for (int count = 1; count <=1000000; count++) {
						counter.increment();
					}
				}
		);
		
		thread1.start();
		thread1.join();
		
		System.out.println(counter.getCount());
		
		System.out.println("ending "+Thread.currentThread().getName());
	}// end of main method

}
