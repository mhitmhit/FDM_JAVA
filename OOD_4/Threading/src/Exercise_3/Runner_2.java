package Exercise_3;

public class Runner_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("starting " +Thread.currentThread().getName());
		
		AverageCalculator averageCalculator = new AverageCalculator();
		
		FileReaderThread thread0 = new FileReaderThread(averageCalculator, "records1.txt");
		FileReaderThread thread1 = new FileReaderThread(averageCalculator, "records2.txt");
		
		Thread currentTotalThread = new Thread(()->{
				while(true) {
					try {
						System.out.println(averageCalculator.getTotal() + " " + averageCalculator.getCount());
						Thread.sleep(500);
					}catch(InterruptedException e) {
						// TODO Auto-generated catch block
						break;
					}
				}
			});
		
		thread0.start();
		thread1.start();
		currentTotalThread.start();
		
		thread0.join();
		thread1.join();
		
		System.out.println(averageCalculator.getTotal());
		System.out.println(averageCalculator.getCount());
		System.out.println(averageCalculator.calcluateAverage());
		
		currentTotalThread.interrupt();
		
		System.out.println("ending " + Thread.currentThread().getName());
	}

}
