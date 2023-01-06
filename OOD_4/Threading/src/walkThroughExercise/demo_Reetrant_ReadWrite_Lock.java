package walkThroughExercise;

public class demo_Reetrant_ReadWrite_Lock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter counter = new Counter();
		
		Thread thread1 = new Thread(() -> {
			counter.getReentrantReadWriteLock().readLock().lock();
			System.out.println("thread 1 has the read lock");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				counter.getReentrantReadWriteLock().readLock().unlock();
				System.out.println("thread 1 has released the read lock");
			}
		});
		
		Thread thread2 = new Thread(() -> {
			counter.getReentrantReadWriteLock().readLock().lock();
			System.out.println("thread 2 has the read lock");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				counter.getReentrantReadWriteLock().readLock().unlock();
				System.out.println("thread 2 has released the read lock");
			}
		});
		
		Thread thread3 = new Thread(() -> {
			counter.getReentrantReadWriteLock().writeLock().lock();
			System.out.println("thread 3 has the write lock");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				counter.getReentrantReadWriteLock().writeLock().unlock();
				System.out.println("thread 3 has released the write lock");
			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();

		
		
	}

}
