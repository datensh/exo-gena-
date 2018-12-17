package Exercices;
import java.util.Scanner;

public class Exercices12 {
	public static void main(String[] args) {
				
		for(int i = 0;i <3;i++) {
		System.out.println("========== les 4S DE LA CHANCE  =========== \n");
		System.out.println("pour gagner il suffit de sortir un quatre : \n\n\n");  
	int com = (int)(Math.random() * 10 + 1);       // on initialise com qui a une valeur rambon entre 1 est 10
	
		int inco = (int)(Math.random() * 10 + 1);     // ______________inco________________________________________
		
			int rare = (int)(Math.random() * 10 + 1);     // ______________rare________________________________________
			
				int mythe = (int)(Math.random() * 10 + 1);    // ______________mythe_______________________________________
				
					int legend = (int)(Math.random() * 10 + 1);   // ______________legend______________________________________

				int cat [] = {com,inco,rare,mythe,legend};
				
if (com==4) {
	System.out.println("#              ~retente ta chance 1£~                        #\n" );
}
		if (inco==4) {
			System.out.println("##                  ~~bien joue 10£ ~~                            ##\n"  );
}
				if (rare==4) {
					System.out.println("###             ~~~un bon resto 100£~~~                ###\n" );
}
					if (mythe==4) {
							System.out.println("####           ~~~~jackpot 1000£~~~~               ####\n"  );
}
						if (legend==4) {
								System.out.println("#####             ~~~~~jackpot 10000£~~~~~       #####\n" );
}			
							else
								System.out.println("retentez votre chance \n" );
	
							System.out.println("=====================recommencer ==================== \n" );
					String choixmembre;
				Scanner lectureClavier=new Scanner(System.in);
			System.out.println("Voulez vous rejouer ?(oui/non)");
		System.out.print("Votre choix : ");
	choixmembre=lectureClavier.next();
if(choixmembre=="oui"){
System.out.println("bonne chance.") ;
							   
if (choixmembre=="non")
		 break ;				
System.out.println("good bye ");
						
		   }
		}			
	}
}
						
	








