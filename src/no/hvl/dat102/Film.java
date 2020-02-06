package no.hvl.dat102;

public class Film {
	
	private int filmnummer;
	private String filmskaper;
	private String tittel;
	private int lanseringsår;
	protected Sjanger sjanger;
	private String filmselskap;
	
	public Film() {	
		
	}

	public Film(int filmnummer,String filmskaper, String tittel, int lanseringsår, Sjanger sjanger, String filmselskap) {
		this.filmnummer = filmnummer;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.lanseringsår = lanseringsår;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
	}
	
	public String getTittel() {
		return tittel;
	}
	public String getFilmskaper() {
		return filmskaper;
}

	public Object getSjanger() {
		return sjanger;
	}

	public int getFilmnummer() {
		// TODO Auto-generated method stub
		return filmnummer;
	}

	public int getLanseringsår() {
		// TODO Auto-generated method stub
		return lanseringsår;
	}

	public String getFilmselskap() {
		// TODO Auto-generated method stub
		return filmselskap;
	}
	
}
