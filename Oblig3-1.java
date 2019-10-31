//Enable input
import java.util.Scanner;

public class Oblig3{//konstruksjon av klasse
	public static void main (String[] args){//konstruksjon av metode

		Scanner input = new Scanner (System.in);//enable Scanner input

		System.out.print("Skriv inn 1 for LOTTO og 2 for VIKINGLOTTO og trykk enter: ");//spør om lotto-type

		int velg = input.nextInt();//skan input fra bruker

		int antTall = 0, maksTall = 0;//deklarerer int

		if(velg == 1){//hvis lotto valgt

			System.out.print("Du spiller LOTTO!\n");

			antTall = 7;//setter antall tall som skal skrives ut i hver rekke
			maksTall = 34;//setter maksTall til 34 som er maks verdi et tall i vanlig lotto kan ha

		}

		else if(velg == 2){//hvis vikinglotto valgt

			System.out.print("Du spiller VIKINGLOTTO!\n");

			antTall = 6;//setter antall tall som skal skrives ut i hver rekke
			maksTall = 48;//setter maksTall til 48 som er maks verdi et tall i viking lotto kan ha

		}

		else{//skriver ut en melding om at bruker må skrive inn 1 eller 2 for å gå videre

			System.out.print("Vennligst skriv inn enten 1 eller 2!\n");

		}


		int[] x = new int[antTall]; //deklarerer liste med antall plasser satt av etter om du velger lotto eller vikinglotto

		int rad = lesInn();//henter det returnerte tallet fra lesInn metoden

		for(int k = 0; k < rad; k++){//går igjennom så mange ganger som brukeren sier antall rader den vil ha

			trekk(x, maksTall);//henter ut trekk metoden
			sorter(x);///henter ut sorter metoden
			skrivUt(x);///henter ut skrivUt metoden
		}//for løkke slutt

	}//main metode slutt


		static int lesInn(){//lesInn method

			Scanner input = new Scanner (System.in);//gjør input mulig
			System.out.print("Skriv inn antall rader du vil spille med: ");// spør hvor mange rader bruker vil ha

			int rad = input.nextInt();//henter ut heltallet fra bruker

			return rad;//returnerer tallet

		}//lesInn metode slutt


		static void trekk(int[] x, int maksTall){//trekk metode, tar med variabelen maksTall fra main

			for(int i = 0; i < x.length; i++){//går igjennom løkka så lang som tabellen er satt, etter om du velger lotto eller viking

				x[i] = (int)((Math.random() * maksTall)+1);//velger tilfeldig tall mellom 0 og 34 eller 48 ettersom  lotto/viking valgt. +1 er lagt på for å kunne få det høyeste tallet.

				for(int j = 0; j < i; j++){//løkka går igjennom alle plassene før nåværende index-plass og skjekker om tallet som bli generert er likt noe av det som har vært

					if(x[j] == x[i]){//hvis tallet er likt et av de forrige tallene blir det generert et nytt tilfeldig tall og i-variabelen stillt en verdi tilbake

						i--;

					}//if slutt
				}//for slutt
			}//for slutt
		}//trekk metode slutt


		static void skrivUt(int[] x){
			for(int i = 0; i < x.length; i++){//går gjennom løkka avhengig av lengden på tabellen

				System.out.printf("%3d", x[i]);//skriver ut tallet i en tabellform for å få det til å se litt finere ut
			}

			System.out.println();//lager ny linje etter hver rad

		}//skrivUt metode slutt


		static void sorter(int [] x){//bruker bubblesort som metode. Hentet fra forelesnings dokumenter

			int temp;

			for(int pass = 1; pass <= x.length - 1; pass++){

				for(int i = 0; i <= x.length - 2; i++){//går fra første index til nest siste index, fordi x[i + 1] skjekke

					if(x[i] > x[i + 1]){
						//hvis x[i] er større en neste index sitt tall, så
						temp = x[i];//flyttes x[i] til en midlertidig plassering,
						x[i] = x[i + 1];//x[i + 1] flyttes til x[i] sin plassering,og
						x[i + 1] = temp;//x[i + 1] sin plassering får verdien fra x[i] som lå i den midlertidige plasseringen.

					}//if slutt
				}//for2 løkke slutt
			}//for løkke slutt
		}//sorter metode slutt

}//klasse slutt