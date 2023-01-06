package Exercise;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {

	protected List<Thread> threads = new ArrayList();
	
	public void createThreads(int number){
		String threadName;
		for (int i=0; i<number; i++) {
			threadName = "thread" +i;
			Thread thread = new Thread(new MyRunnable());
			thread.setName(threadName);
			threads.add(thread);
		}
		
	}
	
	public void runThreads() {
		for (Thread t:threads) {
			t.start();
		}
	}
	
	
}
