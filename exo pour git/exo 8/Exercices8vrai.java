package Exercices;

import java.util.Scanner;

public class Exercices8vrai {
	public static void main(String[] args) { 
		int b=0 ;
		for (int i=0; i <20.; i++) {
	Scanner reader = new Scanner(System.in);                       
			                          System.out.println("Veuillez entrez votre age :");        
	int joueur = reader.nextInt();
			if (joueur<=20) {
				b++;
			}
                                         System.out.println("Votre age est de :" + joueur);
			
			                                          
		
System.out.println ("nombre de personne avec un ages de moins de 20 ANS est de " +b );	
	}
	}
}
