package Utilisateur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import GestionInventaire.Semaines;
import GestionInventaire.InventaireBoîte;

public class Interface {
	 public static void mainMenu() {
	        System.out.println("1. Semaine A");
	        System.out.println("2. Semaine B");
	        System.out.println("3. Semaine C");
	        
	        try {
	        	int userInput = Integer.parseInt(inputOutput("Veuillez selectionner quelle semaines pour la tournée !"));
	        	
	        	if (userInput >= 0 && userInput <=3) {
			        if (userInput == 1) ;
			        if (userInput == 2) ;
			        if (userInput == 3) ;
	        	} else {
	        		System.out.println("Please enter a number from 1 - 3");
	            	mainMenu();
	        	}
	        } catch (NumberFormatException e) {
	        	System.out.println("Please enter a number from 1- 3");
	        	mainMenu();
	        }
	    }

	private static String inputOutput(String string) {
		return string;
	}
}
