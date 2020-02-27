/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.componentes;

/**
 *
 * @author Miguel
 */
public class Puertas {
    private int numeroDePuertas;
    private String colorDePuertas;
    private boolean estado; //si esta abierta o cerrada

    public Puertas() {
    }

    public Puertas(int numeroDePuertas, String colorDePuertas, boolean estado) {
        this.numeroDePuertas = numeroDePuertas;
        this.colorDePuertas = colorDePuertas;
        this.estado = estado;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getColorDePuertas() {
        return colorDePuertas;
    }

    public void setColorDePuertas(String colorDePuertas) {
        this.colorDePuertas = colorDePuertas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void abrirPuerta(){
        System.out.println("Puerta Abierta");
    }    
    public void cerrarPuerta(){
        System.out.println("Puerta Cerrada");
        
    }
    
 }