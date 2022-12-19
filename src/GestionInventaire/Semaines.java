package GestionInventaire;

public enum Semaines {
	A("a"), B("b"), C("c");

	private String semaines;

	private Semaines(String semaines) {
		this.semaines = semaines;
	}
	public String toString() {
		return semaines;
	}
}
