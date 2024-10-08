package designPattern;

public class Rectangle implements Shape{

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public Shape clone() {
		return new Rectangle(this.width, this.height);
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle with width " + width + " and height " + height);
	}

}
