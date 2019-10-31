public class Oblig2{
	public static void main(String[] args){

//Oppgave A a)

	System.out.println("Oppgave A a). Dette programmet skal skrive ut alle tall fra og med 10 til og med 20:");

		int teller;

		for (teller = 10; teller <= 20; teller ++)//fint å ha litt luft i linjene
		//mellom hvert krav for teller skal det stå semikolon(";") og ikke komma(",").

		/*
		for at programmet skal skrive ut tall fra 10 til 20 må teller si <= 20, og ikke >= 20, fordi ">=" sier teller "større enn" 20.
		10 er ikke større enn 20 så programmet skriver ikke ut noe, fordi koden sier noe annet en det vi vil skal skje.
		<= 20 vil si at løkka skal gå helt fram til og med 20
		*/

		//teller++1 er feil, for ++ sier allerede +1.

		System.out.println(" "+ teller);


		//Ikke nødvendig med ""+ teller, med mindre du vil ha et "space" før tallet kommer, men da må det stå " " og ikke "".

	System.out.print("\n");//bare for å lage litt luft mellom oppgavene.

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Oppgave A b)

	System.out.println("Oppgave A b). Dette programmet skal skrive ut om et tall er partall, oddetall eller ingen av delene.");

		int tall= 54;

		switch (tall % 2)
		{
			case 0://hvis svaret blir 0 skjer dette
				System.out.println ("Tallet " + tall + " er partall.");
				break;//break må stå under hver case, i tilfelle case-en ikke gjelder så gjør break at den hopper videre.

			case 1://hvis svaret blir 1 skjer dette
				System.out.println ("Tallet " + tall + " er oddetall.");//fint med mellomrom mellom anførselstegn og tekst, sånn at teksten ikke står helt inntil tallet.
				break;

			default://hvis svaret ikke blir hverken 0 eller 1 skjer dette. Den siste case-en heter default, for den sier dette skjer hvis ingen av de øvrige case-ene slår inn.
				System.out.println ("Tallet " + tall + " er hverken eller. ");
				//Default trenger ikke break
				//case 2: gir ikke noe forskjell fra case 0: Begge finner partallet, og da gjelder case 0: framfor case 2: fordi den står først.

		}//switch slutt

	System.out.print("\n");

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Oppgave A c)

	System.out.println("Oppgave A c). Dette programmet skal summere tallene fra og med 10 til og med 25");

		int teller1, sum = 0;//nullstill variabelen (sum) før bruk, for man vet ikke hvilken verdi den har. teller trengs ikke å nullstilles, fordi den blir satt en verdi før den brukes

		for (teller1 = 10; teller1 <= 25; ++teller1 )/*Ikke semicolon her, for dette er ikke et statement
			For å summere tallene fra og med 10 til og med 25 kan man ikke sette teller = 100 teller <= 125. Det blir et annet resultat.
			Må ikke glemme to + tegn (++) foran variabel teller for å addere med 1 mer for hver gang.
			*/

			sum = sum + teller1;// sum må være med før pluss-tegnet, eller så kan man skrive: += for å skrive raskere.

			System.out.println("Summen av tallene fra og med 10 til og med 25 er lik " + sum);// skriver ut resultatet etter å ha gått ut av løkken.

	System.out.print("\n");

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Oppgave B

	System.out.println("Oppgave A c). Dette programmet skal lage en diamant ved hjelp av tegnet stjerne og space");


		int lines, spaces, stars;//deklarer variablene
		int nspaces= 12;//deklarerer og setter verdien for variabler.
		int nstars=2;

			for(lines=1; lines<=7; lines++){//lager en løkke som skriver ut 7 linjer igjennom programmet

				for(spaces=1; spaces<=nspaces; spaces++)//Løkken skriver ut antall mellomrom pr. linje
					System.out.print(" ");

				for(stars=1; stars<=nstars; stars++){//Løkken skriver ut antall stjernetegn pr. linje
					System.out.print("*");
				}

				if(lines>=4){//denne if- setningen minker antall stjerner og øker antall mellomrom for hver linje etter linje 4
					nspaces+=4;
					nstars-=8;
				}
				else{//denne else- setningen sier at antall stjerner skal øke og antall mellomrom minke fram til linje 4
					nspaces-=4;
					nstars+=8;
				}
				System.out.println();//skriver ut en ny linje for hver gjennomgang av løkka
			}//slutt for løkke
	}//main metode slutt
}//klasse slutt