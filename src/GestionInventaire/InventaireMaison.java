package GestionInventaire;

public class InventaireMaison extends InventaireBoite {
	public int SucreMaison;
	public int CafeMaison;
	public int TheMaison;
	public int gobeletMaison;
	public int touilletteMaison;
	public int argent;
	private int argentMaison;

	public InventaireMaison(int Sucre, int Cafe, int The, int gobelet, int touillette, int argent, int argentMaison,
			int SucreMaison, int CafeMaison, int TheMaison, int gobeletMaison, int touilletteMaison) {
		super(Sucre, Cafe, The, gobelet, touillette, argent);
		this.argentMaison = argentMaison;
		this.CafeMaison = CafeMaison;
		this.gobeletMaison = gobeletMaison;
		this.SucreMaison = SucreMaison;
		this.touilletteMaison = touilletteMaison;
		this.TheMaison = TheMaison;
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
	public void remplir(int Sucre, int Cafe, int The, int gobelet, int touillette) {
		super.remplir(Sucre, Cafe, The, gobelet, touillette);
		SucreMaison += Sucre;
		CafeMaison += Cafe;
		TheMaison += The;
		gobeletMaison += gobelet;
		touilletteMaison += touillette;
	}

	@Override
	public void CheckArgent() {
		super.CheckArgent();
		if (argentMaison > 250) {
			System.out.println("il faut donner l'argent a  l'entreprise");
			recevoirArgent(argent);
		}
	}
	public void VoirInventaire() {
		System.out.println("Il y a  " + SucreMaison + " de sucre a  la maison");
		System.out.println("Il y a  " + CafeMaison + " de Cafe a la maison");
		System.out.println("Il y a  " + TheMaison + " de the a la maison");
		System.out.println("Il y a  " + gobeletMaison + " de gobelet a la maison");
		System.out.println("Il y a  " + touilletteMaison + " de touillette a la maison");
		System.out.println("Il y a  " + argentMaison + " d'argent a la maison");

	}

	public void faireLivraison(Semaines semaines) {
		if (semaines.toString() == Semaines.A.toString()) {
			SucreMaison = 0;
			CafeMaison = 0;
			TheMaison = 0;
			gobeletMaison = 0;
			touilletteMaison = 0;
			argentMaison += 75;
		}
		if (semaines.toString() == Semaines.B.toString()) {
			SucreMaison = 0;
			CafeMaison = 0;
			TheMaison = 0;
			gobeletMaison = 0;
			touilletteMaison = 0;
			argentMaison += 150;
		}
		if (semaines.toString() == Semaines.C.toString()) {
			SucreMaison = 0;
			CafeMaison = 0;
			TheMaison = 0;
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
