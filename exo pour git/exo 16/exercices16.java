package Exercices;

import java.util.Scanner;

public class exercices16 {
	public static void main(String[] args) {
Scanner reader = new Scanner(System.in); 

System.out.println("    ===est-ce un palindrome===    "); System.out.println();

System.out.println("choisir un nom choisir un mots"); System.out.println();

	String mots= reader.nextLine();

		for (int i=0;i==mots.length();i++) {
	
	        char c =mots.charAt(i);    char d =mots.charAt(mots.length()-i) ;    
if(c==d) {                                                      
       System.out.println("votre mots et un palindrome");
    }

if(c!=d)
    {
       System.out.println("votre mots n'est pas un palindrome");
    }
    
		}
	
	}
}


