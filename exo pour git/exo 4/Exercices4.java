package Exercices;

import java.util.Scanner;

public class Exercices4 {
	public static void main(String[] args) { 
		 
		Scanner reader = new Scanner(System.in);               //PARTIE UN DEMANDE AUX UTILISATEURS 
	
		                                                      //question a utilisateur 
		System.out.println("veuillez choisir un nombre ");
		
		                                                    //DECLARE VARIABLE X int 
	int x;
	                                                    //RECUPERATION DE SAISIE int 
	 x= reader.nextInt();
	 
	                                                            // afficher saisie de utilisateur a l'ecran 
System.out.println("la saisie du premier nombre est "+x);
	 
                                                                     // DEUXIEME question
System.out.println("veuillez choisir un deuxieme nombre ");
	 
                                                                 // declare variable y int 	 
	 int y;
	                                                              //recuperation de saisie int 
	 y= reader.nextInt();
	                                                               // afficher saisie de utilisateur a l'ecran 
System.out.println("la saisie du nombre est  "+y);
	                                                               // question utilisateur 
System.out.println("choisir un operateur");
	string op ;
	op=reader.nextLine();
	String myString = op;
	int foo = Integer.parseInt(op);
		                                                          //RECUPERATION DE SAISIE INT 
	                                                             //afficher saisie de utilisateur a l'ecran 
System.out.println("Le signe de calcul est "+op);
		                                                        // debut de la deuxieme partie switch 
	switch (op) {
	 case "+":                                                     //DECLARE VARIABLE a
			int a = x+y; 
						  			        
System.out.println("la reponse du calcul est" + a);              //reponse utilisateur 
	break ; 
		  case "-":
			  int b;
			  			b=x-y ;
System.out.println("la reponse du calcul est" + b);
	break ;
		  case "*":
			  int c;
			  			c=x*y;
System.out.println("la reponse du calcul est" + c);
	break ;
		  case "/":
			  int d;
			  			d=x/y;
System.out.println("la reponse du calcul est" + d);
	break; 
		    
		    default: 
System.out.println("vous avez diviser par o ou votre calcul depasse 1000 ou -1000");
	
		 }
		}
	}


	