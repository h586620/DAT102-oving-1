package no.hvl.dat102.ADT;


import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;

public interface FilmarkivADT {
	
	public void leggTil(Film film);
	
	public boolean slettFilm(String tittel);
	
	public Film[] sokTittel(String delstreng);
	
	public Film[] sokFilmskaper(String delstreng);
	
	public int antall();
	
	Film[] hentFilmTabell();
	
	int antallSjanger(Sjanger sjanger);
	
	
}
