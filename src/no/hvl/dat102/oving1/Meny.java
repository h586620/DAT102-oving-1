package no.hvl.dat102.oving1;

import java.util.Scanner;

import no.hvl.dat102.ADT.oving1.FilmarkivADT;
import no.hvl.dat102.oving1.Filmarkiv;
import no.hvl.dat102.oving1.Filmarkiv.*;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filma;

	public Meny(FilmarkivADT filma) {
		tekstgr = new Tekstgrensesnitt();
		this.filma = filma;

	}

	public void start() {

		Scanner scanner = new Scanner(System.in);
		Filmarkiv arkiv = null;
		System.out.println(
				"Hvilket filmarkiv vil du jobbe med?\n Tast 1: opprett nytt filmarkiv\n Tast 2: jobb med eksisterende");

		int valg = scanner.nextInt();
		if (valg == 1) {
			arkiv = new Filmarkiv(20);
		} else {
			System.out.println("hvilket film arkiv vil du jobbe med?");
			String navn = scanner.next();
			arkiv = Fil.lesFraFil(navn);
		}

		System.out.println(
				"Velg en av følgende metoder\n Tast 1: Legge til film\n Tast 2: Slette film\n Tast 3: Få antall filmer i arkivet\n Tast 4: Søk tittel\n Tast 5: Søk filmskaper\n Tast 6: lukk og lagre arkiv");

		int valg1 = scanner.nextInt();

		switch (valg) {
		case 1:
			Film navn = new Film();
			arkiv.leggTil(navn);
			break;
		case 2:
			System.out.println("Slette film");
			String tittel = scanner.next();
			arkiv.slettFilm(tittel);

			break;
		case 3:
			System.out.println("Få antall filmer i arkivet");
			arkiv.antall();

			break;
		case 4:
			System.out.println("Hvilke tittle vil du søke opp?");
			String tittelen = scanner.next();
			arkiv.sokTittel(tittelen);

			break;
		case 5:
			System.out.println("Hvilke filmskaper vil du søke på?");
			String skaper = scanner.next();
			arkiv.sokFilmskaper(skaper);
			break;

		case 6:
			System.out.println("Skriv inn filnavn");
			String filnavn = scanner.next();
			Fil.skrivTilFil(arkiv, filnavn);
			break;
		default:
			System.out.println("Error");

			break;

		}
	}
}
