package no.hvl.dat102.oving1;

public enum Sjanger {
	
	ACTION, DRAMA, HISTORY, SCFI;
	
	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}
		}
		return sjang;

}
	}