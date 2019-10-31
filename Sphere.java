public class Sphere extends Circle{
		//construct private variables
	private double thick;

	public Sphere(){//default constructor

		this(2.0, 0.1);
	}//constructor ends

	public Sphere(double radius, double thick){//constructor with parameters
		//get value from this and super class
		super(radius);
		this.thick = thick;
	}//constructor ends

	public double findVolume(){//returns calculated volume of sphere

		return ((4./3) * Math.pow(getRadius(),3) * Math.PI) - ((4./3) * (getRadius() - thick) * (getRadius() - thick) * (getRadius() - thick) * Math.PI);
	}//method ends

	public double findSurfaceArea(){//returns calculated surface area of sphere

		return  Math.pow(getRadius(),2) * 4 * Math.PI;
	}//method ends

	public double findWeigth(){//returns calculated weigth of sphere

		return findVolume() * ironDens;
	}//method ends

	public String toString(){//prints out String

		return super.toString() + "Sphere: \nThe radius is " + getRadius() +  "\nThe volume is " + findVolume() +
				"\nThe surface area is " + findSurfaceArea() + "\nThe weigth is " + findWeigth() + " kg";
	}//method ends
}//clas ends