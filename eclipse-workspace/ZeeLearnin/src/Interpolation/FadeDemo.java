package Interpolation;






public class FadeDemo {
	
	
	static long startTime = 0L;
	static long elapsedTime, elapsedSeconds, elapsedMinutes, secondsDisplay = 0L;
	static float elapsedTimeF, seconds, t, minimum, maximum = 0.0f;
	static float timeLimit = 10;
	
	
	/*
	 *  A function that acts as a timer. Counts up to ten seconds.
	 * 
	 */
	public static void Timer()
	{
		
		while(elapsedSeconds < timeLimit) {
			elapsedTime = System.currentTimeMillis() - startTime;
			elapsedSeconds = elapsedTime / 1000;
			secondsDisplay = elapsedSeconds % 60;
			elapsedMinutes = elapsedSeconds / 60;
			seconds = (float)elapsedSeconds;
			
			
			//System.out.println(secondsDisplay);
			//System.out.println(pingpong(seconds,3)); |SUCCESS|
			//System.out.println(lerp(minimum,maximum, t));
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		startTime = System.currentTimeMillis();
		
		//Timer();
		
		//Schedule a job for the event-dispatching thread;
		//creating and showing this application's GUI.
		
		
		
	}
	
	/*
	 * Makes a value go back an fourth. 
	 *  WIP
	 *  WORKS but is a Work in Progress
	 */
	static float pingpong(float time, float length)
	{
		float l = 2 * length;
		float t = time % l;
		
		
		if(t >= 0 && t < length) {
			return t;
		}else {
			return l - t;
		}
		
	    
	}
	
	// WIP
	static float fade(float time, float value) {
		value -= time / 2;
		
		return value;
	}
	
	// WIP
	static float lerp(float a, float b, float f) {
		return a + f * (b-a);
		
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
