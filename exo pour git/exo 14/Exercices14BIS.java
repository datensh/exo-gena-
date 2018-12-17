package Exercices;
import java.util.Scanner;
public class Exercices14BIS {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);                       
			System.out.println("choisir votre mots");
			String mots= reader.nextLine();
			char c =mots.charAt(0);
			System.out.println(mots.toUpperCase());
			Scanner reaper = new Scanner(mots);
			mots = Character.toUpperCase(mots.charAt(0))+mots.substring(1);
			System.out.println(mots);
	}
}
		