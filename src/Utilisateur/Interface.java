package Utilisateur;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import GestionInventaire.Semaines;
import GestionInventaire.InventaireBoite;
import GestionInventaire.InventaireMaison;

public class Interface {
	public static void mainMenu() {
		System.out.println("1. Semaine 1");
		System.out.println("2. Semaine 2");
		System.out.println("3. Semaine 3");

		try {
			int userInput = Integer.parseInt(inputOutput("Veuillez selectionner quelle semaines pour la tournee !"));

			if (userInput >= 0 && userInput <= 3) {
				if (userInput == 1) choix1();
				if (userInput == 2) choix2();
				if (userInput == 3) choix3();
				if (userInput== 0) System.exit(0);
			} else {
				System.out.println("Veuillez selectionner un nombre entre  1 - 3");
			mainMenu();
			}

		} catch (NumberFormatException e) {
			System.out.println("Veuillez selectionner un nombre entre 1- 3");
			mainMenu();
		}
	}

	public static void choix1() {
		InventaireBoite sodebo = new InventaireBoite(200, 200, 200, 200, 200, 500);
		InventaireMaison maison = new InventaireMaison(150, 150, 150, 150, 150, 500, 0, 0, 0, 0, 0, 0);
		System.out.println("Vous avez donc choisis la semaine 1 !\n Maintenant que souhaitez vous faire ? ");
		System.out.println("1. CheckInventaireSociete");
		System.out.println("2. CheckInventaireMaison");
		System.out.println("3. regarder les finances");
		System.out.println("4. Faire la livraison");
		System.out.println("5. Remplir la maison");

		try {
			int userInput2 = Integer.parseInt(inputOutput("Veuillez selectionner un nombre entre 1- 5!"));

			if (userInput2 > 0 && userInput2 <= 5) {
				if (userInput2 == 1) sodebo.VoirInventaire();
				if (userInput2 == 2) maison.VoirInventaire();
				if (userInput2 == 3) sodebo.CheckArgent();
				if (userInput2 == 4) maison.faireLivraison(Semaines.A);
				if (userInput2 == 5) maison.livraisonSemaine(Semaines.A);
			} else {
				System.out.println("Veuillez selectionner un nombre entre  1 - 5");
			choix1();
			}
		} catch (NumberFormatException e) {
			System.out.println("Veuillez selectionner un nombre entre 1- 5");
			choix1();
		}
		choix1part2();
	}
	public static void choix1part2() {
		System.out.println("1. Revenir au menu des choix de semaines");
        System.out.println("2. Revenir au choix des options de la premiere semaine");
        System.out.println("3. Partir");
		try {
			int userInput3 = Integer.parseInt(inputOutput("Veuillez selectionner 1 - 3 !"));
			if (userInput3 >0 && userInput3 <=3) {
				if (userInput3 == 1) mainMenu();
				if (userInput3 == 2) choix1();
				if (userInput3 == 2) System.out.println("Merci de votre visite, je vous souhaite une bonne journee !");
			}else {
				System.out.println("Veuillez selectionner un nombre entre  1 - 3");
				choix1part2();
			}
			}catch (NumberFormatException e) {
				System.out.println("Veuillez selectionner un nombre entre 1 et 3");
				choix1part2();
			}

	}

	public static void choix2() {
		InventaireBoite sodebo = new InventaireBoite(200, 200, 200, 200, 200, 500);
		InventaireMaison maison = new InventaireMaison(150, 150, 150, 150, 150, 500, 0, 0, 0, 0, 0, 0);
		System.out.println("Vous avez donc choisis la semaine 1 !\n Maintenant que souhaitez vous faire ? ");
		System.out.println("1. CheckInventaireSociete");
		System.out.println("2. CheckInventaireMaison");
		System.out.println("3. regarder les finances");
		System.out.println("4. Faire la livraison");
		System.out.println("5. Remplir la maison");

		try {
			int userInput2 = Integer.parseInt(inputOutput("Veuillez selectionner un nombre entre 1- !"));

			if (userInput2 > 0 && userInput2 <= 5) {
				if (userInput2 == 1) sodebo.VoirInventaire();
				if (userInput2 == 2)maison.VoirInventaire();
				if (userInput2 == 3)sodebo.CheckArgent();
				if (userInput2 == 4)maison.faireLivraison(Semaines.B);
				if (userInput2 == 5)maison.livraisonSemaine(Semaines.B);
			} else {
				System.out.println("Veuillez selectionner un nombre entre  1 - 5");
			choix2();
			}
		} catch (NumberFormatException e) {
			System.out.println("Veuillez selectionner un nombre entre 1- 5");
			choix2();
		}
		choix2part2();
	}
	public static void choix2part2() {
		System.out.println("1. Revenir au menu des choix de semaines");
        System.out.println("2. Revenir au choix des options de la deuxieme semaine");
        System.out.println("3. Partir");
		try {
			int userInput3 = Integer.parseInt(inputOutput("Veuillez selectionner 1 - 3 !"));
			if (userInput3 >0 && userInput3 <=3) {
				if (userInput3 == 1) mainMenu();
				if (userInput3 == 2) choix2();
				if (userInput3 == 3) System.out.println("Merci de votre visite, je vous souhaite une bonne journee !");
			}else {
				System.out.println("Veuillez selectionner un nombre entre  1 - 3");
				choix2part2();
			}
			}catch (NumberFormatException e) {
				System.out.println("Veuillez selectionner un nombre entre 1 et 3");
				choix2part2();
			}

	}

	public static void choix3() {
		InventaireBoite sodebo = new InventaireBoite(200, 200, 200, 200, 200, 500);
		InventaireMaison maison = new InventaireMaison(150, 150, 150, 150, 150, 500, 0, 0, 0, 0, 0, 0);
		System.out.println("Vous avez donc choisis la semaine 1 !\n Maintenant que souhaitez vous faire ? ");
		System.out.println("1. CheckInventaireSociete");
		System.out.println("2. CheckInventaireMaison");
		System.out.println("3. regarder les finances");
		System.out.println("4. Faire la livraison");
		System.out.println("5. Remplir la maison");

		try {
			int userInput2 = Integer.parseInt(inputOutput("Veuillez selectionner un nombre entre 1- !"));

			if (userInput2 > 0 && userInput2 <= 5) {
				if (userInput2 == 1)sodebo.VoirInventaire();
				if (userInput2 == 2)maison.VoirInventaire();
				if (userInput2 == 3)sodebo.CheckArgent();
				if (userInput2 == 4)maison.faireLivraison(Semaines.C);
				if (userInput2 == 5)maison.livraisonSemaine(Semaines.C);
			} else {
				System.out.println("Veuillez selectionner un nombre entre  1 - 5");
			choix3();
			}
		} catch (NumberFormatException e) {
			System.out.println("Veuillez selectionner un nombre entre 1- 5");
			choix3();
		}
		choix3part2();
	}
	public static void choix3part2() {
		System.out.println("1. Revenir au menu des choix de semaines");
        System.out.println("2. Revenir au choix des options de la Troisieme semaine");
        System.out.println("3. Partir");
		try {
			int userInput3 = Integer.parseInt(inputOutput("Veuillez selectionner 1 - 3 !"));
			if (userInput3 >0 && userInput3 <=3) {
				if (userInput3 == 1) mainMenu();
				if (userInput3 == 2) choix3();
				if (userInput3 == 3) System.out.println("Merci de votre visite, je vous souhaite une bonne journee !");
			}else {
				System.out.println("Veuillez selectionner un nombre entre  1 - 3");
				choix3part2();
			}
			}catch (NumberFormatException e) {
				System.out.println("Veuillez selectionner un nombre entre 1 et 3");
				choix3part2();
			}

	}
	private static String inputOutput(String message) {
        System.out.println(message);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String returnString = "";
	    try {
	        returnString = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println("Error reading in value");
	        mainMenu();
	    }
	    return returnString;
    }


	public static void main(String[] args) {
		System.out.println("Bienvenu dans la gestion des inventaires de l'entreprise sodebo!\n");
		mainMenu();
	}
}
