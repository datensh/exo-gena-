package Exercices;

public class Exercice19 {

	public static void main(String[] args) {
		  int tab[]= new int [8];

	        for(int i=0; i < tab.length; i++){
	            tab[i]= (int) (Math.random() * 100 +1);

	            System.out.print(" "+ tab[i]);

	        }

	        for( int i = 0; i<tab.length; i++) {

	            for (int j = 0; j<tab.length-1; j++) {

	                if (tab[j]>tab[j+1]) {
	                    int temp = tab[j];
	                    tab[j] = tab[j+1];
	                    tab[j+1] = temp;

	                }

	            }
	        }
	        System.out.println("\n");
	        for(int i=0; i < tab.length; i++){


	            System.out.print(" "+ tab[i]);

	        }
	    }
}
