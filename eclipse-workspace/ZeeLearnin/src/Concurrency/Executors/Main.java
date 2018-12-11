package Concurrency.Executors;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//UploadResultTest1();
		//UploadResult2();
		UploadResultWithLockTest();
	}
	//Using Runnable
	public static void UploadResultTest1() {
		ExecutorService exServicePool = Executors.newFixedThreadPool(2);
		int noOfUploadTasks = 3;
		for(int i = 1; i<= noOfUploadTasks;i++) {
			UploadResult uploadRunnable = new UploadResult("UploadResult:"+i);
			exServicePool.execute(uploadRunnable);
		}
		exServicePool.shutdown();
		while(!exServicePool.isTerminated()) {}
		System.out.println("Finished all threads");
	}
	//Using Callable and Future
	public static void UploadResult2() {
		ExecutorService exService = Executors.newSingleThreadExecutor();
		UploadResult2 uploadCallable = new UploadResult2("Batch 1");
		Future<Boolean> future = exService.submit(uploadCallable);
		try {
			System.out.println("Upload completed: "+future.get());
		}catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void UploadResultWithLockTest() {
		ExecutorService exServicePool = Executors.newFixedThreadPool(2);
		int noOfUploadTasks = 3;
		ReentrantLock lock = new ReentrantLock();
		UploadResultWithLock uploadRunnable = new UploadResultWithLock(lock);
		for(int i = 1; i<= noOfUploadTasks;i++) {
			exServicePool.execute(uploadRunnable);
		}
		exServicePool.shutdown();
		while(!exServicePool.isTerminated()) {}
		System.out.println("Finished all threads");
	}
}
