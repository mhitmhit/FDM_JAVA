package walkThroughExercise;

public class demo_Interupt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("application starting");
		
		Thread backgroundProcess = new Thread(() -> {
			while(true) {
					System.out.println("running background process");
					//Thread.sleep(1000);
					if (Thread.interrupted()) {
						System.out.println("     thread interupted");
						break;
					}
				
			}
		});
		
		Thread foregroundProcess = new Thread(() -> {
			System.out.println("running foreground process");
		});
		
		backgroundProcess.start();
		
		foregroundProcess.start();
		
		foregroundProcess.join();
		
		backgroundProcess.interrupt();
		
		System.out.println("application terminating");
	
		
	}// end main
}
