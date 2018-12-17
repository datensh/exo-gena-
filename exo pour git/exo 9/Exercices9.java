package Exercices;

import java.util.Scanner;

public class Exercices9 {
public static void main(String[] args) {
			int b=0 ;                       //creation de b (personne de -20) 
			int c=0 ;                       //creation de c (personne de + 40)
			int e=0 ;                       //creation de e ( entre 20 ET 40)
			for (int i=0; i <5.; i++) {     // for par rapport au nombre de participant 
		Scanner reader = new Scanner(System.in);                   
				System.out.println("Veuillez entrez votre age :");        
	int joueur = reader.nextInt();
		if (joueur < 20) 
	b++ ;
		System.out.println ("nombre de personne avec un ages de moins de 20 ANS est de" +b ); {                                         
			if (joueur > 40) {                     
		c++; 
		System.out.println ("nombre de personne avec un ages de plus de 40 ANS est de" +c );}                                  
				if (joueur >20 || joueur >40 ) {
			e++;   
			System.out.println ("nombre de personne avec un ages entre 40 ET 20 ANS est de" +e );}                               
					if (joueur >100) {              
	System.out.println("l'un des participants a plus de 100 ans erreur system");
						
					break ;}                            // stop 
}
	}
		}
			}


