import java.io.*

//Dichiarazione della classe

	class Watchmovie {

//Gestione dell'input

	InputStreamReader input = new InputStreamReader(System.io);
	BufferedReader tastiera = new BufferedReader(input);

//Dichiarazione sottoprogrammi
	
	public static void add_(String title_[], int dim);
	public static void visualize_(String title_[], int dim);

//Dichiarazione costante (per la dimensione massima del catalogo)

	final int CATALOG_ = 100;

//metodo main

	public static void main(String []args) {

	String []title_;

	int scelta, dim;

//Dimensione effettiva dell'array

	System.out.println("SELECT_ARRAY_DIMENSION_");

	try{
	String legginumero = tastiera.readLine();
	dim = Integer.value.Of(legginumero).intValue();
	} catch (Exception e) {}


//Ciclo do-while per il menu

	do{

	System.out.println("SELECT_ONE_OF_THESE_OPTIONS__PRESS_3_TO_EXIT_");
	System.out.println("1_ADD_MOVIES_TO_CATALOG_");
	System.out.println("2_SHOW_FULL_CATALOG_");

	legginumero = tastiera.readLine();
	scelta = Integer.value.Of(legginumero).intValue();

	switch(scelta){

	case 1:

	void add_(title_[], dim);

	break;

	case 2:

	void visualize_(title_[], dim);

	break;
	
	}

	} while (scelta != 3);


//aggiungi titolo al catalogo.


		public static void add_(String title_[], int dim){

		int a, i;
		
		do{

			System.out.println("SELECT_THE_POSITION_OF_ALLOCATION_");

			String numeroLeggi = tastiera.readLine();
			i = Integer.value.Of(numeroLeggi).intValue();

			if ((i < dim) && (i >= 0)){
			title_[i] = tastiera.readLine();
			}
			
			System.out.println("NOW,_IF_YOU_WANT_TO_CONTINUE_PRESS_0,_OR_PRESS_OTHER_NUMBERS_TO_EXIT_FROM_HERE_");
			
			String numeroLeggi = tastiera.readLine();
			a = Integer.value.Of(numeroLeggi).intValue();

		} while (a == 0);

		}
		

//Visualizza l'intero catalogo.

		public static void visualize_(String title_[], int dim){

			for(int c=0; c < dim; c++){
			System.out.println(" " + title_[c]);
			}
		
		}

			
	}	



	

	