package Interpolation;

import java.util.Calendar;
import java.util.Date;

/*TO-DO
 * 1. Look into Threads aka Runnable for Timer.
 * 
*/

public class FadeDemo implements Runnable {
	
	
	static long startTime = 0L;
	static long elapsedTime, elapsedSeconds, elapsedMinutes, secondsDisplay = 0L;
	static float elapsedTimeF, seconds, t, minimum, maximum = 0.0f;
	
	
	
	public static void Timer()
	{
		
		while(elapsedSeconds < 10) {
			elapsedTime = System.currentTimeMillis() - startTime;
			elapsedSeconds = elapsedTime / 1000;
			secondsDisplay = elapsedSeconds % 60;
			elapsedMinutes = elapsedSeconds / 60;
			seconds = (float)elapsedSeconds;
			
			minimum = -1.0f;
			maximum = 1.0f;
			System.out.println(secondsDisplay);
			//System.out.println(pingpong(seconds,3));
			//System.out.println(lerp(minimum,maximum, t));
			
			t += 0.5f * seconds;
			
			if (t > 1.0f){
	            float temp = maximum;
	            maximum = minimum;
	            minimum = temp;
	            t = 0.0f;
	        }
			else if(t <= -1.0f) {
	        	float temp = minimum;
	        	minimum = maximum;
	        	maximum = temp;
	        	t = 0.0f;
	        }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		startTime = System.currentTimeMillis();
		Date d = new Date();
		long currTime = d.getTime();
		
		
		
		Timer();
		//System.out.println(pingpong(elapsedSeconds,3));
		
		
	}
	
	static float pingpong(float t, float length)
	{
	    return t % length;
	}
	
	static float lerp(float a, float b, float f) {
		return a + f * (b-a);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	/*float ColorLerp(color a, color b, float time) {
		a = brightnessMax;
		b = brigtnessMin;
		f = rate?;
		
		Mathf.PingPong(Time.time,1);
		
		PingPong = PingPong(float t, float length);
		
		// PingPongs the value t, so that it is never larger than length and never smaller than 0.
		// The returned value will move back and forth between 0 and length.
		
		Time.time = Amount of time since start. 
		
		//return 
	}
	*/
	

}
//Lerp(min, max, time)
//t += 0.5f * Time.deltatime

/*
void fadeLEDS() {
analogWrite(STONE1, brightness);
analogWrite(STONE2, brightness);
analogWrite(STONE3, brightness);
analogWrite(STONE4, brightness);
analogWrite(STONE5, brightness);
analogWrite(STONE6, brightness);

brightness = brightness + fadeAmount;

if (brightness <= 0 || brightness >=255) {
  fadeAmount = -fadeAmount;
}

delay(30);
}
*/
