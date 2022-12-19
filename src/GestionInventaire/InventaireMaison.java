package GestionInventaire;

public class InventaireMaison extends InventaireBoîte{
	public int SucreMaison;
	public int CafeMaison;
	public int ThéMaison;
	public int gobeletMaison;
	public int touilletteMaison;
	public int argent;
	private int argentMaison;

	public InventaireMaison(int Sucre, int Cafe, int Thé, int gobelet, int touillette, int argent, int argentMaison, int SucreMaison, int CafeMaison, int ThéMaison, int gobeletMaison, int touilletteMaison) {
		super(Sucre, Cafe, Thé, gobelet, touillette, argent);
		this.argentMaison = argentMaison;
		this.CafeMaison= CafeMaison;
		this.gobeletMaison= gobeletMaison;
		this.SucreMaison=SucreMaison;
		this.touilletteMaison=touilletteMaison;
		this.ThéMaison= ThéMaison;
		}
	public void donnerArgent() {
		if (argentMaison > 50) {
			argent+=argentMaison-50;
			argentMaison=50;
		}
	}
	@Override
	public void remplir(int Sucre, int Cafe, int Thé, int gobelet, int touillette) {
		super.remplir(Sucre, Cafe, Thé, Cafe, Sucre);
		SucreMaison+=Sucre;
		CafeMaison+=Cafe;
		ThéMaison+=Thé;
		gobeletMaison+=gobelet;
		touilletteMaison+=touillette;
	}
	@Override
	public void CheckArgent() {
		super.CheckArgent();
		if (argentMaison > 250 ) {
			System.out.println("il faut donner l'argent à l'entreprise");
			donnerArgent();
		}
	}
	
}
