import java.util.Scanner;

public class countYears{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int birthYear=1, year = 0;

		System.out.println("Dette er et program som vil regne ut hvor gammel du er eller kommer til � bli i �r");
		System.out.println("Trykk 0 + Enter for � avslutte");

			while (birthYear!= 0){

				System.out.print("Tast inn hvilket �r du er f�dt: ");

				birthYear = input.nextInt();
				year = 2018 - birthYear;

				System.out.println("Du er/blir " + year + " �r i �r.");
			}
	}
}