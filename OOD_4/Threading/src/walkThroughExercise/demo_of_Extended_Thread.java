package walkThroughExercise;

public class demo_of_Extended_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		ThreadChild thread1 = new ThreadChild();
		ThreadChild thread2 = new ThreadChild();
		
		thread1.setName("thread1");
		thread2.setName("thread2");
		
		thread1.start();
		thread2.start();
		
		System.out.println("main method ends");
		
	}

}
