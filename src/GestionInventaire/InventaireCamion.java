package GestionInventaire;

public class InventaireCamion extends InventaireMaison{
	public InventaireCamion(int Sucre, int Cafe, int Thé, int gobelet, int touillette, int argent,int argentMaison) {
		super(Sucre, Cafe, Thé, gobelet, touillette, argent, argentMaison);
	}
	@Override
	public void remplirCamion() {
		super.remplirCamion();
		Sucre+=25;
		Cafe+=25;
		Thé+=25;
		gobelet+=25;
		touillette+=25;
	}
	public void remplirMachine(int SucreDedans, int CafeDedans, int ThéDedans, int gobeletDedans, int touilletteDedans, int argentDeDans) {
		
	}
}
