package Exercices;                   //scanner =entree clavier (ce trouve dans java.util)                  
import java.util.Scanner;       

public class Exercice1 {
	public static void main(String[] args) {                   
	Scanner sc = new Scanner(System.in);                       //
	System.out.println("Veuillez choisir un nom :");           //SYSTEMOUTPRINTLN = AFFICHER PARENTHESE (?)
	String joueur = sc.nextLine();                             // RECUPERATION DE DONNÉES EN FONCTION TYPES NOMBRE LETTRE ... 
	System.out.println("bienvenue :  "+ joueur);

	do   //ici on boucle tant que l'utilisateur n'a pas rentré une bonne donnée
    {
        printf("souhaitez vous continuer?\n");
        scanf("%d", continuer);
    }while(continuer !=0 || continuer !=1);
 }
 return 0;
}