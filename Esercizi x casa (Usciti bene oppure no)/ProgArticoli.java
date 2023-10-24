//Libreria che include tutte le funzioni di imput/output

import java.io.*;

//classe ProgArticolo.java
public class ProgArticoli {
	
//Costante per il numero massimo di articoli
	static final int M = 30;
	
//contatore di articoli
	static int contArticoli = 0;
	
//metodo main

		public static void main(String []args){
			
			//Input
			
				BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
			
//olocitrA e' Articolo al contrario
				Articolo []olocitrA = new Articolo[M];
				
				String scelta;
				int s;
				
					do{
						System.out.println("Scegli uno di questi casi:");
						System.out.println("1.Inserire un articolo");
						System.out.println("2.Visualizza gli articoli");
						System.out.println("3.Visualizza l'articolo piu' costoso");
						System.out.println("Se ti sei stancato, ti do la possibilita' di uscire da questo file '.java' premendo 4");
						
						scelta = tastiera.readLine;
						s = Integer.valueOf(scelta).intValue();
						
						switch(s){
							
							case 1:
							
								add(olocitrA);
							
							break;
							
							case 2:
							
								visualize(olocitrA);
								
							break;
							
							case 3:
							
								expensive(olocitrA);
								
							break;
						
//Come ingannare l'utente che utilizza per la prima volta il mio programma.....hahahaha
							case 4:
							
								System.out.println("HAHAHAHAHAHAH! SEI STATO FREGATO E RIMARRAI INTRAPPOLATO QUI!! a meno che non digiti il numero giusto che ti permetta di uscire.");
								System.out.println("Posso darti un minuscolo indizio: Fai la media di tutti i numeri dispari da 3 a 10");
								
							break;
							
							case 5:
							
								System.out.println("HAHAHAHAHAHAH! SEI STATO FREGATO E RIMARRAI INTRAPPOLATO QUI!! a meno che non digiti il numero giusto che ti permetta di uscire.");
								System.out.println("Posso darti un minuscolo indizio: Fai la media di tutti i numeri dispari da 3 a 10");
								
							break;
							
							case 7:
							
								System.out.println("HAHAHAHAHAHAH! SEI STATO FREGATO E RIMARRAI INTRAPPOLATO QUI!! a meno che non digiti il numero giusto che ti permetta di uscire.");
								System.out.println("Posso darti un minuscolo indizio: Fai la media di tutti i numeri dispari da 3 a 10");
								
							break;
							
							case 8:
							
								System.out.println("HAHAHAHAHAHAH! SEI STATO FREGATO E RIMARRAI INTRAPPOLATO QUI!! a meno che non digiti il numero giusto che ti permetta di uscire.");
								System.out.println("Posso darti un minuscolo indizio: Fai la media di tutti i numeri dispari da 3 a 10");
								
							break;
							
							case 9:
							
								System.out.println("HAHAHAHAHAHAH! SEI STATO FREGATO E RIMARRAI INTRAPPOLATO QUI!! a meno che non digiti il numero giusto che ti permetta di uscire.");
								System.out.println("Posso darti un minuscolo indizio: Fai la media di tutti i numeri dispari da 3 a 10");
								
							break;
							
							case 10:
							
								System.out.println("HAHAHAHAHAHAH! SEI STATO FREGATO E RIMARRAI INTRAPPOLATO QUI!! A meno che non digiti il numero giusto che ti permetta di uscire.");
								System.out.println("Posso darti un minuscolo indizio: Fai la media di tutti i numeri dispari da 3 a 10");
								
							break;
							
							default:
							
								System.out.println("La tua scelta e'........................................................................SBAGLIATA! Ritenta.");
								
							break;
							}
							
						}while(s!=6)
							
								System.out.println("AH, DANNAZIONE, MA COME HAI FATTO...?! Va bene, stavolta ti lascero' andare. Ma solo questa volta. Arrivederci!");
		}
		
//Aggiungere articoli 

		public static void add(Articolo[] olocitrA){
			
			String nome = "", descrizione = "", p = "";
			
			float prezzo;
			
				if(contArticoli < M){
					
					System.out.println("Inserire il nome, la descrizione e il prezzo dell'articolo");
								
									nome = tastiera.readLine();
									
									descrizione = tastiera.readLine();
									
									p = tastiera.readLine();
									prezzo = Float.valueOf(p).floatValue();
									
				}
			
			contArticoli++;
		
		}
		
//Visualizzare Articoli 

		public static void visualize(Articolo[] olocitrA){
		
			for(int i=0; i<M; i++){
				
				if (olocitrA[i] !=null){
					
					System.out.println("\nArticolo = " + (i + 1));
					System.out.println(olocitrA[i].toString());
					System.out.println("\nPrezzo = ");
					System.out.println(olocitrA[i].toFloat());
				}
			}
		}
		
		public static void expensive(Articolo[] olocitrA){
			
			float max= olocitrA[0].getPrezzo();
			
			for(int a=1; a<olocitrA.length; a++){
				
				if(olocitrA[a].getPrezzo()>max) { max=olocitrA[a].getPrezzo(); }
				
			}
			
			System.out.println("Il massimo prezzo e' = " +max);
			
		}
				
}