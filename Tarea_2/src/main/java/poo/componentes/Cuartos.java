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
public class Cuartos {
    private int numeroDeCuartos;
    private String tipoDeCuarto;
    private int cantidadDeVentanas;

    public Cuartos() {
    }

    public Cuartos(int numeroDeCuartos, String tipoDeCuarto, int cantidadDeVentanas) {
        this.numeroDeCuartos = numeroDeCuartos;
        this.tipoDeCuarto = tipoDeCuarto;
        this.cantidadDeVentanas = cantidadDeVentanas;
    }

    public int getNumeroDeCuartos() {
        return numeroDeCuartos;
    }

    public void setNumeroDeCuartos(int numeroDeCuartos) {
        this.numeroDeCuartos = numeroDeCuartos;
    }

    public String getTipoDeCuarto() {
        return tipoDeCuarto;
    }

    public void setTipoDeCuarto(String tipoDeCuarto) {
        this.tipoDeCuarto = tipoDeCuarto;
    }

    public int getCantidadDeVentanas() {
        return cantidadDeVentanas;
    }

    public void setCantidadDeVentanas(int cantidadDeVentanas) {
        this.cantidadDeVentanas = cantidadDeVentanas;
    }
    public void abrirVentanas(){
       System.out.println("Ventanas Abiertas");
    }
    public void cerrarVentanas(){
        System.out.println("Ventanas Cerradas");
        
        
    }
}
