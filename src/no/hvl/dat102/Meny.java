package no.hvl.dat102;

import no.hvl.dat102.Filmarkiv;

import java.util.Scanner;
import no.hvl.dat102.Filmarkiv.*;
import no.hvl.dat102.ADT.FilmarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filma;

	public Meny(FilmarkivADT filma) {
		tekstgr = new Tekstgrensesnitt();
		this.filma = filma;

	}

	public void start() {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Hvilket filmarkiv vil du jobbe med?\n Tast 1: opprett nytt filmarkiv\n Tast 2: jobb med eksisterende");

		int valg = scanner.nextInt();
		boolean b = false;

		Filmarkiv nyttarkiv = null;
		switch (valg) {
		case 1:
			System.out.println("Opprett nytt filmarkiv.");

			System.out.println("Hvor mange filmer ønsker du å lagre?");
			int antalliarkiv = scanner.nextInt();

			nyttarkiv = new Filmarkiv(antalliarkiv);
			b = true;

			break;
		case 2:
			System.out.println("Jobb med eksisterende.");

			System.out.println("Skriv inn filnavn du ønsker å lese fra: ");
			String arkiv = scanner.nextLine();
			filma = Fil.lesFraFil(arkiv);

			break;
		default:
			System.out.println("Error");
			break;
		}

		while (b) {
			

			System.out.println(
					"Velg en av følgende metoder.\n Tast 1: Legge til film\n Tast 2: Slette film\n Tast 3: Få antall filmer i arkivet");

			int valg1 = scanner.nextInt();

			switch (valg1) {
			case 1:
				Film navn = new Film();

				nyttarkiv.leggTil(navn);

				break;
			case 2:
				System.out.println("Slette film");
				String tittel = scanner.next();
				nyttarkiv.slettFilm(tittel);

				break;
			case 3:
				System.out.println("Få antall filmer i arkivet");
				nyttarkiv.antall();

				break;
			default:
				System.out.println("Error");

			}
			while (!b) {
				System.out.println(
						"Velg en av følgende metoder.\n Tast 1: Legge til film\n Tast 2: Slette film\n Tast 3: Få antall filmer i arkivet");

				int valg2 = scanner.nextInt();

				switch (valg2) {
				case 1:
					Film navn = new Film();

					filma.leggTil(navn);

					break;
				case 2:
					System.out.println("Slette film");
					String tittel = scanner.next();
					filma.slettFilm(tittel);

					break;
				case 3:
					System.out.println("Få antall filmer i arkivet");
					filma.antall();

					break;
				default:
					System.out.println("Error");
				}
			}

		}
	}
}
