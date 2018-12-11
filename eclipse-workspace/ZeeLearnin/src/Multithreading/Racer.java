package Multithreading;

public class Racer implements Runnable{

	public static String winner;
	
	public void race() {
		for (int distance=1;distance<=100;distance++) {
			System.out.println("Distance Covered by "+Thread.currentThread().getName()+" is: "+distance);
			if(distance == 30 && Thread.currentThread().getName().equals("Rabbit")) {
				try {
					System.out.println(Thread.currentThread().getName()+" is sleeping...ZzZzZzZzZ");
					Thread.sleep(1000*5);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			boolean isRaceWon = this.isRaceWon(distance);
			if(isRaceWon) {
				break;
			}
		}
	}
	
	private boolean isRaceWon(int totalDistanceCovered) {
		boolean isRaceWon=false;
		if((Racer.winner==null)&&(totalDistanceCovered==100)) {
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName;
			System.out.println("Winner is: "+Racer.winner);
			isRaceWon = true;
		}else if(Racer.winner==null) {
			isRaceWon = false;
		}else if(Racer.winner != null) {
			isRaceWon = true;
		}
		return isRaceWon;
	}
	@Override
	public void run() {
		this.race();
	}
}
