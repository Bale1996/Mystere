package jeu;

import java.util.*;

public class Mystere {
	
	public static void main(String[] argv) {
		
		char lettre='e';
		char carac='a';
		int niveau;
		int mystere=50;
		int nombre=0;
		int i;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----------Bienvenue au jeu de mystere---------");
		System.out.println("----------Veuillez choisir le niveau----------");
		System.out.println("---------- 1 : Niveau facile -----------------");
		System.out.println("---------- 2 : Niveau moyen ------------------");
		System.out.println("---------- 3 : Niveau difficile --------------");
		System.out.println("---------- 0 : Quitter -----------------------");
		
		niveau=scanner.nextInt();
		if(niveau==1) {
			
			
			System.out.println("Niveau facile : Le mystere est un nombre entre 0 et 100");
			
			for (i=0 ; i<15 && nombre!=mystere ; i++) {
				
			System.out.println("Donner le mystere entre 0 et 100");
			nombre=scanner.nextInt(); 	
			
			if (nombre<mystere) {System.out.println("c'est plus, il vous reste "+(10-i-1)+" tentatives");}
			if (nombre>mystere) {System.out.println("c'est moins, il vous reste "+(10-i-1)+" tentatives");}
			      }
			if(nombre==mystere) {System.out.println("Bravo ! vous avaez gagne au bout de "+i+" tentative");}
			        
		}
		
		
		
         if(niveau==2) {
			
			
			System.out.println("Niveau moyen : Le mystere est un nombre entre 0 et 10000");
			
			for (i=0 ; i<10 && nombre!=mystere ; i++) {
				
			System.out.println("Donner le mystere entre 0 et 10000");
			nombre=scanner.nextInt(); 	
			
			if (nombre<mystere) {System.out.println("c'est plus, il vous reste "+(10-i-1)+" tentatives");}
			if (nombre>mystere) {System.out.println("c'est moins, il vous reste "+(10-i-1)+" tentatives");}
			      }
			if(nombre==mystere) {System.out.println("Bravo ! vous avez gagne au bout de "+i+" tentative");}
			

			        
		}
         
         
         
         
         if(niveau==3) {
 			
        	System.out.println("Niveau difficile :");
 			System.out.println("Le mystere est un nombre entre 0 et 100");
 			System.out.println("Le caractere est une lettre de alphabet");
 			
 			for (i=0 ; i<10 && nombre!=mystere && lettre!=carac ; i++) {
 				
 			System.out.println("Donner le mystere entre 0 et 10000");
 			nombre=scanner.nextInt(); 	
 			
 			System.out.println("Donner le caractere");
 			lettre=scanner.next().charAt(0);
 			
 			if (nombre<mystere && lettre<carac) {System.out.println("le mystere est plus, le caractere est apres, il vous reste "+(10-i-1)+" tentatives");}
 			if (nombre<mystere && lettre>carac) {System.out.println("le mystere est plus, le caractere est avant, il vous reste "+(10-i-1)+" tentatives");}
 			if (nombre<mystere && lettre==carac) {System.out.println("le mystere est plus, le caractere est correct, il vous reste "+(10-i-1)+" tentatives");}
 			
 			if (nombre>mystere && lettre>carac) {System.out.println("le mystere est moins, le caractere est avant, il vous reste "+(10-i-1)+" tentatives");}
 			if (nombre>mystere && lettre<carac) {System.out.println("le mystere est moins, le caractere est apres, il vous reste "+(10-i-1)+" tentatives");}
 			if (nombre>mystere && lettre==carac) {System.out.println("le mystere est moins, le caractere est correct, il vous reste "+(10-i-1)+" tentatives");}
 			
 			if (nombre==mystere && lettre>carac) {System.out.println("le mystere est correct, le caractere est avant, il vous reste "+(10-i-1)+" tentatives");}
 			if (nombre==mystere && lettre<carac) {System.out.println("le mystere est correct, le caractere est apres, il vous reste "+(10-i-1)+" tentatives");}

 			      }
 			if (nombre==mystere && lettre==carac) {System.out.println("Bravo ! vous avez gagne au bout de "+i+" tentative");}
 			        
 		}
         
         
	}

	
}
