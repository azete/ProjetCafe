package Utilisateur;

import GestionInventaire.Semaines;
import GestionInventaire.InventaireBoîte;
import GestionInventaire.InventaireMaison;

public class Interface {
	public static void mainMenu() {
		System.out.println("1. Semaine 1");
		System.out.println("2. Semaine 2");
		System.out.println("3. Semaine 3");

		try {
			int userInput = Integer.parseInt(inputOutput("Veuillez selectionner quelle semaines pour la tournée !"));

			if (userInput >= 0 && userInput <= 3) {
				if (userInput == 1)
					choix1();
				if (userInput == 2)
					;
				if (userInput == 3)
					;
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
		InventaireBoîte sodebo= new InventaireBoîte(200,200,200,200,200,500);
		InventaireMaison maison= new InventaireMaison(150, 150, 150, 150, 150, 500, 0, 0, 0, 0, 0, 0);
		System.out.println("Vous avez donc choisis la semaine 1 !\n Maintenant que souhaitez vous faire ? ");
		System.out.println("1. CheckInventaireSociété");
        System.out.println("2. CheckInventaireMaison");
        System.out.println("3. regarder les finances");
        System.out.println("4. Faire la livraison");
        System.out.println("5. Remplir la maison");
        
        try {
        	int userInput2 = Integer.parseInt(inputOutput("Veuillez selectionner un nombre entre 1- !"));
        	
        	if (userInput2 >= 0 && userInput2 <=5) {
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
 	        	System.out.println("Veuillez selectionner un nombre entre 1- 3");
 	        	choix1();
 	     }
		
	}
	public static void choix2() {
		InventaireBoîte sodebo= new InventaireBoîte(200,200,200,200,200,500);
		InventaireMaison maison= new InventaireMaison(150, 150, 150, 150, 150, 500, 0, 0, 0, 0, 0, 0);
		System.out.println("Vous avez donc choisis la semaine 1 !\n Maintenant que souhaitez vous faire ? ");
		System.out.println("1. CheckInventaireSociété");
        System.out.println("2. CheckInventaireMaison");
        System.out.println("3. regarder les finances");
        System.out.println("4. Faire la livraison");
        System.out.println("5. Remplir la maison");
        
        try {
        	int userInput2 = Integer.parseInt(inputOutput("Veuillez selectionner un nombre entre 1- !"));
        	
        	if (userInput2 >= 0 && userInput2 <=5) {
		        if (userInput2 == 1) sodebo.VoirInventaire();
		        if (userInput2 == 2) maison.VoirInventaire();
		        if (userInput2 == 3) sodebo.CheckArgent();
		        if (userInput2 == 4) maison.faireLivraison(Semaines.B);
		        if (userInput2 == 5) maison.livraisonSemaine(Semaines.B);
        	} else {
	        		System.out.println("Veuillez selectionner un nombre entre  1 - 5");
	            	choix2();
	        	}
        	} catch (NumberFormatException e) {
 	        	System.out.println("Veuillez selectionner un nombre entre 1- 3");
 	        	choix2();
 	     }
		
	}
	public static void choix3() {
		InventaireBoîte sodebo= new InventaireBoîte(200,200,200,200,200,500);
		InventaireMaison maison= new InventaireMaison(150, 150, 150, 150, 150, 500, 0, 0, 0, 0, 0, 0);
		System.out.println("Vous avez donc choisis la semaine 1 !\n Maintenant que souhaitez vous faire ? ");
		System.out.println("1. CheckInventaireSociété");
        System.out.println("2. CheckInventaireMaison");
        System.out.println("3. regarder les finances");
        System.out.println("4. Faire la livraison");
        System.out.println("5. Remplir la maison");
        
        try {
        	int userInput2 = Integer.parseInt(inputOutput("Veuillez selectionner un nombre entre 1- !"));
        	
        	if (userInput2 >= 0 && userInput2 <=5) {
		        if (userInput2 == 1) sodebo.VoirInventaire();
		        if (userInput2 == 2) maison.VoirInventaire();
		        if (userInput2 == 3) sodebo.CheckArgent();
		        if (userInput2 == 4) maison.faireLivraison(Semaines.C);
		        if (userInput2 == 5) maison.livraisonSemaine(Semaines.C);
        	} else {
	        		System.out.println("Veuillez selectionner un nombre entre  1 - 5");
	            	choix3();
	        	}
        	} catch (NumberFormatException e) {
 	        	System.out.println("Veuillez selectionner un nombre entre 1- 3");
 	        	choix3();
 	     }
		
	}

	private static String inputOutput(String string) {
		return string;
	}
	 public static void main(String[] args) {
		    System.out.println("Bienvenu dans la gestion des inventaires de l'entreprise sodebo!\n");
		    mainMenu();
	 }
}
