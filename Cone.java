public class Cone extends Circle{
	//construct private variables
	private double heigth;
	private double thick;

	public Cone(){//default constructor

		this(2.0 , 3.0, 0.1);
	}//constructor ends

	public Cone(double radius, double heigth, double thick){//constructor with parameters
		//get value from this and super class
		super(radius);
		this.heigth = heigth;
		this.thick = thick;
	}//constructor ends

	public double littleCone() {

		double x = 0, y = 0, nyH = 0, litRad = 0;

		x = (heigth * thick) / getRadius();
		y = Math.sqrt(Math.pow(x,2) + Math.pow(thick,2));
		nyH = heigth - thick - y;
		litRad = (nyH * getRadius()) / heigth;

		return (Math.PI * Math.pow(litRad,2) * nyH)/3;
	}//method ends

	public double findVolume(){//returns calculated volume of cone

		return ((Math.PI * Math.pow(getRadius(),2) * heigth)/3) - littleCone();
	}//method ends

	public double findSurfaceArea(){//returns calculated surface area of cone

		return (Math.pow(getRadius(),2) * Math.PI) + (Math.PI * getRadius() * (Math.sqrt(Math.pow(getRadius(),2) + Math.pow(heigth,2))));
	}//method ends

	public double findWeigth(){//returns calculated weigth of cone

		return findVolume() * ironDens;
	}//method ends

	public String toString(){//prints out String

		return super.toString() + "Cone: \nThe radius is " + getRadius() + "\nThe heigth is " + heigth +  "\nThe volume is " + findVolume() +
				"\nThe surface area is " + findSurfaceArea() + "\nThe weigth is " + findWeigth() + " kg";
	}//method ends
}//class ends