package Exercices; //FAIRE TABLE DE TROIS ENTRES UTILISATEUR ALEATOIRE JUSKA 10 

import java.util.Scanner;

public class Exercices3 {                                                // pas de for car compliquer pour rien dans ce cas 
	public static void main(String[] args) { 		
		Scanner sc = new Scanner(System.in);                      
		System.out.println("Veuillez choisir un nombre :");    // PARTI INTERACTION UTILISATEUR        
		int user = sc.nextInt();                         //recuperation données 
		int x = 3;                                          //valeur de x defini 
		int j = user;                                   // var de j
        int r = (x*j);                                 // valeur de r , x x j 
		                                               //!!!!pas encore interaction entre les deux parti !!!!
		System.out.println(r);                        // afficher r (' 	
	}
}	
