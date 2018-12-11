package Concurrency.Executors;

public class Task implements Runnable{
	private int counter;
	
	public Task(int counter) {
		this.counter = counter;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int incrementCtr() {
		return counter++;
	}
	
	@Override
	public void run() {
		incrementCtr();
		System.out.println("Counter value:"+counter);
	}
	

}
