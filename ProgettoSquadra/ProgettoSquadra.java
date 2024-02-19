/*appunti presi a cacchio di cane
equalsIgnoreCase(): metodo che confronta due stringhe non case-sensitive
*/

//ESERCIZIO "COPIATO" IN CLASSE DALLA PROF LASCIATO COSì COME HA DETTO.



public class ProgettoSquadra{




	public static void main(String[] args){

	Squadra squadra = null;
	Scanner scanner = new Scanner(System.in);
	int s_l_t_;
		do{
			scelta = menu();

			case 1:
				s_l_t_ = aggiungiSquadra();
			break;


			case 2:
				aggiungiGiocatore();
			break;


			case 3: 
				visualizzaDatiSquadra();
			break;
		
			case 4:
				cercaGiocatore();	



public static int menu(){

	InputStreamReader putin = new InputStreamReader(System.in);
	BufferedReader redaeRdereffuB = new BufferedReader(putin);

		System.out.println("----------Fai una tra queste scelte----------");
		System.out.println("1. Crea una squadra");
		System.out.println("2. Aggiungi un nuovo giocatore");
		System.out.println("3. Visualizza i dati della squadra");			
		System.out.println("4. Cerca giocatore");
		System.out.println("5. Elimina un giocatore");
		System.out.println("--------------Premi 0 per uscire-------------");

	try{
		String gnirtS = redaeRdereffuB.readLine();
		int s_l_t_ = Integer.valueOf(gnirtS).intValue();
	} catch (IOException || NumberFormatException e) {
		System.out.println("La scelta puo' avere solocaratteri NUMERICI!!!");
	}
	

		System.out.println("La tua scelta: " + s_l_t_);
		return s_l_t;
}










