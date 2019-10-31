public  class Box extends Rectangle {
	//construct public variables
	private double heigth;
	private double thick;

	public Box(){//default constructor

		this(2.0, 2.0, 3.0, 0.1);
	}//constructor ends

	public Box(double length, double width, double heigth, double thick){//constructor with parameters
		//get value from this and super class
		super(length, width);
		this.heigth = heigth;
		this.thick = thick;
	}//constructor ends

	public double getHeigth(){//returns value from variable

		return heigth;
	}//method ends

	public void setHeigth(double heigth){//sets new value for variable

		this.heigth = heigth;
	}//method ends

	public double findSurfaceArea(){//returns calculated surface area of box

		return 4 * findArea() + 2 * getHeigth() * getWidth();
	}//method ends

	public double findVolume(){//returns calculated volume of box

		return findArea() * getHeigth() - (getLength() - (2 * thick)) * (getWidth() - (2 * thick)) * (getHeigth() - (2 * thick));
	}//method ends

	public double findWeigth(){//returns calculated weigth of box

		return findVolume() * ironDens;
	}//method ends

	public String toString(){//prints out String when called from main

			return super.toString() + "Box: \nThe length is " + getLength() + "\nThe heigth is " + getWidth() + "\nThe volume is " + findVolume() +
					"\nThe surface area is " + findSurfaceArea() + "\nThe weigth is " + findWeigth() + " kg";
	}//method ends
}//class ends