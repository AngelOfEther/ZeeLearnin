package Concurrency.Executors;

import java.util.concurrent.Callable;

public class UploadResult2 implements Callable<Boolean> {
	private String taskName;
	public UploadResult2(String name) {
		taskName = name;
	}

	@Override
	public Boolean call() throws Exception{

		System.out.println(Thread.currentThread().getName() + " (Start) "+ taskName);
		Boolean retValue = null;
		try {
			Thread.sleep(1000*2);
			retValue = Boolean.TRUE;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			retValue = Boolean.FALSE;
		}
		System.out.println(Thread.currentThread().getName() + " (End) " + taskName);
		return retValue;
	}
	
}
