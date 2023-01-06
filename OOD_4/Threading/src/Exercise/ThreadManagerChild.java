package Exercise;

public class ThreadManagerChild extends ThreadManager{

	
	public void createThreads(int number) {
		for (int i=0; i<number; i++) {
			Thread thread = new Thread(
					() -> {
						System.out.println("inside thread manager child class - ending " + Thread.currentThread().getName());
					}
				);	
		thread.setName("thread"+i);
		super.threads.add(thread);
		System.out.println(thread.getName());
		}	
	}

	
}
