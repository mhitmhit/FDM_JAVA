package Exercise_3;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		
		AverageCalculator averageCalculator = new AverageCalculator();
		String fileName = "filename.txt";
		
		FileReaderThread thread0 = new FileReaderThread(averageCalculator, fileName);
		
		thread0.start();
		thread0.join();
		System.out.println(averageCalculator.getTotal());
		System.out.println(averageCalculator.getCount());
		System.out.println(averageCalculator.calcluateAverage());
		
		
	}

}
