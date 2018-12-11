package Multithreading;

public class RaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racer racer = new Racer();
		Thread turtleThread = new Thread(racer, "Turtle");
		Thread rabbitThread = new Thread(racer, "Rabbit");
		turtleThread.start();
		rabbitThread.start();
	}

}
