public class Oblig2{
	public static void main(String[] args){

//Oppgave A a)

	System.out.println("Oppgave A a). Dette programmet skal skrive ut alle tall fra og med 10 til og med 20:");

		int teller;

		for (teller = 10; teller <= 20; teller ++)//fint � ha litt luft i linjene
		//mellom hvert krav for teller skal det st� semikolon(";") og ikke komma(",").

		/*
		for at programmet skal skrive ut tall fra 10 til 20 m� teller si <= 20, og ikke >= 20, fordi ">=" sier teller "st�rre enn" 20.
		10 er ikke st�rre enn 20 s� programmet skriver ikke ut noe, fordi koden sier noe annet en det vi vil skal skje.
		<= 20 vil si at l�kka skal g� helt fram til og med 20
		*/

		//teller++1 er feil, for ++ sier allerede +1.

		System.out.println(" "+ teller);


		//Ikke n�dvendig med ""+ teller, med mindre du vil ha et "space" f�r tallet kommer, men da m� det st� " " og ikke "".

	System.out.print("\n");//bare for � lage litt luft mellom oppgavene.

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Oppgave A b)

	System.out.println("Oppgave A b). Dette programmet skal skrive ut om et tall er partall, oddetall eller ingen av delene.");

		int tall= 54;

		switch (tall % 2)
		{
			case 0://hvis svaret blir 0 skjer dette
				System.out.println ("Tallet " + tall + " er partall.");
				break;//break m� st� under hver case, i tilfelle case-en ikke gjelder s� gj�r break at den hopper videre.

			case 1://hvis svaret blir 1 skjer dette
				System.out.println ("Tallet " + tall + " er oddetall.");//fint med mellomrom mellom anf�rselstegn og tekst, s�nn at teksten ikke st�r helt inntil tallet.
				break;

			default://hvis svaret ikke blir hverken 0 eller 1 skjer dette. Den siste case-en heter default, for den sier dette skjer hvis ingen av de �vrige case-ene sl�r inn.
				System.out.println ("Tallet " + tall + " er hverken eller. ");
				//Default trenger ikke break
				//case 2: gir ikke noe forskjell fra case 0: Begge finner partallet, og da gjelder case 0: framfor case 2: fordi den st�r f�rst.

		}//switch slutt

	System.out.print("\n");

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Oppgave A c)

	System.out.println("Oppgave A c). Dette programmet skal summere tallene fra og med 10 til og med 25");

		int teller1, sum = 0;//nullstill variabelen (sum) f�r bruk, for man vet ikke hvilken verdi den har. teller trengs ikke � nullstilles, fordi den blir satt en verdi f�r den brukes

		for (teller1 = 10; teller1 <= 25; ++teller1 )/*Ikke semicolon her, for dette er ikke et statement
			For � summere tallene fra og med 10 til og med 25 kan man ikke sette teller = 100 teller <= 125. Det blir et annet resultat.
			M� ikke glemme to + tegn (++) foran variabel teller for � addere med 1 mer for hver gang.
			*/

			sum = sum + teller1;// sum m� v�re med f�r pluss-tegnet, eller s� kan man skrive: += for � skrive raskere.

			System.out.println("Summen av tallene fra og med 10 til og med 25 er lik " + sum);// skriver ut resultatet etter � ha g�tt ut av l�kken.

	System.out.print("\n");

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Oppgave B

	System.out.println("Oppgave A c). Dette programmet skal lage en diamant ved hjelp av tegnet stjerne og space");


		int lines, spaces, stars;//deklarer variablene
		int nspaces= 12;//deklarerer og setter verdien for variabler.
		int nstars=2;

			for(lines=1; lines<=7; lines++){//lager en l�kke som skriver ut 7 linjer igjennom programmet

				for(spaces=1; spaces<=nspaces; spaces++)//L�kken skriver ut antall mellomrom pr. linje
					System.out.print(" ");

				for(stars=1; stars<=nstars; stars++){//L�kken skriver ut antall stjernetegn pr. linje
					System.out.print("*");
				}

				if(lines>=4){//denne if- setningen minker antall stjerner og �ker antall mellomrom for hver linje etter linje 4
					nspaces+=4;
					nstars-=8;
				}
				else{//denne else- setningen sier at antall stjerner skal �ke og antall mellomrom minke fram til linje 4
					nspaces-=4;
					nstars+=8;
				}
				System.out.println();//skriver ut en ny linje for hver gjennomgang av l�kka
			}//slutt for l�kke
	}//main metode slutt
}//klasse slutt