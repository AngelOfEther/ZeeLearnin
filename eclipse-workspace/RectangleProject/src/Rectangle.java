
public class Rectangle {
	
	private int length;
	private int width;
	
	public void calculatePerimeter() {
		System.out.println("perimeter is: " + 2 * (length + width));
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int value) {
		length = value;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
