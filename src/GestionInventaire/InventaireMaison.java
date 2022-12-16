package GestionInventaire;

public class InventaireMaison extends InventaireBoîte{
	
	private int argentMaison;

	public InventaireMaison(int Sucre, int Cafe, int Thé, int gobelet, int touillette, int argent, int argentMaison) {
		super(Sucre, Cafe, Thé, gobelet, touillette, argent);
		this.argentMaison = argentMaison;
		}
	public void donnerArgent() {
		if (argentMaison > 50) {
			argent+=argentMaison-50;
			argentMaison=50;
		}
	}
	public void remplirCamion() {
		Sucre-=25;
		Cafe-=25;
		Thé-=25;
		gobelet-=25;
		touillette-=25;
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
