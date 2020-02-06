package no.hvl.dat102;

import no.hvl.dat102.ADT.FilmarkivADT;
import no.hvl.dat102.ADT.FilmarkivADT.*;

public class Filmarkiv implements FilmarkivADT {
	
	private Film[] filmarkiv;
	private int antall = 0;

	
	public Filmarkiv(int n) {
		filmarkiv = new Film[n];
	}
	

	public void leggTil(Film film) {
		
		if(antall < filmarkiv.length) {
			filmarkiv[antall - 1] = film;
			antall++;
			}
		}
		
	public boolean slettFilm(String tittel) {
		
		
		for(int i = 0; i < antall; i++) {
		
		if(filmarkiv[i].getTittel().equals(tittel)) {
			filmarkiv[antall - 1] = filmarkiv[i];
			filmarkiv[antall - 1] = null;
			antall = antall - 1;
			
			return true;
		}
		
		}
		return false;
		
	}
	
	public Film[] sokTittel(String delstreng) {
		
		Film[] tabell = new Film[antall];
		int n = 0;
		
		for(int i = 0; i < antall; i++) {
		
		if(filmarkiv[i].getTittel().contains(delstreng)) {
			tabell[n] = filmarkiv[i];
			n++;
		}
	}
		tabell = trimTab(tabell, n);
		return tabell;
	}
	
	public Film[] sokFilmskaper(String delstreng) {
		
		Film[] tabell1 = new Film[antall];
		int n = 0;
		
		for(int i = 0; i < antall; i++) {
			
			if(filmarkiv[i].getFilmskaper().contains(delstreng)) {
				tabell1[n] = filmarkiv[i];
				n++;
	}
}
		tabell1 = trimTab(tabell1, n);
		return tabell1;
	
	}
	
	public int antall() {
		return antall; 
	}

	private Film[] trimTab(Film[] tab, int n) {
		Film[] filmtab2 = new Film[n];
		int i = 0;
		while (i < n) {
		filmtab2[i] = tab[i];
		i++;
		}
		return filmtab2;
	
}

	public int antallSjanger(Sjanger sjanger) {
		
		int a = 0;
		
		for(int i = 0; i < antall; i++) {
		if(filmarkiv[i].getSjanger() == sjanger)	{
			a++;
		}
		}
		return a;
	}
	public Film[] hentFilmTabell() {
		return filmarkiv;
	}
	

}

