package Exercices;

import java.util.Scanner;

public class Exercices7 {
public static void main(String[] args) { 
		Scanner reaper  = new Scanner(System.in);
		System.out.println("choisir le nombre dont vous desirez les multiples");
int user = reaper.nextInt();      
		System.out.println("choisir le nombre de multiple");
int x = reaper.nextInt();
		System.out.println("choisir le nombre de base "  + user );
		System.out.println("nombres de multiples" +  x);
		do {
			   user = user * user ;                        // on multiplie le nombre souhaitez par lui meme 
		System.out.println( user );                        // saisir le resultat de chaque manipulation
			   x = x - 1;                                  // on retire x qui est un compteur inversé
			} while ( x  >0 );                             // si le nombre de multiple = 0 donc on arrete	
		
	}
}
