package no.hvl.dat102.oving2;

import no.hvl.dat102.ADT.oving2.FilmarkivADT2;
import no.hvl.dat102.oving2.Film;
import no.hvl.dat102.oving2.Sjanger2;
import no.hvl.dat102.oving2.LinearNode;

public class Filmarkiv2 implements FilmarkivADT2 {

	private int antall;
	private LinearNode<Film> start;

	public Filmarkiv2() {
		antall = 0;
		start = null;

	}

	public void leggTil(Film element) {
		if (!(inneholder(element))) {
			LinearNode<Film> node = new LinearNode<Film>(element);
			node.setNeste(start);
			start = node;
			antall++;

		}

	}

	public boolean slettFilm(String tittel) {

		boolean slettet = false;
		LinearNode<Film> forrige = null;
		LinearNode<Film> denne = start;

		while (denne.getNeste() != null) {


			if (denne.getTittel() == tittel) {
				antall--;
				if (forrige != null) {
					forrige.setNeste(denne.getNeste());
				}
				
			}
			forrige = denne;
			denne = denne.getNeste();
		}
		return slettet;

	}

	public Film[] sokTittel(String delstreng){
		    
		LinearNode<Film> temp = start;
		
		Film[] hjelpetabell = new Film[antall];
		
		for(int i = 0; i < antall&& temp!= null; i++) {
			if (temp.getElement().getTittel().contains(delstreng)) {
				hjelpetabell[i] = temp.getElement(); 
			}
		}
		    
		
		return hjelpetabell; 
		  }
		

	public Film[] sokFilmskaper(String delstreng) {
			LinearNode<Film> temp=start;
			Film[] hjelpetabell= new Film[antall];
			for(int i=0;i<antall&&temp!=null;i++) {
				if(temp.getElement().getFilmskaper().contains(delstreng)) {
					hjelpetabell[i]= temp.getElement();
				}
			}
			return hjelpetabell;
	}

	public int antall() {
		return antall;
	}

	public Film[] hentFilmTabell() {
	LinearNode<Film> temp=start;
	Film[] hjelpetabell= new Film[antall];
	for(int i=0;i<antall;i++) {
		hjelpetabell[i]=temp.getElement();
		temp=temp.getNeste();
		
	}
	return hjelpetabell;
	}

	public int antallSjanger(Sjanger2 sjanger) {
	LinearNode<Film> temp=start;
	int antallSjanger=0;
	for(int i=0;i<antall;i++) {
		if(temp.getElement().getSjanger()==sjanger) {
			antallSjanger++;
		}
	}
	return antallSjanger;
	}

	public boolean inneholder(Film element) {
		boolean funnet = false;

		LinearNode<Film> aktuell = start;
		for (int soek = 0; soek < antall && !funnet; soek++) {
			if (aktuell.getElement().equals(element)) {
				funnet = true;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return funnet;
	}

}
