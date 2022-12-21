package GestionInventaire;

public class InventaireBoîte {
	public int Sucre;
	public int Cafe;
	public int Thé;
	public int gobelet;
	public int touillette;
	public int argent;
	public Semaines[] semaines = new Semaines[3];

	public InventaireBoîte(int Sucre, int Cafe, int Thé, int gobelet, int touillette, int argent) {
		this.Cafe = Cafe;
		this.gobelet = gobelet;
		this.Sucre = Sucre;
		this.Thé = Thé;
		this.touillette = touillette;
		this.argent = argent;
	}

	public void CheckArgent() {
		if (argent < 0) {
			System.out.println("La société est en faillite ! Il faut faire un prêt ou sinon c'est la fin!");
		}
		if (argent <= 150) {
			System.out.println(
					"Il faut se revoir le plan de vente et peut être augmenter les prix ! sinon on court à la faillite ! ");
		} else {
			System.out.println("Pas de probleme niveau argent car nous en avons  " + argent + " ! ");
		}
	}

	public void VoirInventaire() {
		System.out.println("Il y a  " + Sucre + " de sucre");
		System.out.println("Il y a  " + Cafe + " de Café à la société");
		System.out.println("Il y a  " + Thé + " de Thé à la société");
		System.out.println("Il y a  " + gobelet + " de gobelet a la société");
		System.out.println("Il y a  " + touillette + " de touillette à la société");
		System.out.println("Il y a  " + argent + " d'argent a la société ");
	}

	public void LivraisonMarchandise(int Marchandise, int nombre, int argent) {
		if (Marchandise == Sucre) {
			// le sucre coute 5 euros l'unité
			Sucre += nombre;
			argent -= nombre * 5;
			CheckArgent();
			System.out.println("La livraison de  sucre c'est bien passé ");
		}
		if (Marchandise == Cafe) {
			// le Café coute 10 euros l'unité
			Cafe += nombre;
			argent -= nombre * 10;
			CheckArgent();
			System.out.println("La livraison de  Cafe c'est bien passé ");
		}
		if (Marchandise == Thé) {
			// le Thé coute 7 euros l'unité
			Thé += nombre;
			argent -= nombre * 7;
			CheckArgent();
			System.out.println("La livraison de  Thé c'est bien passé ");
		}
		if (Marchandise == gobelet) {
			// le gobelet coute 2 euros l'unité
			gobelet += nombre;
			argent -= nombre * 2;
			CheckArgent();
			System.out.println("La livraison de  gobelet c'est bien passé ");
		}
		if (Marchandise == touillette) {
			// le touillette coute 0,5 euros l'unité
			touillette += nombre;
			argent -= nombre * 0.5;
			CheckArgent();
			System.out.println("La livraison de touillette c'est bien passé ");
		} else {
			System.out.println("Le produit n'est pas dans nos machines ! ");
		}
	}

	public void CheckInventaire(int x) {
		if (Sucre < x) {
			int a = x - Sucre;
			System.out.println("Il manque " + a + " de sucre, il faut faire une livraison");
			LivraisonMarchandise(Sucre, a, argent);
		}
		if (Cafe < x) {
			int b = x - Cafe;
			System.out.println("Il manque " + b + " de Cafe, il faut faire une livraison");
		}
		if (Thé < x) {
			int c = x - Thé;
			System.out.println("Il manque " + c + " de Thé, il faut faire une livraison");
		}
		if (gobelet < x) {
			int d = x - gobelet;
			System.out.println("Il manque " + d + " de gobelet, il faut faire une livraison");
		}
		if (touillette < x) {
			int e = x - touillette;
			System.out.println("Il manque " + e + " de touillette, il faut faire une livraison");
		} else {
			System.out.println("Tout est bon");
		}
	}

	public void remplir(int Sucrenb, int Cafenb, int Thénb, int gobeletnb, int touillettenb) {
		if (Sucre - Sucrenb < 0) {
			System.out.println("Pas assez de Sucre il faut vérifier l'inventaire ! ");
			CheckInventaire(Sucrenb);
		}
		Sucre -= Sucrenb;
		if (Cafe - Cafenb < 0) {
			System.out.println("Pas assez de Cafe il faut vérifier l'inventaire ! ");
			CheckInventaire(Cafenb);
		}
		Cafe -= Cafenb;
		if (Thé - Thénb < 0) {
			System.out.println("Pas assez de Thé il faut vérifier l'inventaire ! ");
			CheckInventaire(Thénb);
		}
		Thé -= Thénb;
		if (gobelet - gobeletnb < 0) {
			System.out.println("Pas assez de gobelet il faut vérifier l'inventaire ! ");
			CheckInventaire(gobeletnb);
		}
		gobelet -= gobeletnb;
		if (touillette - touillettenb < 0) {
			System.out.println("Pas assez de touillette il faut vérifier l'inventaire ! ");
			CheckInventaire(touillettenb);
		}
		touillette -= touillettenb;
		// on enleve les différents produits pour qu'ils soient rajouter dans la classe
		// fille avec l'héritage
	}

	public void livraisonSemaine(Semaines semaines) {
		if (semaines.toString() == Semaines.A.toString()) { // ici les semaines correspondent au nombres de produits
															// qu'il faut pour toute
			// la semaine
			if (Sucre >= 60 & Cafe >= 45 & Thé >= 35 & gobelet >= 45 & touillette >= 45) {
				remplir(60, 45, 35, 45, 45);
			} else {
				CheckInventaire(60); // on check ici l'inventaire avec le nombre le plus haut des produits
			}
		}
		if (semaines.toString() == Semaines.B.toString()) {
			if (Sucre >= 75 & Cafe >= 85 & Thé >= 65 & gobelet >= 85 & touillette >= 85) {
				remplir(75, 85, 65, 85, 85);
			} else {
				CheckInventaire(85);
			}
		}
		if (semaines.toString() == Semaines.C.toString()) {
			if (Sucre >= 100 & Cafe >= 100 & Thé >= 100 & gobelet >= 100 & touillette >= 100) {
				remplir(100, 100, 100, 100, 100);
			} else {
				CheckInventaire(100);
			}
		}
	}

	public void recevoirArgent(int money) {
		argent += money;
	}

//	public static void main(String[] args) {
//		InventaireBoîte sodebo = new InventaireBoîte(150, 150, 150, 150, 150, 500);
//		// sodebo.CheckArgent();
//		sodebo.CheckInventaire(500);
//		sodebo.VoirInventaire();
//		sodebo.livraisonSemaine(Semaines.A);
//		sodebo.VoirInventaire();
//	}
}
