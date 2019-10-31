public class TestOblig4{
	public static void main (String[] args){

		//default figure test
		Box box = new Box();
		System.out.println(box.toString());

		Cylinder cylinder = new Cylinder(5,6,0.2);
		System.out.println(cylinder.toString());

		Sphere sphere = new Sphere();
		System.out.println(sphere.toString());

		Cone cone = new Cone(5,6,0.2);
		System.out.println(cone.toString());

	}//main method ends
}//class ends