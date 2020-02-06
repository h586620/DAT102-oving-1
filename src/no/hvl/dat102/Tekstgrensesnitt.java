package no.hvl.dat102;

import no.hvl.dat102.ADT.FilmarkivADT;

public class Tekstgrensesnitt {

	
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
		
		for(Film film : arkiv.sokTittel(delstreng)) {
			System.out.println(film);
			}
		}
	
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
		
		for(Film film : arkiv.sokFilmskaper(delstreng)) {
			if(film.getFilmskaper().equalsIgnoreCase(delstreng)) {
				System.out.println(film);
			}
			}
		}
	
	public void skrivUtStatistikk(FilmarkivADT arkiv) {
		
		int antall = arkiv.antall(); // antall filer i arkivet
		
		System.out.println("Totalt antall filmer: " + antall);
		
		Sjanger[] sjangere = Sjanger.values();
		

		for( Sjanger sjanger : sjangere) { //Her kan vi skrive sjangere som Sjanger.values()
			System.out.println("Antall  "  + sjanger.toString() + "filmer: " + arkiv.antallSjanger(sjanger) );
		}
	}

	
	}
	
