public class Cylinder extends Circle{
	//construct private variable
	private double heigth;
	private double thick;

	public Cylinder(){//default constructor

		this(2.0 , 3.0, 0.1);
	}//constructor ends

	public Cylinder(double radius, double height, double thick){//constructor with parameters

		super(radius);
		this.heigth = height;
		this.thick = thick;
	}//constructor ends

	public double findVolume(){//returns calculated volume of cylinder

		return (Math.pow(getRadius(),2) * heigth * Math.PI) - (Math.PI * Math.pow((getRadius() - thick),2) * (heigth - (2 * thick)));
	}//method ends

	public double findSurfaceArea(){//returns calculated surface area of cylinder

		return (2 * Math.pow(getRadius(),2) * Math.PI) + ((2 * getRadius() * Math.PI) * heigth);
	}//method ends

	public double findWeigth(){//returns calculated weigth of box

		return findVolume() * ironDens;
	}//method ends

	public String toString(){//prints out String

		return super.toString() + "Cylinder: \nThe radius is " + getRadius() + "\nThe heigth is " + heigth +  "\nThe volume is " + findVolume() +
				"\nThe surface area is " + findSurfaceArea() + "\nThe weigth is " + findWeigth() + " kg";
	}//method ends
}//class ends