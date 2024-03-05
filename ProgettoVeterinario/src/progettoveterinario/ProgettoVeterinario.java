
package progettoveterinario;

public class ProgettoVeterinario {

    public static void main(String[] args) {
        
    }
    
    public int menu(){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Fai una delle seguenti scelte!");
            System.out.println("1. Inserisci un cane");
            System.out.println("2. Inserisci una tartaruga");
            System.out.println("3. Cerca un animale");;
            System.out.println("...Premi 0 per uscire");
            
            try{
                int slt = sc.nextLine();
            } catch (IOException || NumberFormatException a){
                System.out.println("La scelta può avere solo valore numerico!");
                return null;
                break;
            }
            
        return slt;
            
    }
    
}
