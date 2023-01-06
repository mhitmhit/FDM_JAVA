package walkThroughExercise;

public class demo_of_Implemented_Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyRunnableClass myRunnable = new MyRunnableClass();
		
		Thread thread0 = new Thread(myRunnable);
		
		thread0.start();

		System.out.println("ending " + Thread.currentThread().getName());
	}

}
