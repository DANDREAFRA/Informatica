import java.io.*;

public class ProgettoSpa {
    static final int MAX_TRATTAMENTI = 100;
    static Trattamento[] trattamenti;
    static int numeroTrattamenti;

    public void visualizzaTrattamenti() {
		if(numeroTrattamenti == 0){
			System.out.println("Nessun trattamento disponibile al momento");
			return;
		}
        System.out.println("Trattamenti disponibili:");
        for (int i = 0; i < numeroTrattamenti; i++) {
            System.out.println(trattamenti[i].toString());
        }
    }


    public void aggiungiTrattamento() {
        if (numeroTrattamenti < MAX_TRATTAMENTI) { //E' ancora presente spazio libero nell'array
            try {
                BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Inserisci il nome del nuovo trattamento: ");
                String nome = tastiera.readLine();

                System.out.print("Inserisci la descrizione del nuovo trattamento: ");
                String descrizione = tastiera.readLine();

                System.out.print("Inserisci il costo del nuovo trattamento: ");
                double costo = Double.parseDouble(tastiera.readLine());
				
				System.out.print("Inserisci la durata del nuovo trattamento: ");
				int durata = Integer.parseInt(tastiera.readLine());
				
                trattamenti[numeroTrattamenti] = new Trattamento(nome, costo, descrizione, durata);
				numeroTrattamenti++;
                System.out.println("Trattamento aggiunto con successo!");
            } catch (IOException | NumberFormatException e) {
                System.out.println("Errore nell'input. Riprova.");
            }
        } else {
            System.out.println("Limite massimo di trattamenti raggiunto. Impossibile aggiungere altri trattamenti.");
        }
    }


    public void applicaScontoInBaseAllEta() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double sconto = 0.0;

		//Visualizza gli sconti disponibili
        System.out.println("Sconti disponibili:");
        System.out.println("1. Sconto del 10% per i clienti minorenni");
        System.out.println("2. Sconto del 5% per i clienti con età maggiore di 18 anni");
		System.out.println("3. Scondo del 15% per i clienti anziani (60 anni +)");
		
		//Visualizza i trattamenti
		visualizzaTrattamenti();

		try {

            //Scegliere il trattamento 
            System.out.print("Scegli un trattamento (inserisci il numero): ");
            int sceltaTrattamento = Integer.parseInt(reader.readLine());

            if (sceltaTrattamento >= 1 && sceltaTrattamento <= numeroTrattamenti) {
					Trattamento trattamentoScelto = trattamenti[sceltaTrattamento - 1];
					//Inserire l'età
		
					System.out.print("Inserisci l'età del cliente: ");
					int eta = Integer.parseInt(reader.readLine());
					if (eta > 0 && eta < 18) {
						sconto = 0.10; // Sconto del 10% per i clienti minorenni
							} else if (eta >= 18 && eta < 60) {
								sconto = 0.05; // Sconto del 5% per i clienti maggiorenni
									} else if (eta >= 60) {
										sconto = 0.15; // Sconto del 15% per i clienti anziani con età uguale o maggiore di 60
											} else if (eta < 0) {
												System.out.println("L'eta' non puo' avere un valore negativo!");
											}
									}
							}
					}
				

					double costoScontato = trattamentoScelto.getCosto() - (trattamentoScelto.getCosto() * sconto);
					//Visualizzare il costo scontato
					System.out.println("Costo scontato del trattamento " + trattamentoScelto.getNome() + ": " + costoScontato + " EUR");
			} else {
                System.out.println("Scelta trattamento non valida.");
				}
			}

        } catch (IOException | NumberFormatException e) {
            System.out.println("Errore nell'input. Riprova.");
        }
    }





// ------------------------------ Metodo per cercare un trattamento per una fascia di prezzo compresa tra un valore minimo e massimo scelti dall'utente (un po come sui negozi online) ------------------------------- 





    public void cercaTrattamentiPerPrezzo() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double minPrezzo, maxPrezzo;
		try {
			//Chiedere all'utente di inserire il valore minimo 
            System.out.print("Inserisci il valore minimo della fascia di prezzo: ");
            minPrezzo = Double.parseDouble(reader.readLine());
			
			//Chiedere all'utente di inserire valore massimo
            System.out.print("Inserisci il valore massimo della fascia di prezzo: ");
            maxPrezzo = Double.parseDouble(reader.readLine());

			//Cercare tramite ciclo for nell'array i trattamenti che rientrano nel range specificato e visualizzarli
            System.out.println("\nTrattamenti nella fascia di prezzo specificata:");
            for (int i = 0; i < numeroTrattamenti; i++) {
                if (trattamenti[i].getCosto() >= minPrezzo && trattamenti[i].getCosto() <= maxPrezzo) {
                    System.out.println(trattamenti[i].toString());
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Errore nell'input. Riprova.");
        }
    }





// -------------------------------- Metodo che mostra le possibili operazioni che l'utente può scegliere. Il tutto racchiuso in un ciclo do-while dal quale si esce nel momento che si digita 0 (In qualsiasi momento) --------------------------------





	public void menuOperazioni() {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		int scelta;
		try {
            
            
                System.out.println("\nMenu Operazioni:");
                System.out.println("1. Visualizza trattamenti disponibili");
                System.out.println("2. Aggiungi nuovo trattamento");
                System.out.println("3. Applica sconto in base all'età");
                System.out.println("4. Cerca trattamenti in una fascia di prezzo");
                System.out.println("0. Esci");

			do {
				
                System.out.print("Inserisci la tua scelta: ");
                scelta = Integer.parseInt(tastiera.readLine());

                switch (scelta) {
                    case 1:
                        visualizzaTrattamenti();
                        break;
                    case 2:
                        aggiungiTrattamento();
                        break;
                    case 3:
                        applicaScontoInBaseAllEta();
                        break;
                    case 4:
                        cercaTrattamentiPerPrezzo();
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
						break;
                }

            } while (scelta != 0);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Errore nell'input. Il programma verrà terminato.");
        }
		if(scelta == 0){
			System.out.println("Grazie per aver utilizzato il Progetto SPA!");
		}
    }




// ------------------------------ Metodo main (Senza questo il programma non può funzionare) ------------------------------





    public static void main(String[] args) {
        trattamenti = new Trattamento[MAX_TRATTAMENTI]; //istanziando l'array dei trattamenti con massimo 100 elementi
        numeroTrattamenti = 0;

        // Inizializza con alcuni trattamenti di esempio
		
        //trattamenti[numeroTrattamenti++] = new Trattamento("Massaggio rilassante", 50.0, "Massaggio per alleviare lo stress");
        //trattamenti[numeroTrattamenti++] = new Trattamento("Trattamento viso", 80.0, "Trattamento per la cura della pelle del viso");
        //trattamenti[numeroTrattamenti++] = new Trattamento("Bagno termale", 70.0, "Immersione in un bagno caldo per il rilassamento");
        //trattamenti[numeroTrattamenti++] = new Trattamento("Sauna", 60.0, "Sauna per eliminare le tossine");
        ProgettoSpa spa = new ProgettoSpa();
        spa.menuOperazioni();
    }
}
