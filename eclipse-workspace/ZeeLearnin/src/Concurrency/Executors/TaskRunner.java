package Concurrency.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task task1 = new Task(1);
		Task task2 = new Task(2);
		
		ExecutorService exServicePool = Executors.newFixedThreadPool(2);
		exServicePool.execute(task1);
		exServicePool.execute(task2);
		exServicePool.shutdown();
		while(!exServicePool.isTerminated()) {}
		System.out.println("Finished all threads");
	}

}
