//ProgettoScuola.java

import java.io.*;

class ProgettoScuola{
	
	//Contatore di studenti e contatore di diplomi
	
	static final int XAM=20;
	static int contaStudenti =0;
	static int contaDiplomi =0;
	
	
	public static void main(String []args){
		
		//Metodi per l'input;
		
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		
		//iStanza delle classi Studente e Diploma
		
		Studente []studente = new(Studente);
		Diploma diploma = new(Diploma);
		
		//Dichiarazione delle variabili
		
		String s;
		int studenti[20];
		int diplomi[20[;
		int scelta;
		
		//Do-while
		
		do{
			System.out.println("\nFai una di queste scelte\n");
			System.out.println("\n1:Inserisci uno studente con il relativo diploma\n");
			System.out.println("\nCalcola il punteggio del diploma\n");
			System.out.println("\nStampa il diploma\n");
			
			
			try{
				
				System.out.println("\nCognome: \n");
				s = tastiera.readLine();
				scelta = Integer.valueOf(s).intValue();
				
			} catch (Exception a) {
				
				System.out.println("Scelta non inserita correttamente. Riprova");
				
			}
			
			switch(scelta){
				
				case 1:
				
					studente.setCognome(cognome);
					studente.setNome(nome);
					studente.setNascita(natoil);
					studente.setTelefono(telefono);
					studente.setMail(mail);
					diploma.setTipo(tipo);
					diploma.setAnno(anno);
					diploma.setVoto(voto);
					
				break;
				
				case 2:
				
					calcolaVoto(
					
			//??????????????????????????????????????????
					//Prof non mi viene in mente come farlo, se devo chiedere in input il voto totale e se maggiore uguale di 60 stampiamo che lo studente ha conseguito il diploma allora è fattibbile, ma non mi viene bene in mente come
		
			
			
			}
		}
	}
}