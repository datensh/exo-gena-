package Exercices;

import java.util.Scanner;

public class Exercices17  {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int life = 5;            // vie du joueur
		
		System.out.println("###### le jeu du pendu ######");
		System.out.println("   ___________ ");
		System.out.println("    |      | | ");
		System.out.println("    |      | | ");
		System.out.println("  mmmmm    | | ");
		System.out.println(" d @ @ b   | | ");
		System.out.println("   ---     | | ");
		System.out.println("   WWW     | | ");
		System.out.println("           | | ");
		System.out.println("          _| |_");
		System.out.println("      _-r[_____]r-_");
		

		System.out.println("choisir un nom a faire deviner");
						String mots= reader.nextLine();
						if (10<=mots.length()) {
							System.out.println("votre choix n'est pas valide");
							return;
						}
						
						System.out.println("aller chercher l'autre joueur");
						
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();

						System.out.println("le mots a deviner contient "+mots.length()+" lettre ");
	
System.out.println("choisir une lettre");
	String test= reader.nextLine();
	char[] charArray = mots.toCharArray();
	
	for(char c: charArray) 
	{
int x=mots.indexOf(test);
 
if (x==c); {
	 System.out.println("[" + x + "] ");
 }
 if(x==-1) {
	 System.out.println("tic tac");
 }
	}						
	}
}


