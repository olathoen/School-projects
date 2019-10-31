import java.util.Scanner;

public class countYears{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int birthYear=1, year = 0;

		System.out.println("Dette er et program som vil regne ut hvor gammel du er eller kommer til å bli i år");
		System.out.println("Trykk 0 + Enter for å avslutte");

			while (birthYear!= 0){

				System.out.print("Tast inn hvilket år du er født: ");

				birthYear = input.nextInt();
				year = 2018 - birthYear;

				System.out.println("Du er/blir " + year + " år i år.");
			}
	}
}