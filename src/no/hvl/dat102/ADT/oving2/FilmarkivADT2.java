package no.hvl.dat102.ADT.oving2;

import no.hvl.dat102.oving2.Film;
import no.hvl.dat102.oving2.LinearNode;
import no.hvl.dat102.oving2.Sjanger2;

public interface FilmarkivADT2 {

	public void leggTil(Film element);

	public boolean slettFilm(String tittel);

	public Film[] sokTittel(String delstreng);

	public Film[] sokFilmskaper(String delstreng);

	public int antall();

	public Film[] hentFilmTabell();

	int antallSjanger(Sjanger2 sjanger);

	public boolean inneholder(Film element);

}
