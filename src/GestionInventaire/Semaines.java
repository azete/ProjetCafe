package GestionInventaire;

public enum Semaines {
	A("A"), B("B"), C("C");

	private String semaines;

	private Semaines(String semaines) {
		this.semaines = semaines;
	}

	public String toString() {
		return semaines;
	}
}
