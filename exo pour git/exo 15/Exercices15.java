package Exercices;


import java.util.Scanner;

public class Exercices15 {
	public static void main(String[] args) {
		System.getProperty("line.separator");

										Scanner reader = new Scanner(System.in);                       

System.out.println("choisir un nom d'utilisateur");
				String mots= reader.nextLine();    // entrer de utilisateur = mots 
				
				System.out.println();
				
				System.out.println(mots.substring(    mots.length()-3     ,     mots.length()));
				System.out.println();
/*				                        |                        |              |
	           on afficher "une partie de mots"  on commence a partir de -3   juska la fin du mots 
	           
	           traduction litteral substring= stringsoutterain                
*/
System.out.println("ce sont bien les 3 derniers carateres de votre choix ?");
System.out.println();

System.getProperty( "line.separator" );
System.out.println();

System.out.println("votre choix est-il le bon ?");
System.out.println();
				
				System.out.println(mots.substring(2,mots.length()-3));
System.out.println();
/*
       a voir de faire de meme pour decrire cette nouvelle commande 
       				
 */
System.out.println("pour que vous soyez sur");
	}
}