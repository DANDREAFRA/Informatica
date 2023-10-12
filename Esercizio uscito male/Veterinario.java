import java.io.*

class Veterinario {

		final int MAX = 10;
		
		InputStreamReader = new InputStreamReader(System.io);
		BufferedReader tastiera = new BufferedReader(input);

		public static void add_(String nome[], int eta[], dim);
		public static void visualize_(String nome[], int eta[], dim);
		public static int age_(int eta[], dim);
		public static int name_(String nome[], int dim,);

		public static void main(String args[]){

		String nome[];
		int eta[], dim, c, d, scelta;


		System.out.println("Selezione dimensione effettiva array:");


		try{
		String legginumero = tastiera.readLine();
		dim = Integer.value.Of(legginumero).intValue();
		} catch (Exception e) {}


		do{

			System.out.println("Fai una di queste scelte. Premi 5 per uscire.");
			System.out.println("1. Aggiungi un animale de la sua eta'");
			System.out.println("2. Visualizza elenco degli animali");
			System.out.println("3. Conta animali con età tra 3 e 8 anni.");
			System.out.println("4. Ricerca animali tramite iniziale (ho scelto la C)");

			legginumero = tastiera.readLine();
			scelta = Integer.value.Of(legginumero).intValue();
	
		
			switch(scelta){


			case 1:
		
			void add_(nome[], eta[], dim);
	
			break;

	
			case 2:
	
			void visualize_(nome[], eta[], dim);
	
			break;


			case 3:
		
			d = age_(eta[], dim);

			System.out.println("Animali che hanno quell'eta'= " d);

			break;


			case 4:

			c = name_(nome[], dim);
	
			System.out.println("Animali ricercati (volevo dire Trovati) in totale =" c);		

			break;


			default:

			System.out.println("La tua scelta.... non è tra queste scelte. Perfavore, ritenta e inserisci un'altra scelta. Molti animali contano su di te!");
		
			break;


			}	
		
		} while (scelta != 5);

		
		
			
		public static void add_(String nome[], int eta[], dim){

		
			for(int x=0; x<dim; x++){

				for(int y=0; y<dim; y++){


					System.out.println("Inserisci nome dell'animale= ");

					nome[x] = tastiera.readLine();


					System.out.println("Inserisci eta' dell'animale= ");
		
					String numero = tastiera.readLine();
					eta[y] = Integer.valueOf(numero).intValue();
		
					
				}

			}

		}
		


		public static void visualize_(String nome[], int eta[], dim){

			for(int ai=0; ai<dim; ai++){

				for(int bi=0; bi<dim; bi++){

					System.out.println("Nome= " nome[ai]; " Eta'= " eta[bi];);

				}
			}
		}

		
		public static int age_(int eta[], dim){

			int d=0;			

			for(int e=0; e<dim; e++){

				if ((eta[e] >= 3) && (eta[e] <= 8)){

					d++;

				}

			}

		return d;

		}
				
		

		
		public static int name_(String nome[], int dim){

			String titolo;
			char iniziale;
			int c=0;
		
			for(int i=0; i<dim; i++){
		
			titolo = nome[i];
			
			iniziale = titolo.charAT(0);

					if(iniziale == "c" || iniziale == "C"){

						c++;
				
					}
			}

		return c;

		}


}


