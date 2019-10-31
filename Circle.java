public abstract class Circle extends GeometricObjectOblig4{ //inherit from GO
	//private variable
	private double radius;

	public Circle(){//default constructor

		this(2.0);
	}//constructor ends

	public Circle(double radius){//constructor with parameters
		//get value from this class
		this.radius = radius;
	}//constructor ends

	public double getRadius(){//returns value from variable

		return radius;
	}//method ends

	public void setRadius(double radius){//sets new value for variable

		this.radius = radius;
	}//method ends

	public double findArea(){//returns calculated area of circle

		return Math.pow(radius,2) * Math.PI;
	}//method ends

	public double findCircumference(){//returns calculated cir of box

		return 2 * radius * Math.PI;
	}//method ends

	public String toString(){//prints out String when called from cylinder

		return "Circle: \nThe radius is " + radius + "\nThe area is " + findArea() +  "\nThe circumference is " + findCircumference() + "\n";
	}//method ends

}//method