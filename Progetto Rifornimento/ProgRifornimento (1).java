/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.io.IOException;
import java.lang.NumberFormatException;
import java.io.*;

public class ProgRifornimento {
    
    static final int MAX = 4;
    static Rifornimento[] rifornimento;
    static int numeroCarburanti;
    
    
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    
    
        public void aggiungiNuovoCarburante(){
            if (numeroCarburanti == 0){
                System.out.println("Al momento le cisterne sono tutte vuote. Date tempo ai benzinai di riempirle!");
                return;
            } else {
                System.out.println("Salve. Di cosa possiamo rifornirla?");
                    for(int i = 0; i < numeroCarburanti; i++){
                        System.out.println(rifornimento[i].toString());
                    }
            }
            
            
        }
    
    
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    
    
        public void aggiungiCarburante(){
            BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
       
            if(numeroCarburanti < MAX){
                try{
                    System.out.println("Inserisci il tipo di carburante");
                    String tipo = tastiera.readLine();
                } catch (IOException a) {}    
                try{
                    System.out.println("Inserisci il prezzo al litro");
                    String doubel = tastiera.readLine();
                    float prezzoLitro = Float.valueOf(doubel).floatValue();
                    
                    System.out.println("Inserisci la capacita' del serbatoio di questo carburante");
                    String gnirtS = tastiera.readLine();
                    float capacita = Float.valueOf(gnirtS).floatValue();
                    
                    Ststem.out.println("Inserire la quantita' di carburante attualmente disponibile");
                    String a = tastiera.readLine();
                    float disponibile = Float.valueOf(a).floatValue();
                } catch (IOException || NumberFormatException a){
                    System.out.println("Valore non inserito correttamente");
                }
            }
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
    }
}
