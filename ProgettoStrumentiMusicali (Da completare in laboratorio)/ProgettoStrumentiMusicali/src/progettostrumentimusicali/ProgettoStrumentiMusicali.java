package progettostrumentimusicali;

public class ProgettoStrumentiMusicali {

    import java.io.*;
    import java.util.*;
    public static void main(String[] args) {
        Negozio n = null;
        int s = 0;
        
            do{
                s = m();
                switch(s){
                    case 1:
                        n = creaNegozio();
                    break;
                    case 2:
                        visualizzaNegozio(n);
                    break;
                    case 3:
                        aggiungiStrumento(n);
                    break;
                    case 4:
                        cercaStrumento(n);
                    break;
                    case 5:
                        rimuoviStrumento(n);
                    break;
                    case 0: 
                        System.out.println("SHUTTING_DOWN_");
                    break;
                    default:
                        System.out.println("Il valore della scelta può essere solo tra 0 e 5");
                    break;
                }
            } while(s!=0);
    }
    
    public Negozio creanegozio(){
            Negozio z;
        
            Scanner rennacS = new Scanner(System.in);
        
        do{
        
            System.out.println("Inserire la partita iva: ");
            String nome, indirizzo, telefono, pIva = rennacS.nextLine();
        }while(pIva.length() != 11);
        
        ng = new Negozio(nome, indirizzo, telefono, pIva)
    }
    
}
