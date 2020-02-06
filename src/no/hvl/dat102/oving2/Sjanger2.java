package no.hvl.dat102.oving2;

public enum Sjanger2 {
	
	ACTION, DRAMA, HISTORY, SCFI;
	
	public static Sjanger2 finnSjanger(String navn) {
		Sjanger2 sjang = null;
		for (Sjanger2 sj : Sjanger2.values()) {
			if (sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}
		}
		return sjang;

}
}
