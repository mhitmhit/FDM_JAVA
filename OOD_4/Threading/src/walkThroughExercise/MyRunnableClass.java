package walkThroughExercise;

public class MyRunnableClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("ending " + Thread.currentThread().getName());
	}

}
