public abstract class Rectangle extends GeometricObjectOblig4{
	//construct private variables
	private double length;
	private double width;

	public Rectangle(){//default constructor

		this(2.0,3.0);
	}//constructor ends

	public Rectangle(double length, double width){//constructor with parameters
		//get value from this class
		this.length = length;
		this.width = width;
	}//constructor ends

	public double getLength(){//returns value from variable

		return length;
	}//method ends

	public void setLength(double length){//set new value for variable

		this.length = length;
	}//method ends

	public double getWidth(){//returns value from variable

		return width;
	}//method ends

	public void setWidth(double width){//set new value for variable

		this.width = width;
	}//method ends

	public double findArea(){//returns calculated area of rectangle

		return length * width;
	}//method ends

	public double findCircumference(){//returns calculated circumference of rectangle

		return 2 * (length + width);
	}//method ends

	public String toString(){//prints out String when called from cylinder

		return "Rectangle: \nThe length is " + length + "\nThe width is " + width+ "\nThe area is " + findArea() +  "\nThe circumference is " + findCircumference() + "\n";
	}//method ends
}//class ends