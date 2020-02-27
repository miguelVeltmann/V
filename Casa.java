/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.compuesto;
import poo.componentes.Electrodomesticos;
import poo.componentes.Cuartos;
import poo.componentes.Puertas;
        
       
/**
 *
 * @author Miguel
 */
public class Casa {
    private String coloDeFachada;
    private String tamaño;
    private String ubicacion;
    private Electrodomesticos electronicos;
    private Cuartos habitacion;
    private Puertas puerta;

    public Casa() {
    }

    public Casa(String coloDeFachada, String tamaño, String ubicacion, Electrodomesticos electronicos, Cuartos habitacion, Puertas puerta) {
        this.coloDeFachada = coloDeFachada;
        this.tamaño = tamaño;
        this.ubicacion = ubicacion;
        this.electronicos = electronicos;
        this.habitacion = habitacion;
        this.puerta = puerta;
    }

    public String getColoDeFachada() {
        return coloDeFachada;
    }

    public void setColoDeFachada(String coloDeFachada) {
        this.coloDeFachada = coloDeFachada;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Electrodomesticos getElectronicos() {
        return electronicos;
    }

    public void setElectronicos(Electrodomesticos electronicos) {
        this.electronicos = electronicos;
    }

    public Cuartos getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Cuartos habitacion) {
        this.habitacion = habitacion;
    }

    public Puertas getPuerta() {
        return puerta;
    }

    public void setPuerta(Puertas puerta) {
        this.puerta = puerta;
    }
    
    public void encenderLuces(){
        System.out.println("Luces Encendidas");
    }
    public void tocarTimbre(){
        System.out.println("El timbre esta sonando");
    }    
}

