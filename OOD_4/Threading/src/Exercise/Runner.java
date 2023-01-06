package Exercise;

public class Runner {

	public static void main(String[] args) {
		
		
//		ThreadManager threadManager = new ThreadManager();
//		
//		threadManager.createThreads(2);
//		
//		threadManager.runThreads();
		
		ThreadManager threadManagerChild = new ThreadManagerChild();
		
		threadManagerChild.createThreads(3);
		
		threadManagerChild.runThreads();
		
		
	}

}
