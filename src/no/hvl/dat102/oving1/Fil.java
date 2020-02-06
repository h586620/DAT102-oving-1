package no.hvl.dat102.oving1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat102.ADT.oving1.FilmarkivADT;
import no.hvl.dat102.oving1.Film.*;
import no.hvl.dat102.oving1.Filmarkiv.*;

public class Fil {

	final static String SKILLE = "#";
	final static String ADRESSE="/Users/bettinasmebye/Documents/HVL/andre semester/DAT102/";
	
	
	public static Filmarkiv lesFraFil(String filnavn){
		
		Filmarkiv filmarkiv = null;
		try {
		/*  1 - FileReader
		 *      Klassen FileReader sørger for at byte-innstrømmen blir opprettet,
		 *      sørger videre for at bytes fra filen blir tolket riktig som tegn 
		 *      i flg. tegnkodingsformatet for plattformen.
		*/    
		 FileReader ansFil = new FileReader(filnavn);
		 			 
        
		/*  2 - BufferedReader
		 *      Definerer et BufferReader-objekt som kobles til FileReader-objektet
		 *      Da når vi metoden readLine() som leser en linje.		  
		 * 			 
		 */
		BufferedReader innfil = new BufferedReader(ansFil);

		// 3 - Leser den første posten som er antall info-poster
		       
		String linje = innfil.readLine();
		int n = Integer.parseInt(linje);
		filmarkiv = new Filmarkiv(n);

		// 4 - Les postene, en hel post om gangen
		for (int i = 0; i < n; i++) {
			String post = innfil.readLine();
			String[] felt = post.split(SKILLE);
			int filmnummer = Integer.parseInt(felt[0]);
			String filmskaper = felt[1];
			String tittel = felt[2];
			int lanseringsår = Integer.parseInt(felt[3]);
			String sjStr = felt[4];
			Sjanger sjanger = Sjanger.finnSjanger(sjStr);
			String filmselskap = felt[5];

			Film film = new Film(filmnummer, filmskaper, tittel, lanseringsår, sjanger, filmselskap);

			filmarkiv.leggTil(film);
		}

		// 4 - Lukk filen
		innfil.close();

	} catch (FileNotFoundException unntak) {// arver fra IOE.. må stå først
		                                    // hvis ikke vil unntaket for IOException skygge
		System.out.println("Finner ikke filen " + filnavn);
	
	} catch (IOException e) {
		System.out.println("Feil ved lesing av fil: " + e);
		
	}
  
return filmarkiv;
   
}// metode

		
	public static void skrivTilFil(FilmarkivADT filma, String filnavn)  {
		try {
			/* 1 - FileWriter
			 *     Definerer et FileWriter-objekt som åpner filen.
			 *     Byte-strøm blir opprettet for skriving av bytes til filen.
			 *     Tegn blir lagret i standard tegnkodingsformat for plattformen.
			 *     Hvis utvid er true, vil filen utvides ved  skriving på slutten
			 *     av filen. Hvis utvid er false, vil skrivingen starte i begynnnelsen 
			 *     av filen.			 *     
			 *     Dersom filen ikke eksisterer, vil den bli opprettet. 
			 *     Dersom filen ikke kan åpnes, vil metoden kaste et unntak av typen IOException.
			 * 
			 */
			FileWriter ansFil = new FileWriter(filnavn, false);

			/* 2 - PrintWriter
			 *     Definerer et PrintWriter-objekt som kobles til FileWriter-objektet.
			 *     PrintWriter-objektet leverer tegn til FileWriter-objektet.
			 *     FileWriter vil gi riktig koding av tegn i bytes  og lagring på fil.
			 *      
			 * 
			 */
			PrintWriter utfil = new PrintWriter(ansFil);
			int antall = filma.antall();
			// 3 - Skriver foerst ut antall ansatt-info-er på første linje
			utfil.println(antall);
			Film[] tabell = filma.hentFilmTabell();
			for (int i = 0; i < antall; i++) {
				// 3 - Skriver postene, felt for felt
				utfil.print(tabell[i].getFilmnummer());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getFilmskaper());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getTittel());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getLanseringsår());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getSjanger());
				utfil.print(SKILLE);
				utfil.println(tabell[i].getFilmselskap());
			} // for
				// 4 - Lukk filen
			utfil.close();
		} // try
		catch (IOException e) {
			System.out.println("Feil på skriving til fil : " + e);
		
		}

	}// metode

}// class
