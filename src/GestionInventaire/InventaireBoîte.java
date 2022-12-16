package GestionInventaire;

public class InventaireBoîte {
	public int Sucre;
	public int Cafe;
	public int Thé;
	public int gobelet;
	public int touillette;
	public int argent;
	
	public InventaireBoîte (int Sucre, int Cafe, int Thé, int gobelet, int touillette, int argent) {
		this.Cafe= Cafe;
		this.gobelet=gobelet;
		this.Sucre=Sucre;
		this.Thé=Thé;
		this.touillette=touillette;
		this.argent=argent;
		}
	
	public void CheckArgent() {
		if (argent<0) {
			System.out.println("La société est en faillite ! Il faut faire un prêt ou sinon cest la fin!");
		}
		if (argent <= 150) {
			System.out.println("Il faut se revoir le plan de vente et peut être augmenter les prix ! sinon on court à la faillite ! ");
		}
		else {
			System.out.println("La commande peux se passer sans accro !");
		}
	}
	
	public void LivraisonMarchandise(int Marchandise, int nombre, int argent) {
		if (Marchandise== Sucre) {
			//le sucre coute 5 euros l'unité
			Sucre+= nombre;
			argent-=nombre*5;
			CheckArgent();
		}
		if (Marchandise== Cafe) {
			//le Café coute 10 euros l'unité
			Cafe+= nombre;
			argent-=nombre*10;
			CheckArgent();
		}
		if (Marchandise== Thé) {
			//le Thé coute 7 euros l'unité
			Thé+= nombre;
			argent-=nombre*7;
			CheckArgent();
		}
		if (Marchandise== gobelet) {
			//le gobelet coute 2 euros l'unité
			gobelet+= nombre;
			argent-=nombre*2;
			CheckArgent();
		}
		else {
			//le touillette coute 0,5 euros l'unité
			touillette+= nombre;
			argent-=nombre*0.5;
			CheckArgent();
		}
	}
	public void CheckInventaire() {
		if (Sucre != 200) {
			int a = 200 -Sucre;
			System.out.println("Il manque " + a + " de sucre, il faut faire une livraison");
			LivraisonMarchandise(Sucre, a, argent);
		}
		if (Cafe!= 200) {
			int b = 200 -Cafe;
			System.out.println("Il manque " + b + " de Cafe, il faut faire une livraison");
		}
		if (Thé != 200) {
			int c = 200 -Thé;
			System.out.println("Il manque " + c + " de Thé, il faut faire une livraison");
		}
		if (gobelet != 200) {
			int d = 200 -gobelet;
			System.out.println("Il manque " + d + " de gobelet, il faut faire une livraison");
		}
		if (touillette != 200) {
			int e = 200 -touillette;
			System.out.println("Il manque " + e + " de touillette, il faut faire une livraison");
		}
		else {
			System.out.println("Tout est bon");
		}
	}
}
