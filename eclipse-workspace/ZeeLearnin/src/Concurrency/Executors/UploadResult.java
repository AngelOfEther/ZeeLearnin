package Concurrency.Executors;

public class UploadResult implements Runnable{
	private String taskName;
	
	public UploadResult(String name) {
		taskName = name;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) "+ taskName);
		
		try {
			Thread.sleep(1000*2);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Thread.currentThread().getName() + " (End) " + taskName);
	}

}
