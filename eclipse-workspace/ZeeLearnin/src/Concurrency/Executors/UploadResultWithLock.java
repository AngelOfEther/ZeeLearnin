package Concurrency.Executors;

import java.util.concurrent.locks.ReentrantLock;

public class UploadResultWithLock implements Runnable {
	private ReentrantLock lock;
	private int resultCount;
	
	public UploadResultWithLock(ReentrantLock lock) {
		this.lock = lock;
	}
	
	public void run() {

		System.out.println(Thread.currentThread().getName() + " (Start) - Results uploaded: "+ resultCount);
		
		try {
			lock.lock();
			Thread.sleep(1000*2);
			resultCount++;
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}finally {
			lock.unlock();
		}
		System.out.println(Thread.currentThread().getName() + " (End) - Results uploaded: " + resultCount);
	}

}
