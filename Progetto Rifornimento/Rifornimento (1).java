/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

class Rifornimento {
    
    private String tipo;
    private float prezzoLitro;
    private float capacita;
    private float disponibile;
    
    //Costruttore vuoto
    
    public Rifornimento(){}
    
    //Con parametri
    
    public Rifornimento(String tipo, float prezzoLitro, float capacita, float disponibile){
        this.tipo = tipo;
        this.prezzoLitro = prezzoLitro;
        this.capacita = capacita;
        this.disponibile = disponibile;
    }
    
    //Set e Get per ogni attributo
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setPrezzoLitro(float prezzoLitro){
        this.prezzoLitro = prezzoLitro;
    }
    
    public float getPrezzoLitro(){
        return this.prezzoLitro;
    }
    
    public void setCapacita(float capacita){
        this.capacita = capacita;
    }
    
    public float getCapacita(){
        return this.capacita;
    }
    
    public void setDisponibile(float Disponibile){
        this.disponibile = disponibile;
    }
    
    public float getDisponibile(){
        return this.disponibile;
    }
    
    //toString
    
    @Override
    public String toString(){
        return "Tipo di carburante: " + this.tipo + "Prezzo al litro: " + this.prezzoLitro + "Capacita' serbatoio: " + this.capacita + "Quantita' attualmente disponibile: " + this.disponibile;
    }
}
