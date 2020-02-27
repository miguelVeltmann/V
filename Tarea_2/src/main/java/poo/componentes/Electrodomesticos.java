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
public class Electrodomesticos {
    private int cantidadDeElectrodomesticos;
    private String colorDeElectrodomesticos;
    private String funcionalidadDeElectrodomesticos;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int cantidadDeElectrodomesticos, String colorDeElectrodomesticos, String funcionalidadDeElectrodomesticos) {
        this.cantidadDeElectrodomesticos = cantidadDeElectrodomesticos;
        this.colorDeElectrodomesticos = colorDeElectrodomesticos;
        this.funcionalidadDeElectrodomesticos = funcionalidadDeElectrodomesticos;
    }

    public int getCantidadDeElectrodomesticos() {
        return cantidadDeElectrodomesticos;
    }

    public void setCantidadDeElectrodomesticos(int cantidadDeElectrodomesticos) {
        this.cantidadDeElectrodomesticos = cantidadDeElectrodomesticos;
    }

    public String getColorDeElectrodomesticos() {
        return colorDeElectrodomesticos;
    }

    public void setColorDeElectrodomesticos(String colorDeElectrodomesticos) {
        this.colorDeElectrodomesticos = colorDeElectrodomesticos;
    }

    public String getFuncionalidadDeElectrodomesticos() {
        return funcionalidadDeElectrodomesticos;
    }

    public void setFuncionalidadDeElectrodomesticos(String funcionalidadDeElectrodomesticos) {
        this.funcionalidadDeElectrodomesticos = funcionalidadDeElectrodomesticos;
    }
    
    
    public void mostrarCantidadDeElectrodomesticos(){
        System.out.println("Hay " + this.cantidadDeElectrodomesticos + "electrodomesticos");
    }
    public void mostrarColorDeElectrodomestico(){
        System.out.println("Los electrodomesticos son de color " + colorDeElectrodomesticos);
    }
   
}
