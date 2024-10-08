package designPattern;


interface Shape extends Cloneable{

	Shape clone();
	void draw();
}



public class PrototypePattern {

	public static void main(String[] args) 
	{

		// Create original objects
		Circle originalCircle = new Circle(10);
		Rectangle originalRectangle = new Rectangle(20, 30);

		// Clone the objects
		Circle clonedCircle = (Circle) originalCircle.clone();
		Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

		// Modify the cloned objects if necessary
		// (In this simple example, we're not modifying them)

		// Draw the original and cloned shapes
		originalCircle.draw();      // Drawing a circle with radius 10
		clonedCircle.draw();        // Drawing a circle with radius 10

		originalRectangle.draw();   // Drawing a rectangle with width 20 and height 30
		clonedRectangle.draw();     // Drawing a rectangle with width 20 and height 30}





	}

}
