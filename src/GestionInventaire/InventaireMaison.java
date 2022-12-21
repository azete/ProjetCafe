package GestionInventaire;

public class InventaireMaison extends InventaireBoîte {
	public int SucreMaison;
	public int CafeMaison;
	public int ThéMaison;
	public int gobeletMaison;
	public int touilletteMaison;
	public int argent;
	private int argentMaison;

	public InventaireMaison(int Sucre, int Cafe, int Thé, int gobelet, int touillette, int argent, int argentMaison,
			int SucreMaison, int CafeMaison, int ThéMaison, int gobeletMaison, int touilletteMaison) {
		super(Sucre, Cafe, Thé, gobelet, touillette, argent);
		this.argentMaison = argentMaison;
		this.CafeMaison = CafeMaison;
		this.gobeletMaison = gobeletMaison;
		this.SucreMaison = SucreMaison;
		this.touilletteMaison = touilletteMaison;
		this.ThéMaison = ThéMaison;
	}

	@Override
	public void recevoirArgent(int argent) {
		if (argentMaison > 50) {
			argent += argentMaison - 50;
			argentMaison = 50;
		}
		super.recevoirArgent(argent);
	}

	@Override
	public void remplir(int Sucre, int Cafe, int Thé, int gobelet, int touillette) {
		super.remplir(Sucre, Cafe, Thé, gobelet, touillette);
		SucreMaison += Sucre;
		CafeMaison += Cafe;
		ThéMaison += Thé;
		gobeletMaison += gobelet;
		touilletteMaison += touillette;
	}

	@Override
	public void CheckArgent() {
		super.CheckArgent();
		if (argentMaison > 250) {
			System.out.println("il faut donner l'argent à l'entreprise");
			recevoirArgent(argent);
		}
	}

	@Override
	public void VoirInventaire() {
		super.VoirInventaire();
		System.out.println("Il y a  " + SucreMaison + " de sucre à la maison");
		System.out.println("Il y a  " + CafeMaison + " de Cafe a la maison");
		System.out.println("Il y a  " + ThéMaison + " de thé a la maison");
		System.out.println("Il y a  " + gobeletMaison + " de gobelet a la maison");
		System.out.println("Il y a  " + touilletteMaison + " de touillette a la maison");
		System.out.println("Il y a  " + argentMaison + " d'argent a la maison");

	}

	public void faireLivraison(Semaines semaines) {
		if (semaines.toString() == Semaines.A.toString()) {
			SucreMaison = 0;
			CafeMaison = 0;
			ThéMaison = 0;
			gobeletMaison = 0;
			touilletteMaison = 0;
			argentMaison += 75;
		}
		if (semaines.toString() == Semaines.B.toString()) {
			SucreMaison = 0;
			CafeMaison = 0;
			ThéMaison = 0;
			gobeletMaison = 0;
			touilletteMaison = 0;
			argentMaison += 150;
		}
		if (semaines.toString() == Semaines.C.toString()) {
			SucreMaison = 0;
			CafeMaison = 0;
			ThéMaison = 0;
			gobeletMaison = 0;
			touilletteMaison = 0;
			argentMaison += 250;
		}
	}

//	public static void main(String[] args) {
//		InventaireMaison maison = new InventaireMaison(150, 150, 150, 150, 150, 500, 0, 0, 0, 0, 0, 0);
//		// sodebo.CheckArgent();
//		maison.VoirInventaire();
//		maison.livraisonSemaine(Semaines.A);
//		maison.VoirInventaire();
//		maison.faireLivraison(Semaines.A);
//		maison.recevoirArgent(0);
//		maison.VoirInventaire();
//	}

}
